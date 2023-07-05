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

   /* public ArrayList<Goods> getGoodsByFatherLabel(){
        return JDBCUtil.executeQuery("select * from goods where parent_id = 0 and active=1", new RowMap<Goods>() {
            @Override
            public Goods rowMapping(ResultSet rs) {
                Goods goods = new Goods();
                try {
                    goods.setGoodsId(rs.getInt("goods_id"));
                    goods.setGoodsName(rs.getString("goodsname"));
                    goods.setFatherLabel(rs.getString("fatherlabel"));
                    goods.setGoodsDes(rs.getString("goods_des"));
                    goods.setSonLabel(rs.getString("sonlabel"));
                    goods.setSeller(rs.getString("seller"));
                    goods.setPrice(rs.getInt("price"));
                    goods.setActive(rs.getInt("active"));
//                    goods.setImg(rs.getString("img"));
                    goods.setCreateTime(rs.getDate("create_time"));
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
    public Goods getOneById(int goodsId){
        return JDBCUtil.QueryOne("select * from goods where goods_id=?", new RowMap<Goods>() {
            @Override
            public Goods rowMapping(ResultSet rs) {
                Goods goods = new Goods();
                try {
                    int goodsId = rs.getInt("goods_id");
                    String goodsName = rs.getString("goodsname");
                    String fatherLabel = rs.getString("fatherlabel");
                    int price = rs.getInt("price");
                    String goodsDes = rs.getString("goods_des");
                    String sonLabel = rs.getString("sonlabel");
                    String seller = rs.getString("seller");
                    int active = rs.getInt("active");
                    String img = rs.getString("img");
                    Date date = rs.getDate("create_time");
                    goods.setGoodsId(goodsId);
                    goods.setGoodsName(goodsName);
                    goods.setFatherLabel(fatherLabel);
                    goods.setGoodsDes(goodsDes);
                    goods.setSonLabel(sonLabel);
                    goods.setSeller(seller);
                    goods.setPrice(price);
                    goods.setActive(active);
                    // goods.setImg(img);
                    goods.setCreateTime(date);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return goods;
            }
        }, goodsId);
    }

    public int update(Goods goods){
        return JDBCUtil.executeUpdate("update goods set goods_des=?,goodsname=?,fatherlabel=?,sonlabel=?,price=? where goods_id=?",
                goods.getGoodsDes(),goods.getGoodsName(),goods.getFatherLabel(),goods.getSonLabel(),goods.getPrice());
    }
    public int del(int goodsId){
        return JDBCUtil.executeUpdate("update goods set active=0 where goods_id=?",goodsId);
    }
    */
}
