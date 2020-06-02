package com.demo.mvvmdemo.model;

import java.io.Serializable;

/**
 * @projectName：MvvmDemo
 * @createTime：2020/6/2 20:57
 * @author：chihuo
 * @company：
 * @e-mail：
 * @description：黄金价格实体类
 */
public class ShgoldEntity implements Serializable {
    private String type;//品种代号
    private String typename;//品种名称
    private String price;//最新价
    private String openingprice;//开盘价
    private String maxprice;//最高价
    private String minprice;//最低价
    private String changepercent;//涨跌幅
    private String lastclosingprice;//昨收盘价
    private String tradeamount;//总成交量
    private String updatetime;//更新时间

    public String getType() {
        return "品种代号：" + type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypename() {
        return "品种名称：" + typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getPrice() {
        return "最新价：" + price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOpeningprice() {
        return "开盘价：" + openingprice;
    }

    public void setOpeningprice(String openingprice) {
        this.openingprice = openingprice;
    }

    public String getMaxprice() {
        return "最高价：" + maxprice;
    }

    public void setMaxprice(String maxprice) {
        this.maxprice = maxprice;
    }

    public String getMinprice() {
        return "最低价：" + minprice;
    }

    public void setMinprice(String minprice) {
        this.minprice = minprice;
    }

    public String getChangepercent() {
        return "涨跌幅：" + changepercent;
    }

    public void setChangepercent(String changepercent) {
        this.changepercent = changepercent;
    }

    public String getLastclosingprice() {
        return "昨收盘价：" + lastclosingprice;
    }

    public void setLastclosingprice(String lastclosingprice) {
        this.lastclosingprice = lastclosingprice;
    }

    public String getTradeamount() {
        return "总成交量：" + tradeamount;
    }

    public void setTradeamount(String tradeamount) {
        this.tradeamount = tradeamount;
    }

    public String getUpdatetime() {
        return "更新时间：" + updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
}
