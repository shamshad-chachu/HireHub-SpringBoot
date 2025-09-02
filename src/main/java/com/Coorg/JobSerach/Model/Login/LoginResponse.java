package com.Coorg.JobSerach.Model.Login;

import com.Coorg.JobSerach.Model.Users;


public class LoginResponse {
	
	private String message;
	private Users user;
	
	public LoginResponse(String message, Users user) {
		super();
		this.message = message;
		this.user = user;
	}
	
	public LoginResponse() {
		super();
	}
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "LoginResponse [message=" + message + ", user=" + user + "]";
	}
	

}
