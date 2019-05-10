package com.kam.util.rocketmq;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

public class Mqproducer {
    
	private DefaultMQProducer producer;
	private String groupName;
	private String namesrvAddr;
	private int maxMessageSize = 1024*1024*4;
	private int sendMsgTimeout = 1000;
	
	public void init() throws Exception {
		if(groupName.isEmpty()) {
			throw new Exception("group is null");
		}
		if(namesrvAddr.isEmpty()) {
			throw new Exception("namesrvAddr is null");
		}
		this.producer = new DefaultMQProducer(this.groupName);
		this.producer.setNamesrvAddr(this.namesrvAddr);
		this.producer.setMaxMessageSize(this.maxMessageSize);
		this.producer.setSendMsgTimeout(this.sendMsgTimeout);
		try {
			this.producer.start();
			System.out.println("发送者发送启动");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
   public SendResult sendMessage(String topic,String tags,String keys,String MessageTest) {
	   Message message = new Message(topic,tags,keys,MessageTest.getBytes());
	   SendResult data = null;
	   try {
		   
	     data = this.producer.send(message);
	     System.out.println(MessageTest+":发送的消息");
	     //this.producer.shutdown();
	} catch (MQClientException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemotingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (MQBrokerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return data;
   }
public DefaultMQProducer getProducer() {
	return producer;
}
public void setProducer(DefaultMQProducer producer) {
	this.producer = producer;
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
public int getMaxMessageSize() {
	return maxMessageSize;
}
public void setMaxMessageSize(int maxMessageSize) {
	this.maxMessageSize = maxMessageSize;
}
public int getSendMsgTimeout() {
	return sendMsgTimeout;
}
public void setSendMsgTimeout(int sendMsgTimeout) {
	this.sendMsgTimeout = sendMsgTimeout;
}
public Mqproducer(DefaultMQProducer producer, String groupName, String namesrvAddr, int maxMessageSize,
		int sendMsgTimeout) {
	super();
	this.producer = producer;
	this.groupName = groupName;
	this.namesrvAddr = namesrvAddr;
	this.maxMessageSize = maxMessageSize;
	this.sendMsgTimeout = sendMsgTimeout;
}
public Mqproducer() {
	super();
}
   
	
	
}
