package com.xhxc.util;


import java.sql.*;
import java.util.ArrayList;

public class JDBCUtil {
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int executeUpdate(String sql,Object... obj){
        Connection conn=null;
        PreparedStatement pstmt = null;
        int result=0;
        try {
//            连接创建，选择数据库
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ele?useUnicode=true&characterEncoding=utf8","root","1472580369");
//            创建查询窗口
            pstmt= conn.prepareStatement(sql);
//            循环obj进行赋值
            for(int i=0;i<obj.length;i++){
                pstmt.setObject(i+1,obj[i]);
            }
//            写sql
//          语句执行
            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
//            关闭
            try {
                conn.close();
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;


    }


    public static <T> ArrayList<T> executeQuery(String sql, RowMap<T> rowMap, Object... obj){
        Connection conn=null;
        PreparedStatement pstmt = null;
        ArrayList<T> list = new ArrayList<>();
        try {
//            连接创建，选择数据库
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ele?useUnicode=true&characterEncoding=utf8","root","1472580369");
//            创建查询窗口
            pstmt= conn.prepareStatement(sql);
//            循环obj进行赋值
            for(int i=0;i<obj.length;i++){
                pstmt.setObject(i+1,obj[i]);
            }
//            写sql
//          语句执行
            ResultSet rs = pstmt.executeQuery();
//            返回值
            while (rs.next()){
//                循环一次拿一条数据，<T>
//                 resultSet 作为方法参数，返回T类型的数据
                T t=rowMap.rowMapping(rs);
                list.add(t);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
//            关闭
            try {
                conn.close();
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    public static <T> T QueryOne(String sql, RowMap<T> rowMap, Object... obj){
        Connection conn=null;
        PreparedStatement pstmt = null;
        T t =null;
        try {
//            连接创建，选择数据库
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ele?useUnicode=true&characterEncoding=utf8","root","1472580369");
//            创建查询窗口
            pstmt= conn.prepareStatement(sql);
//            循环obj进行赋值
            for(int i=0;i<obj.length;i++){
                pstmt.setObject(i+1,obj[i]);
            }
//            写sql
//          语句执行
            ResultSet rs = pstmt.executeQuery();
//            返回值
            while (rs.next()){
//                循环一次拿一条数据，<T>
//                 resultSet 作为方法参数，返回T类型的数据
                t=rowMap.rowMapping(rs);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
//            关闭
            try {
                conn.close();
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return t;
    }
}
