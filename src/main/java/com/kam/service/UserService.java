package com.kam.service;

import java.util.List;

import com.kam.entity.TradeCoupon;

public interface UserService {
 
	List<TradeCoupon> findTradeCoupon();
	int add(TradeCoupon  t);
}
