package com.kam.entity;

import java.util.Date;

public class TradeUserMoneyLog {

	private int userId;
	private int orderId;
	private char moneyLogType;
	private Double userMoney;
	private Date createTime;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public char getMoneyLogType() {
		return moneyLogType;
	}
	public void setMoneyLogType(char moneyLogType) {
		this.moneyLogType = moneyLogType;
	}
	public Double getUserMoney() {
		return userMoney;
	}
	public void setUserMoney(Double userMoney) {
		this.userMoney = userMoney;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public TradeUserMoneyLog(int userId, int orderId, char moneyLogType, Double userMoney, Date createTime) {
		super();
		this.userId = userId;
		this.orderId = orderId;
		this.moneyLogType = moneyLogType;
		this.userMoney = userMoney;
		this.createTime = createTime;
	}
	public TradeUserMoneyLog() {
		super();
	}
	
}
