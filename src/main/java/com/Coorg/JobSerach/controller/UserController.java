package com.Coorg.JobSerach.controller;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Coorg.JobSerach.Model.Users;
import com.Coorg.JobSerach.Model.Login.*;
import com.Coorg.JobSerach.Service.UserService;



@RestController
@CrossOrigin
@RequestMapping("/User")
public class UserController {
	
	UserService serv;
	
	
	
	public UserController(UserService serv) {
		super();
		this.serv = serv;
	}

	@RequestMapping("/")
	public String welcome() {
		return "hello user";
	}
	
	
	@PostMapping("/Login")
	public ResponseEntity<?> Login(@RequestBody Login user){
		
//		System.out.println(user);
		
		return serv.login(user);
		
	}
	
	@GetMapping("/GetAll")
	public List<Users> getAll(){
		
		return serv.getAll();
	}
	
	@PostMapping("/Register")
	
	public void AddUser(@RequestBody Users user) {
		
		serv.addUser(user);
	}
	
	@DeleteMapping("/Delete/{userId}")
	public void deleteUser(@PathVariable int userId){
		System.out.println("deleted,"+userId);
		serv.deleteUser(userId);
	}
	
	@PutMapping("/Update/{userId}")
	public void updateUser(@PathVariable int userId,@RequestBody Users user) {
		
		serv.update(userId,user);
	}
}
