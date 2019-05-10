package com.kam.util.ce;

import java.security.InvalidKeyException;
import java.security.KeyStore.SecretKeyEntry;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class jie {
	
	public static byte[] jiemi(byte[] content, String password) {
		
		try {
			KeyGenerator kgen = KeyGenerator.getInstance("AES");
			kgen.init(128,new SecureRandom(password.getBytes()));
			SecretKey secrekey = kgen.generateKey();
			byte[] encodeformat = secrekey.getEncoded();
			SecretKeySpec key = new SecretKeySpec(encodeformat, "AES");
			try {
				Cipher cipher = Cipher.getInstance("AES");
				try {
					cipher.init(Cipher.DECRYPT_MODE, key);
					byte[] ming;
					try {
						ming = cipher.doFinal(content);
						return ming;
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
			} catch (NoSuchPaddingException e) {
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
