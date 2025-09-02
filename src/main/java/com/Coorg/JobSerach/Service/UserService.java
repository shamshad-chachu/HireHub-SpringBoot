package com.Coorg.JobSerach.Service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Coorg.JobSerach.Model.Users;
import com.Coorg.JobSerach.Model.Login.Login;
import com.Coorg.JobSerach.Model.Login.LoginResponse;
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
		existingUser.setEmail(user.getEmail());
		
		repo.save(existingUser);
		
	}
	
	public ResponseEntity<?> login(Login user) {
		String password = user.getPassword();
		Users existingUser = repo.findUserByUnameOrEmail(user.getUsernameOrEmail(),user.getUsernameOrEmail()); 
		System.out.println(existingUser.getPass().equals(password));
		if(existingUser != null && existingUser.getPass().equals(user.getPassword())) {
			LoginResponse response = new LoginResponse("login successfull",existingUser);
			
			return ResponseEntity.ok(response);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("user not found");
		}
		
	}
	
	

}
