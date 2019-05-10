package com.kam.entity;

import java.util.Date;

public class TradeCoupon {
 
	private int couponId;
	private Double couponPrice;
	private int userId;
	private int orderId;
	private char isUsed;
	private Date usedTime;
	
	public TradeCoupon(int couponId, Double couponPrice, int userId, int orderId, char isUsed, Date usedTime) {
		super();
		this.couponId = couponId;
		this.couponPrice = couponPrice;
		this.userId = userId;
		this.orderId = orderId;
		this.isUsed = isUsed;
		this.usedTime = usedTime;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public Double getCouponPrice() {
		return couponPrice;
	}

	public void setCouponPrice(Double couponPrice) {
		this.couponPrice = couponPrice;
	}

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

	public char getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(char isUsed) {
		this.isUsed = isUsed;
	}

	public Date getUsedTime() {
		return usedTime;
	}

	public void setUsedTime(Date usedTime) {
		this.usedTime = usedTime;
	}

	public TradeCoupon() {
		super();
	}
	
}
