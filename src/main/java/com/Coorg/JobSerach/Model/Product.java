package com.Coorg.JobSerach.Model;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String loc;
	private int exp;
	private String des;
	
	
	
	public Product() {
		super();
	}
	
	public Product(int id, String title, String loc, int exp, String des) {
		super();
		this.id = id;
		this.title = title;
		this.loc = loc;
		this.exp = exp;
		this.des = des;
	}

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", loc=" + loc + ", exp=" + exp + ", des=" + des + "]";
	}


	
	
	
	
	
	
	

}
