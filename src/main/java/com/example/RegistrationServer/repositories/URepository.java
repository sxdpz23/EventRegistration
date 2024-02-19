package com.example.RegistrationServer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RegistrationServer.entities.RegisteredUsers;

public interface URepository extends JpaRepository<RegisteredUsers, Integer> {
	
	RegisteredUsers findByEmail(String email);
	
	RegisteredUsers findById(int id);

}
