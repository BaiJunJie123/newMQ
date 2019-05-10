package com.kam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kam.entity.TradeCoupon;

public interface UserDao {

	List<TradeCoupon> findTradeCoupon();
	
	int add(@Param("t") TradeCoupon  t);
}
