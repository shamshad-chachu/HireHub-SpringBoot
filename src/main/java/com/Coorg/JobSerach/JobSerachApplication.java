package com.Coorg.JobSerach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JobSerachApplication {

	public static void main(String[] args) {
	ApplicationContext	context= SpringApplication.run(JobSerachApplication.class, args);
	
	
		
//	Product p2 = context.getBean(Product.class);
//	p2.setId(2);
//	p2.setTitle("B");
//	
//	ProductService repo = context.getBean(ProductService.class);
//	repo.save(p2);
//	
//	Product p3 = context.getBean(Product.class);
//	p3.setId(3);
//	p3.setTitle("C");
	
//	repo.save(p3);
	
//	System.out.println(repo.findAll());
	}

}
