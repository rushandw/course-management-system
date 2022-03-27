package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.LoginDao;
import com.example.model.Users;

@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;
	
	public Users login(String userName, String password) {
		return loginDao.login(userName, password);
	}

}
