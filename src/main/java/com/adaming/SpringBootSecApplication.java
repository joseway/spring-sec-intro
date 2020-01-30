package com.adaming;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adaming.config.SecurityUtil;
import com.adaming.models.User;
import com.adaming.models.sec.Role;
import com.adaming.models.sec.UserRole;
import com.adaming.services.UserService;

@SpringBootApplication
public class SpringBootSecApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User();
		u1.setEmail("mike@mike.com");
		u1.setEnabled(true);
		u1.setFirstName("Mike");
		u1.setLastName("Pompeo");
		u1.setPassword(SecurityUtil.passwordEncoder().encode("pass1"));
		u1.setUsername("mike");
		Set<UserRole> ur = new HashSet<UserRole>();
		Role r1 = new Role();
		r1.setName("ROLE_USER");
		ur.add(new UserRole(u1, r1));
		userService.createUser(u1, ur);
		ur.clear();
		
		User u2 = new User();
		u2.setEmail("joe@mike.com");
		u2.setEnabled(true);
		u2.setFirstName("Joe");
		u2.setLastName("Trump");
		u2.setPassword(SecurityUtil.passwordEncoder().encode("pass1"));
		u2.setUsername("joe");
		Set<UserRole> ur2 = new HashSet<UserRole>();
		Role r2 = new Role();
		r2.setName("ROLE_ADMIN");
		ur2.add(new UserRole(u2, r2));
		userService.createUser(u2, ur2);
		ur2.clear();
		
	}
}
