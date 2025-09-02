package com.Coorg.JobSerach.Model.Login;

public class Login {
	
	private String usernameOrEmail;
	private String password;
	
	
	public String getUsernameOrEmail() {
		return usernameOrEmail;
	}
	public void setUsernameOrEmail(String usernameOrEmail) {
		this.usernameOrEmail = usernameOrEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Login [usernameOrEmail=" + usernameOrEmail + ", password=" + password + "]";
	}

}
