package com.Coorg.JobSerach.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class AppliedJob {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long appliId;
	
	@ManyToOne
	private Users user;
	
	@ManyToOne
	private Product prod;
	
	

	public AppliedJob() {
		super();
	}
	

	public AppliedJob(Long appliId, Users user, Product prod) {
		super();
		this.appliId = appliId;
		this.user = user;
		this.prod = prod;
	}

	

	public Long getAppliId() {
		return appliId;
	}

	public void setAppliId(Long appliId) {
		this.appliId = appliId;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}


	@Override
	public String toString() {
		return "AppliedJob [appliId=" + appliId + ", user=" + user + ", prod=" + prod + "]";
	}
	
	
	
}
