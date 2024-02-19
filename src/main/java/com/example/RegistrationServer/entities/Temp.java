package com.example.RegistrationServer.entities;

import jakarta.persistence.*;

@Entity
public class Temp {
	private String name;
	
	@Id
	private String email;
	
	private long phone;
	
	private int grade;
	
	private String city, state, school;
	
	public Temp(String name, String email, long phone, String city, int grade, String state, String school ) {
		setName(name);
		setEmail(email);
		setPhone(phone);
		setCity(city);
		setGrade(grade);
		setState(state);
		setSchool(school);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}
