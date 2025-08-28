package com.Coorg.JobSerach.Model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String uname;
	private long pass;
	
	
	
	
	public Users() {
		super();
	}
	public Users(int id, String uname, long pass) {
		super();
		this.id = id;
		this.uname = uname;
		this.pass = pass;
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
	public long getPass() {
		return pass;
	}
	public void setPass(long pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", uname=" + uname + ", pass=" + pass + "]";
	}
	

}
