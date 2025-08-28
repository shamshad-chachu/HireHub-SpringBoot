package com.Coorg.JobSerach.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Coorg.JobSerach.Model.Users;
import com.Coorg.JobSerach.Repo.UserRepo;

@Service
public class UserService {
	
	UserRepo repo;
	
	
	
	public UserService(UserRepo repo) {
		super();
		this.repo = repo;
	}



	public void addUser(Users user) {
		System.out.println(user+"in service class");
		repo.save(user);
	}
	
	public List<Users> getAll(){
		
		return repo.findAll();
	}



	public void deleteUser(int userID) {
		
		repo.deleteById(userID); ;
	}



	public void update(int userId, Users user) {
		
		Users existingUser = repo.findById(userId).orElse(new Users());
		existingUser.setUname(user.getUname());
		existingUser.setPass(user.getPass());
		
		repo.save(existingUser);
		
	}
	
	

}
