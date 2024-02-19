package com.example.RegistrationServer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RegistrationServer.entities.*;

public interface TempRepository extends JpaRepository<Temp, Integer> {
	
	Temp findByEmail(String email);

}
