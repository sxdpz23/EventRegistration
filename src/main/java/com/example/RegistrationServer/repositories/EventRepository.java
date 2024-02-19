package com.example.RegistrationServer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RegistrationServer.entities.EventRegistration;

public interface EventRepository extends JpaRepository<EventRegistration, Integer> {
	
	EventRegistration findById(int id);

}
