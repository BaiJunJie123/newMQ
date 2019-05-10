package com.kam.entity;

public class TradePay {

	private int payId;
	private int orderId;
	private Double payMoney;
	private char isPaid;
	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Double getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(Double payMoney) {
		this.payMoney = payMoney;
	}
	public char getIsPaid() {
		return isPaid;
	}
	public void setIsPaid(char isPaid) {
		this.isPaid = isPaid;
	}
	public TradePay(int payId, int orderId, Double payMoney, char isPaid) {
		super();
		this.payId = payId;
		this.orderId = orderId;
		this.payMoney = payMoney;
		this.isPaid = isPaid;
	}
	public TradePay() {
		super();
	}
	
}
