package com.Coorg.JobSerach;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://hire-hub-swart.vercel.app/")
@RestController()
public class ProductController {
	@Autowired
	ProductService service;
	

	@GetMapping("/")
	public  String getMethodName() {
		System.out.println("success");
		return "wilcom to Backend";
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
			return ResponseEntity.ok(Products);
		}
		catch(Exception e) {
			return ResponseEntity.internalServerError().body(Map.of("error",e.getMessage()));
		}
	}
	
	@PostMapping("/employee")
	public ResponseEntity<?> newData(@RequestBody Product data) {
		
		System.out.println(data);

		service.save(data);
		
		return ResponseEntity.ok().body(Map.of("message:","Form submitted successfull"));
			
	}
	
	
	
	
	
}
