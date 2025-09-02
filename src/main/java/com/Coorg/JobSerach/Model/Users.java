package com.Coorg.JobSerach.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String uname;
	private String pass;
	
	
	
	
	public Users() {
		super();
	}
	public Users(int id, String uname, String pass,String email) {
		super();
		this.id = id;
		this.uname = uname;
		this.pass = pass;
		this.email = email;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", email=" + email + ", uname=" + uname + ", pass=" + pass + "]";
	}
	
	
	

}
