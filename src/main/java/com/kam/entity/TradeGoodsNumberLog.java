package com.kam.entity;

import java.util.Date;

public class TradeGoodsNumberLog {
	
	private int goodsId;
	private int orderId;
	private int goodsNumber;
	private Date logTime;
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getGoodsNumber() {
		return goodsNumber;
	}
	public void setGoodsNumber(int goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	public Date getLogTime() {
		return logTime;
	}
	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}
	public TradeGoodsNumberLog(int goodsId, int orderId, int goodsNumber, Date logTime) {
		super();
		this.goodsId = goodsId;
		this.orderId = orderId;
		this.goodsNumber = goodsNumber;
		this.logTime = logTime;
	}
	public TradeGoodsNumberLog() {
		super();
	}
	
}
