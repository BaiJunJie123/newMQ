package com.kam.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.kam.entity.TradeCoupon;
import com.kam.service.UserService;
import com.kam.service.impl.UserServiceImpl;
import com.kam.util.redis.RedisUtils;
import com.kam.util.rocketmq.Mqproducer;

@Controller
public class UserController {
	@Resource
	private UserService userService;
    @Resource
	private RedisUtils redisUtils;
	
	  @Autowired
	  private Mqproducer mqproducer;
	 
    @RequestMapping("kam.html")
	public String show() {
    	if(userService!=null) {
    		System.out.println("controller 不时空");
    	}
		/*
		 * if(redisTemplate!=null) { System.out.println("是空的"); }else {
		 * System.out.println("redisTemplate不是空的"); }
		 */
    	List<TradeCoupon> ji = new ArrayList<TradeCoupon>();// userServiceImpl.findTradeCoupon();
    	//Message mess = new Message();
    	TradeCoupon t1 = new TradeCoupon();
    	t1.setCouponId(2);
    	t1.setCouponPrice(22.2);
    	t1.setIsUsed('2');
    	t1.setOrderId(2);
    	t1.setUsedTime(new Date());
    	TradeCoupon t2 = new TradeCoupon();
    	t2.setCouponId(3);
    	t2.setCouponPrice(33.2);
    	t2.setIsUsed('3');
    	t2.setOrderId(3);
    	t2.setUsedTime(new Date());
    	TradeCoupon t3 = new TradeCoupon();
    	t3.setCouponId(4);
    	t3.setCouponPrice(44.2);
    	t3.setIsUsed('4');
    	t3.setOrderId(4);
    	t3.setUsedTime(new Date());
    	ji.add(t1);
    	ji.add(t2);
    	ji.add(t3);
    	//mess.setBody(ji.get(0).toString().getBytes());
		
		  for(TradeCoupon t : ji) {
			  SendResult red = this.mqproducer.sendMessage("mytopic", "TagB", new Date().toString(), JSONObject.toJSONString(t)); //mqproducer.sendMessage("mytopic", "TagA", newDate().toString(),"".getBytes()); System.out.println("发送的消息为:"+red); }
		  }
    	//userService.add(t1);
		  redisUtils.put("123", "agvdsf");
		 Object dd = redisUtils.get("123");
		
		 System.out.println(dd);
    	// this.mqproducer.getProducer().shutdown();
		return "aaa";
	}

}
