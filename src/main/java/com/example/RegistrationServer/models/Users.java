package com.example.RegistrationServer.models;

public class Users {
	
	private int id;

	private String name;
	
	private String email;
	
	private long phone;
	
	private int grade;
	
	private String city, state, school;
	
	public Users(int id, String name, String email, long phone, String city, int grade, String state, String school ) {
		setId(id);
		setName(name);
		setEmail(email);
		setPhone(phone);
		setCity(city);
		setGrade(grade);
		setState(state);
		setSchool(school);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
