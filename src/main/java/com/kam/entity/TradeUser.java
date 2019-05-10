package com.kam.entity;

import java.util.Date;

public class TradeUser {

	private int userId;
	private String userName;
	private String userPassword;
	private String userMobile;
	private int uesrScore;
	private Date userZhucetime;
	private Double userMoney;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public int getUesrScore() {
		return uesrScore;
	}
	public void setUesrScore(int uesrScore) {
		this.uesrScore = uesrScore;
	}
	public Date getUserZhucetime() {
		return userZhucetime;
	}
	public void setUserZhucetime(Date userZhucetime) {
		this.userZhucetime = userZhucetime;
	}
	public Double getUserMoney() {
		return userMoney;
	}
	public void setUserMoney(Double userMoney) {
		this.userMoney = userMoney;
	}
	public TradeUser(int userId, String userName, String userPassword, String userMobile, int uesrScore,
			Date userZhucetime, Double userMoney) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userMobile = userMobile;
		this.uesrScore = uesrScore;
		this.userZhucetime = userZhucetime;
		this.userMoney = userMoney;
	}
	public TradeUser() {
		super();
	}
	
}
