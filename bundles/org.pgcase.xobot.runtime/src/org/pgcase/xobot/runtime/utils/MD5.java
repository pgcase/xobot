package org.pgcase.xobot.runtime.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	
	
	public static BigInteger md5Custom(String st) throws NoSuchAlgorithmException {
		
	    byte[] digest = new byte[0];
 
	    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
	    messageDigest.reset();
        messageDigest.update(st.getBytes());
        digest = messageDigest.digest();
	   
	    return new BigInteger(1, digest);
	    
	}
}
