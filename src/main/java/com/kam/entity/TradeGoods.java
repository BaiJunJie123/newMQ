package com.kam.entity;

import java.util.Date;

public class TradeGoods {

	private int goodsId;
	private String goodsName;
	private int goodsNumber;
	private Double goodsPrice;
	private String goodsDesc;
	private Date addtime;
	
	public TradeGoods(int goodsId, String goodsName, int goodsNumber, Double goodsPrice, String goodsDesc,
			Date addtime) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsNumber = goodsNumber;
		this.goodsPrice = goodsPrice;
		this.goodsDesc = goodsDesc;
		this.addtime = addtime;
	}

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

	public int getGoodsNumber() {
		return goodsNumber;
	}

	public void setGoodsNumber(int goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	public Double getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public TradeGoods() {
		super();
	}
	
}
