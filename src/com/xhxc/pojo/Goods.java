package com.xhxc.pojo;

import java.util.Date;

public class Goods {
    private int goodsId;
    private String goodsName;
    private String fatherLabel;
    private String goodsDes;
    private String sonLabel;
    private String sellerId;
    private int price;
    private int active;
    private String img;
    private Date createTime;


    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getFatherLabel() {
        return fatherLabel;
    }

    public void setFatherLabel(String fatherLabel) {
        this.fatherLabel = fatherLabel;
    }

    public String getGoodsDes() {
        return goodsDes;
    }

    public void setGoodsDes(String goodsDes) {
        this.goodsDes = goodsDes;
    }

    public String getSonLabel() {
        return sonLabel;
    }

    public void setSonLabel(String sonLabel) {
        this.sonLabel = sonLabel;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", fatherLabel='" + fatherLabel + '\'' +
                ", goodsDes='" + goodsDes + '\'' +
                ", sonLabel='" + sonLabel + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", price=" + price +
                ", active=" + active +
                ", img='" + img + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
