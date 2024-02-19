package com.example.RegistrationServer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RegistrationServer.entities.Otp;

public interface OtpRepository extends JpaRepository<Otp, Integer> {
	
	Otp findByEmail(String email);

}
