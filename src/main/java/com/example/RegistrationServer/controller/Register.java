package com.example.RegistrationServer.controller;

import org.springframework.http.ResponseEntity;

import com.example.RegistrationServer.models.Users;

public interface Register {
	
	public ResponseEntity<Boolean> checkUserExists(Users user); 
	
	public ResponseEntity<Integer> verifyOTPforUser(String otp, String email);
	
	public void createNewEvent(int userId);

}
