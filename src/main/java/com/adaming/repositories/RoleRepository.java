package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adaming.models.sec.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	public Role findByName(String name);
}
