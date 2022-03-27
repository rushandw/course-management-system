package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Users;
import com.example.repository.LoginRepository;

@Component
public class LoginDao {

	@Autowired
	private LoginRepository loginRepository;

	public Users login(String userName, String password) {
		return loginRepository.findByUserNameAndPassword(userName,password);
	}

}
