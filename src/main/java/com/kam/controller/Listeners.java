package com.kam.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kam.entity.TradeCoupon;
import com.kam.service.UserService;
import com.kam.util.redis.RedisUtils;

public class Listeners implements MessageListenerConcurrently {

	private UserService userService;
	private  RedisUtils redisUtils;
	
	
	
	public RedisUtils getRedisUtils() {
		return redisUtils;
	}
	public void setRedisUtils(RedisUtils redisUtils) {
		this.redisUtils = redisUtils;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
	public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
		// TODO Auto-generated method stub
		for(MessageExt s : msgs) {
			try {
				/*
				 * System.out.println("消费的消息:"+ JSONObject.parse(s.getBody())); TradeCoupon tc
				 * =(TradeCoupon)JSONObject.parse(s.getBody()); JSONObject obj =
				 * JSONObject.parseObject(s.getBody().toString());
				 */
				
				//TradeCoupon tc =(TradeCoupon)JSONObject.parse(s.getBody());
				//TradeCoupon obj = JSONObject.toJavaObject(JSONObject.parseObject(String.valueOf(s.getBody())), TradeCoupon.class);
				TradeCoupon df = show(s.getBody());
				int num = 0;
				if(df!=null) {
					if(userService!=null) {
						if(df!=null && df.getUserId()!=0) {
							redisUtils.put("123", df);
						}
						
						num = userService.add(df);
					}else {
						System.out.println("空的");
					}
					 
				}
				
				System.out.println("消费的消息数量:"+ num);		
			}catch(Exception e) {
				e.printStackTrace();
				return ConsumeConcurrentlyStatus.RECONSUME_LATER;
			}
	
		}
		return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
	}
	public TradeCoupon show(byte[] zu) {
		
       //String zhi =	new String(zu);//.valueOf(zu);
       //System.out.println(zhi);
		try {
			JSONObject oo =JSONObject.parseObject(new String(zu));
			oo.remove("isUsed");
			TradeCoupon obj = JSONObject.
					  toJavaObject(oo,
					  TradeCoupon.class);
			obj.setIsUsed('2');
			return obj;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null; 
		 
	}
	
    
}
