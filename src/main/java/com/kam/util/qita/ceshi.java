package com.kam.util.qita;

import org.apache.log4j.chainsaw.Main;
import org.apache.rocketmq.client.producer.SendResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kam.util.rocketmq.Mqproducer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-rocketmq.xml")
public class ceshi {
	@Autowired
	private  Mqproducer mqproducer;
	@Test
	public  void mains() {
		for(int i=0;i<10;i++) {
			 SendResult red =	this.mqproducer.sendMessage("mytopic", "TagA", "1"+i, "我是白俊杰");
			   System.out.println(red);
		}
		this.mqproducer.getProducer().shutdown();
		
	}
	
}
