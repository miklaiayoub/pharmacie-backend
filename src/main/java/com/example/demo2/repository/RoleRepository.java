package com.example.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.entity.Role;

public interface RoleRepository  extends JpaRepository<Role, Integer>{
	Role findById(int id);
}
