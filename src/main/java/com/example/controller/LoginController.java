package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Users;
import com.example.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/login")
	public ResponseEntity<Users> login(@RequestBody Users request) {
		Users users = loginService.login(request.getUserName(), request.getPassword());

		ResponseEntity<Users> entity = new ResponseEntity<Users>(users, HttpStatus.OK);
		return entity;

	}

}
