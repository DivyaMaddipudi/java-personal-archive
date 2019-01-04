package com.learned;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class EncPassword {

	public static void main(String[] args) {
		
		
		EncPassword   one = new EncPassword();
		try {
			one.encryptPassword("hello world");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
	}

	public void encryptPassword(String password) throws NoSuchAlgorithmException {
		String hash = "35454B055CC325EA1AF2126E27707052";
		

		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(password.getBytes());
		byte[] digest = md.digest();
		String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
		
		System.out.println(myHash);

		// assertThat(myHash.equals(hash)).isTrue();
	}
}
