package com.kam.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kam.dao.UserDao;
import com.kam.entity.TradeCoupon;
import com.kam.service.UserService;
@Service(value="UserServiceImpl")
public class UserServiceImpl implements UserService {
     @Resource
     private UserDao userDao;
     
	
	@Override
	public List<TradeCoupon> findTradeCoupon() {
		// TODO Auto-generated method stub
		return userDao.findTradeCoupon();
	}


	@Override
	public int add(TradeCoupon t) {
		// TODO Auto-generated method stub
		return userDao.add(t);
	}

}
