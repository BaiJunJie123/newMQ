package com.kam.util.ce;

import java.security.SecureRandom;

import javax.crypto.NoSuchPaddingException;

import com.kam.util.ce.one.nei;

public class two extends one {
   
	
	
	 public  class nei{
		   public void show() {
			   System.out.println("我是被布雷2");
		   }
	   }
	
	
	public static void main(String[] args) {
		
		/*
		 * one o = new two(); one.nei n = o.new nei(); n.show();
		 */
		/*
		 * String zhi = "abc"; SecureRandom dd =new SecureRandom(); byte[] zu = new
		 * byte[30]; dd.nextBytes(zu); System.out.println(zu.toString());
		 */
		
	    String count = "美女 约吗";
	    String pass = "bjj";
	    try {
			byte[] jisa = jia.jiami(count, pass);
			System.out.println("加密后:"+new String(jisa));
			byte[] jiemis = jie.jiemi(jisa, pass);
			System.out.println("解密后:"+new String(jiemis));
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}
}
