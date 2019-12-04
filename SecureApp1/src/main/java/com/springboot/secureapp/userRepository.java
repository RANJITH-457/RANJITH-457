package com.springboot.secureapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository  extends  JpaRepository<User, Long>{
	org.apache.catalina.User findByUsername(String username);
	
}
