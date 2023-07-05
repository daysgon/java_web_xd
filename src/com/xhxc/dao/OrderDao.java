package com.xhxc.dao;


import com.xhxc.pojo.Order;
import com.xhxc.util.JDBCUtil;
import com.xhxc.util.RowMap;


import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDao {


    public ArrayList<Order> getGoodsByPurcherId(int id){
        return JDBCUtil.executeQuery("select * from Order where purchaser_id = ?", new RowMap<Order>() {
            @Override
            public Order rowMapping(ResultSet rs) {
                Order order = new Order();
                try {
                    int order_id=rs.getInt("order_id");
                    int purchaser_id = rs.getInt("purchaser_id");
                    int good_id = rs.getInt("good_id");
                    String good_name = rs.getString("good_name");
                    int seller_id = rs.getInt("seller_id");
                    String seller_name = rs.getString("seller_name");
                    double price=rs.getDouble("price");
                    int amount = rs.getInt("amount");
                    Date create_time = rs.getDate("create_time");
                    String address=rs.getString("address");
                    order.setOrderId(order_id);
                    order.setPurchaserId(purchaser_id);
                    order.setGoodId(good_id);
                    order.setGoodName(good_name);
                    order.setSellerId(seller_id);
                    order.setSellerName(seller_name);
                    order.setPrice(price);
                    order.setAmount(amount);
                    order.setCreateTime(create_time);
                    order.setAddress(address);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return order;
            }
        },id);
    }

    public int add(Order order){
        return JDBCUtil.executeUpdate("insert into orders(order_id,purchaser_id,good_id,good_name,seller_id,seller_name,price,amount,create_time,address) values(?,?,?,?,?,?,?,?,now(),?)"
                ,order.getOrderId(),order.getPurchaserId(),order.getGoodId(),order.getGoodName(),order.getSellerId(),order.getSellerName(),order.getSellerName(),order.getPrice(),order.getPrice(),order.getAmount(),order.getAddress());
    }


    public int update(Order order){
        return JDBCUtil.executeUpdate("update orders set amount=?,address=?,where id=?",
               order.getAmount(),order.getAddress(),order.getOrderId());
    }
    //删除订单
    public int delete(int id){
        return JDBCUtil.executeUpdate("delete from orders where id=?",
                id);
    }

}
