package com.example.RegistrationServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.RegistrationServer.models.Users;
import com.example.RegistrationServer.service.RegService;

@RestController
@RequestMapping(value= "")
public class RegisterImpl implements Register {
	
	@Autowired
	private RegService service;
	
	@Override
	@GetMapping(value = "/check")
	public ResponseEntity<Boolean> checkUserExists(@RequestBody Users user) {
		boolean result = service.getUserDetails(user) == null ? false : true;
		return new ResponseEntity<Boolean>(result, HttpStatus.OK);
	}

	@Override
	@PutMapping(value = "/verify/{otp}/{email}")
	public ResponseEntity<Integer> verifyOTPforUser(@PathVariable("otp") String otp, @PathVariable("email") String email) {
		int result = service.verifyOtp(otp, email);
		return new ResponseEntity<Integer>(result, HttpStatus.OK);
	}

	@Override
	@PostMapping(value = "/register/{userId}")
	public void createNewEvent(@PathVariable("userId") int userId) {
		service.registerNewEvent(userId);
	}

}
