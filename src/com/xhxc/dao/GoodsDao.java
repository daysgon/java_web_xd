package com.xhxc.dao;

import com.xhxc.pojo.Goods;
import com.xhxc.util.JDBCUtil;
import com.xhxc.util.RowMap;


import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GoodsDao {
    public ArrayList<Goods> getAll(){
        return JDBCUtil.executeQuery("select * from goods", new RowMap<Goods>() {
            @Override
            public Goods rowMapping(ResultSet rs) {
                Goods goods = new Goods();
                try {
                    goods.setId(rs.getInt("id"));
                    goods.setPrice(rs.getDouble("price"));
                    goods.setStore(rs.getInt("store"));
                    goods.setActive(rs.getInt("active"));
                    goods.setHid(rs.getInt("hid"));
                    goods.setMessage(rs.getString("message"));
                    goods.setGoodsname(rs.getString("goodsname"));
                    goods.setUid(rs.getInt("uid"));
                    goods.setImg(rs.getString("img"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return goods;
            }
        });
    }


   public int add(Goods p) {
       return JDBCUtil.executeUpdate("insert into goods(goodsname,price,store,img,hid,uid,active,message) values(?,?,?,?,?,?,?,?)",
               p.getGoodsname(),p.getPrice(),p.getStore(),p.getImg(),p.getHid(),p.getUid(),p.getActive(),p.getMessage());




   }

    //    根据id查一个
    public Goods getById(int id){
        return JDBCUtil.QueryOne("select * from goods where id=?", new RowMap<Goods>() {
            @Override
            public Goods rowMapping(ResultSet rs) {
                Goods goods = new Goods();
                try {
                    goods.setId(rs.getInt("id"));
                    goods.setPrice(rs.getDouble("price"));
                    goods.setStore(rs.getInt("store"));
                    goods.setActive(rs.getInt("active"));
                    goods.setHid(rs.getInt("hid"));
                    goods.setMessage(rs.getString("message"));
                    goods.setGoodsname(rs.getString("goodsname"));
                    goods.setUid(rs.getInt("uid"));
                    goods.setImg(rs.getString("img"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return goods;
            }
        }, id);
    }

    public int update(Goods goods){
        return JDBCUtil.executeUpdate("update goods set goodsname=?,message=?,img=?,store=?,price=?,hid=?,uid=?,active=? where id=?",
                goods.getGoodsname(),goods.getMessage(),goods.getImg(),goods.getStore(),goods.getPrice(),goods.getHid(),goods.getUid(),goods.getActive(),goods.getId());
    }
    public int del(int id){
        return JDBCUtil.executeUpdate("update goods set active=0 where id=?",id);
    }

}
