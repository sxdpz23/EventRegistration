package com.example.RegistrationServer.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
public class EventRegistration {
	@Id
	private int userId;
	
	private LocalDate date;
	
	public EventRegistration(int userId , LocalDate date) {
		setUserId(userId);
		setDate(date);
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
