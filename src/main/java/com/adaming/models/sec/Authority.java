package com.adaming.models.sec;

import java.io.Serializable;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority, Serializable{
	
	private static final long serialVersionUID = -340222315273702447L;
	
	private final String authority;
	
	public Authority(String authority) {
		this.authority = authority;
	}
	@Override
	public String getAuthority() {
		
		return authority;
	}
	
}
