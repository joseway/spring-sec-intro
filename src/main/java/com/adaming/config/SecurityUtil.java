package com.adaming.config;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class SecurityUtil {
	private static final String SALT = "TresSecurisant";
	
	@Bean
	public static BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));
	}
	@Bean
	public static String randomPassword() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqstuvwxyz0123456789";
		StringBuilder str = new StringBuilder();
		Random rand = new Random();
		while(str.length() < 18) {
			int index = (int)rand.nextFloat() * chars.length();
			str.append(chars.charAt(index));
		}
		return str.toString();
	}
}
