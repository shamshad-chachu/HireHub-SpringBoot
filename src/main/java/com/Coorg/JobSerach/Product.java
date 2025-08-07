package com.Coorg.JobSerach;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;

@Entity
@Component
@Scope("prototype")
public class Product {
	@jakarta.persistence.Id
	private int id;
	private String title;
	private String loc;
	private int exp;
	private String des;
	
	
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
