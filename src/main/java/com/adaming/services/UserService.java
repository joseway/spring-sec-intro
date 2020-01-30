package com.adaming.services;

import java.util.List;
import java.util.Set;

import com.adaming.models.User;
import com.adaming.models.sec.UserRole;

public interface UserService {

	public User findByUsername(String username);
	public User findByEmail(String email);
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	public User findById(Long id);
	public List<User> findAll();
}
