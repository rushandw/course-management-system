package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Users;

@Repository
public interface LoginRepository extends JpaRepository<Users, Integer> {

	//@Query(value = "select * from users a where a.userName= :userName and password= :password", nativeQuery = true)
	Users findByUserNameAndPassword(String userName,String Password);

}
