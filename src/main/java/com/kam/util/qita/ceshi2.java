package com.kam.util.qita;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kam.util.rocketmq.Mqconsumer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-rocketmq.xml")
public class ceshi2 {
	@Autowired
     private  Mqconsumer consumer;
	public static void main(String[] args) {
		System.out.println("测试2");
		
	}
}
