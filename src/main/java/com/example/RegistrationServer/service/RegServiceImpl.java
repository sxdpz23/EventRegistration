package com.example.RegistrationServer.service;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.RegistrationServer.models.Users;
import com.example.RegistrationServer.repositories.*;
import com.example.RegistrationServer.entities.*;

public class RegServiceImpl implements RegService {
	
	@Autowired
	private URepository repo;
	
	@Autowired
	private TempRepository tRepo;
	
	@Autowired
	private OtpRepository oRepo;
	
	@Autowired
	private EventRepository eRepo;
	
	

	@Override
	public Users getUserDetails(Users user) {
		RegisteredUsers regUser = repo.findByEmail(user.getEmail());
		if(regUser==null) 
			registerTempUser(user);
		return null;
	}

	@Override
	public int verifyOtp(String code, String email) {
		Otp otp = oRepo.findByEmail(email);
		if(otp.getCode().equals(code)) {
			RegisteredUsers regUser = repo.findByEmail(email);
			if(regUser==null) {
				Temp tempUser = tRepo.findByEmail(email);
				Users user = new Users(0, tempUser.getName(), tempUser.getEmail(), tempUser.getPhone(), tempUser.getCity(), tempUser.getGrade(), tempUser.getState(), tempUser.getSchool());
				return registerNewUser(user);
			} else 
			return regUser.getId();
		} else return 0;
	}
	
	@Override
	public int registerNewUser(Users user) {
		Temp tempUser = tRepo.findByEmail(user.getEmail());
		if(tempUser!=null) {
			repo.save(new RegisteredUsers(0, user.getName(), user.getEmail(), user.getPhone(), user.getCity(), user.getGrade(), user.getState(), user.getSchool()));
			return getUserDetails(user).getId();
		} else return 0;
	}

	@Override
	public void registerNewEvent(int userId) {
		// need to add current date/time here
		LocalDate date = LocalDate.now();
		RegisteredUsers regUser = repo.findById(userId);
		if(regUser!=null) {
			eRepo.save(new EventRegistration(userId, date));
		}
	}

	@Override
	public void registerTempUser(Users user) {
		tRepo.save(new Temp(user.getName(), user.getEmail(), user.getPhone(), user.getCity(), user.getGrade(), user.getState(), user.getSchool()));
	}

}
