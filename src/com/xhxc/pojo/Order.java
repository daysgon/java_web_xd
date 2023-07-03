package com.xhxc.pojo;

import java.util.Date;

public class Order {
    private int order_id;
    private int purchaser_id;
    private int good_id;
    private String good_name;
    private int seller_id;
    private String seller_name;
    private double price;
    private int amount;
    private Date create_time;
    private String address;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getCreate_8itime() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getPurchaser_id() {
        return purchaser_id;
    }

    public void setPurchaser_id(int purchaser_id) {
        this.purchaser_id = purchaser_id;
    }

    public int getGood_id() {
        return good_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public String getGood_name() {
        return good_name;
    }

    public void setGood_name(String good_name) {
        this.good_name = good_name;
    }

    public int getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", purchaser_id=" + purchaser_id +
                ", good_id=" + good_id +
                ", good_name='" + good_name + '\'' +
                ", seller_id=" + seller_id +
                ", seller_name='" + seller_name + '\'' +
                ", price=" + price +
                '}';
    }
}
