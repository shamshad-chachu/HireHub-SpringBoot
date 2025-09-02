package com.Coorg.JobSerach.Service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Coorg.JobSerach.Model.Product;
import com.Coorg.JobSerach.Repo.ProductRepo;

@Service
public class ProductService {
	
	ProductRepo repo;
	
	public ProductService(ProductRepo repo) {
		super();
		this.repo = repo;
	}

	
	
	
	
	public void save(Product data) {
		//added
		System.out.println(data);
		
		try {
			repo.save(data);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}	
	}
	
	public List<Product> findAll(){
		System.out.println("hi");
		return repo.findAll();
		
	}
	
	public void deleteJob(int job_id) {
		// TODO Auto-generated method stub
		repo.deleteById(job_id);
		
	}
}
