package com.shopping.text;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Encode {

	public static void main(String[] args) {
		if ( args[0] == null ) 
		{
			System.out.println("Enter your username to be encoded.");
			System.exit(1);
		}
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode(args[0]));			
	}
}
