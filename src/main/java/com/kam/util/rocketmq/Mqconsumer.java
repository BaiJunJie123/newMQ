package com.kam.util.rocketmq;

import java.util.List;

import javax.annotation.Resource;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.stereotype.Component;

import com.kam.controller.Listeners;

import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
public class Mqconsumer {
	private Listeners listeners;
	
	public Listeners getListeners() {
		return listeners;
	}
	public void setListeners(Listeners listeners) {
		this.listeners = listeners;
	}
	private DefaultMQPushConsumer consumer;
	private String groupName;
	private String namesrvAddr;
	public void init() {
		consumer = new DefaultMQPushConsumer(groupName);
		consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET);
		consumer.setConsumeThreadMax(200);
		consumer.setConsumeThreadMin(10);
		consumer.setNamesrvAddr(namesrvAddr);
		consumer.setConsumeTimeout(5000);
		consumer.setConsumeMessageBatchMaxSize(1);
		try {
			consumer.subscribe("mytopic", "TagB");
		} catch (MQClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		consumer.registerMessageListener(listeners);
		
		
		try {
			consumer.start();
			System.out.println("消费开始");
		} catch (MQClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public DefaultMQPushConsumer getConsumer() {
		return consumer;
	}
	public void setConsumer(DefaultMQPushConsumer consumer) {
		this.consumer = consumer;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getNamesrvAddr() {
		return namesrvAddr;
	}
	public void setNamesrvAddr(String namesrvAddr) {
		this.namesrvAddr = namesrvAddr;
	}
	public Mqconsumer(DefaultMQPushConsumer consumer, String groupName, String namesrvAddr) {
		super();
		this.consumer = consumer;
		this.groupName = groupName;
		this.namesrvAddr = namesrvAddr;
	}
	public Mqconsumer() {
		super();
	}
	
	
	

}
