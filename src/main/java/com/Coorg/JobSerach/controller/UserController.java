package com.Coorg.JobSerach.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
import com.Coorg.JobSerach.Service.UserService;

import jakarta.websocket.server.PathParam;

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
	
	@GetMapping("/GetAll")
	public List<Users> getAll(){
		
		return serv.getAll();
	}
	
	@PostMapping("/Add")
	
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
