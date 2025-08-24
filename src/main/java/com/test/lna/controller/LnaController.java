package com.test.lna.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.lna.model.login.LoginRequest;
import com.test.lna.model.login.LoginResponse;

@RestController
public class LnaController {

	@PostMapping("/login")
	public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest userDtls) {
		LoginResponse response = new LoginResponse();
		response.setMessage("Login Success");
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}