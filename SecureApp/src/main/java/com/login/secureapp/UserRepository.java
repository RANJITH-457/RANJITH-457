package com.login.secureapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query(value="select * loginusers where username=:username",nativeQuery = true)
	User findByUsername(@Param("username")String username);
}
