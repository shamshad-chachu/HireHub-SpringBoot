package com.Coorg.JobSerach;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
	@Autowired
	Product p ;
	
	
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
		return repo.findAll();
		
	}
}
