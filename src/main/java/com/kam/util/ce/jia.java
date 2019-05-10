package com.kam.util.ce;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class jia {

	public static byte[]  jiami(String content,String password) throws NoSuchPaddingException {
		
		try {
			KeyGenerator kgen = KeyGenerator.getInstance("AES");
			kgen.init(128, new SecureRandom(password.getBytes()));
			SecretKey secretKey = kgen.generateKey();
			byte[] mi = secretKey.getEncoded();
			SecretKeySpec key = new SecretKeySpec(mi,"AES");
			//创建密码器
			Cipher cipher = Cipher.getInstance("AES");
			byte[] byteconenet = content.getBytes();
			try {
				cipher.init(Cipher.ENCRYPT_MODE, key);
				try {
					byte[] xn = cipher.doFinal(byteconenet);
					return xn;
				} catch (IllegalBlockSizeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BadPaddingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (InvalidKeyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
