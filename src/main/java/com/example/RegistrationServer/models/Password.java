package com.example.RegistrationServer.models;

public class Password {
	private String code;
	private String email;
	
	public Password(String code, String email) {
		setCode(code);
		setEmail(email);
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
