package com.Coorg.JobSerach.Model;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int experience;
	@JsonProperty("openings")
	private int No_openings;
	private String title;
	@JsonProperty("companyName")
	private String Company_name;
	private String location;
	@Column(name = "des", length = 500)
	@JsonProperty("description")
	private String des;
	
	
	public Product() {
		super();
	}
	
	



	public Product(int id, int experience, int no_openings, String title, String company_name, String location,
			String des) {
		super();
		this.id = id;
		this.experience = experience;
		No_openings = no_openings;
		this.title = title;
		Company_name = company_name;
		this.location = location;
		this.des = des;
	}





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public int getNo_openings() {
		return No_openings;
	}


	public void setNo_openings(int no_openings) {
		No_openings = no_openings;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCompany_name() {
		return Company_name;
	}


	public void setCompany_name(String company_name) {
		Company_name = company_name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getDes() {
		return des;
	}


	public void setDes(String des) {
		this.des = des;
	}





	@Override
	public String toString() {
		return "Product [id=" + id + ", experience=" + experience + ", No_openings=" + No_openings + ", title=" + title
				+ ", Company_name=" + Company_name + ", location=" + location + ", des=" + des + "]";
	}


	

	

	
	



	
	
	
	
	
	
	

}
