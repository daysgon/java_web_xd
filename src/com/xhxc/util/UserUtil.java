package com.xhxc.util;

import com.xhxc.pojo.User;

import java.sql.*;

public class UserUtil {
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void addEnd(String sql,Object... obj){
        Connection conn=null;
        PreparedStatement pstmt = null;
        try {
//            连接创建，选择数据库
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ele?useUnicode=true&characterEncoding=utf8","root","554723889");
//            创建查询窗口
            pstmt= conn.prepareStatement(sql);
//            循环obj进行赋值
            for(int i=0;i<obj.length;i++){
                pstmt.setObject(i+1,obj[i]);
            }
//            写sql
//          语句执行
            int i = pstmt.executeUpdate();
//            返回值
            System.out.println(i);


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


    }


    public static <T> void getEnd(String sql, RowMap<T> rowMap, Object... obj){
        Connection conn=null;
        PreparedStatement pstmt = null;
        try {
//            连接创建，选择数据库
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ele?useUnicode=true&characterEncoding=utf8","root","554723889");
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
                System.out.println(t);
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


    }

    public static void get(String sql,Object... obj){
        Connection conn=null;
        PreparedStatement pstmt = null;
        try {
//            连接创建，选择数据库
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ele?useUnicode=true&characterEncoding=utf8","root","554723889");
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
//                取出当前的一条数据
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                int active = rs.getInt("active");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                int role = rs.getInt("role");
                String address = rs.getString("address");
                User user = new User();
                user.setId(id);
                user.setUsername(username);
                user.setPassword(password);
                user.setEmail(email);
                user.setRole(role);
                user.setActive(active);
                user.setPhone(phone);
                user.setAddress(address);
//                数据库中，表中一条数据，就是一个用户的信息
//                java中如何表示一个用户的信息   一个对象
//                表===》java中的类  表中字段名和类中的属性名和数据类型保持一致--》实体类 pojo
//                表中的一条数据 对应java中的一个对象
                System.out.println(user);
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


    }
}
