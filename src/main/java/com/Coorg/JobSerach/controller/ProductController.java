package com.Coorg.JobSerach.controller;



import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Coorg.JobSerach.Model.Product;
import com.Coorg.JobSerach.Service.ProductService;

@RestController()
@CrossOrigin
@RequestMapping("/Job")
public class ProductController {
	
	ProductService service;
	

	public ProductController(ProductService service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public  String getMethodName() {
		System.out.println("success");
		return "wilcom to Backend everyone";
	}
	
//	@GetMapping("/findAll")
//	public List<Product> FindAll() {
//		
//		return service.findAll();		
//	}
	
	@GetMapping("/findAll")
	public ResponseEntity<?> FindAll() {
		
		try {
			List<Product> Products = service.findAll();	
			System.out.println(Products);
			return ResponseEntity.ok(Products);
		}
		catch(Exception e) {
			return ResponseEntity.internalServerError().body(Map.of("error",e.getMessage()));
		}
	}
	
	@PostMapping("/JobPost")
	public ResponseEntity<?> newData(@RequestBody Product data) {
		
		System.out.println(data);

		service.save(data);
		
		return ResponseEntity.ok().body(Map.of("message:","Form submitted successfull"));
			
	}
	
	
	
	
	
}
