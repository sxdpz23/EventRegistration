package com.example.RegistrationServer.service;

import com.example.RegistrationServer.models.Users;

public interface RegService {
	
	public Users getUserDetails(Users user);
	
	public int verifyOtp(String code, String email);
	
	public void registerTempUser(Users user);
	
	public int registerNewUser(Users user);
	
	public void registerNewEvent(int userId);

}
