package com.kam.entity;

import java.util.Date;

public class TradeOrder {

	private int orderId;
	private int userId;
	private char orderStatus;
	private char payStatus;
	private char shipping;
	private String address;
	private String shouhuoren;
	private int goodsId;
	private int goodsNumber;
	private Double goodsPrice;
	private Double goodsZongjia;
	private Double shipingFee;
	private int couponId;
	private Double couponPaid;
	private Double moneyPaid;
	private Double payAmout;
	private Date addTime;
	private Date confirmTime;
	private Date payTime;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public char getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(char orderStatus) {
		this.orderStatus = orderStatus;
	}
	public char getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(char payStatus) {
		this.payStatus = payStatus;
	}
	public char getShipping() {
		return shipping;
	}
	public void setShipping(char shipping) {
		this.shipping = shipping;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getShouhuoren() {
		return shouhuoren;
	}
	public void setShouhuoren(String shouhuoren) {
		this.shouhuoren = shouhuoren;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
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
	public Double getGoodsZongjia() {
		return goodsZongjia;
	}
	public void setGoodsZongjia(Double goodsZongjia) {
		this.goodsZongjia = goodsZongjia;
	}
	public Double getShipingFee() {
		return shipingFee;
	}
	public void setShipingFee(Double shipingFee) {
		this.shipingFee = shipingFee;
	}
	public int getCouponId() {
		return couponId;
	}
	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}
	public Double getCouponPaid() {
		return couponPaid;
	}
	public void setCouponPaid(Double couponPaid) {
		this.couponPaid = couponPaid;
	}
	public Double getMoneyPaid() {
		return moneyPaid;
	}
	public void setMoneyPaid(Double moneyPaid) {
		this.moneyPaid = moneyPaid;
	}
	public Double getPayAmout() {
		return payAmout;
	}
	public void setPayAmout(Double payAmout) {
		this.payAmout = payAmout;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public Date getConfirmTime() {
		return confirmTime;
	}
	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public TradeOrder(int orderId, int userId, char orderStatus, char payStatus, char shipping, String address,
			String shouhuoren, int goodsId, int goodsNumber, Double goodsPrice, Double goodsZongjia, Double shipingFee,
			int couponId, Double couponPaid, Double moneyPaid, Double payAmout, Date addTime, Date confirmTime,
			Date payTime) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.orderStatus = orderStatus;
		this.payStatus = payStatus;
		this.shipping = shipping;
		this.address = address;
		this.shouhuoren = shouhuoren;
		this.goodsId = goodsId;
		this.goodsNumber = goodsNumber;
		this.goodsPrice = goodsPrice;
		this.goodsZongjia = goodsZongjia;
		this.shipingFee = shipingFee;
		this.couponId = couponId;
		this.couponPaid = couponPaid;
		this.moneyPaid = moneyPaid;
		this.payAmout = payAmout;
		this.addTime = addTime;
		this.confirmTime = confirmTime;
		this.payTime = payTime;
	}
	public TradeOrder() {
		super();
	}
	
	
}
