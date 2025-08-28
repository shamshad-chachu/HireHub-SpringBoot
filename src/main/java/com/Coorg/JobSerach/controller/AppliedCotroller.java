package com.Coorg.JobSerach.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Coorg.JobSerach.Model.AppliedJob;
import com.Coorg.JobSerach.Service.AppliedService;



@RestController
@RequestMapping("/Applied")
public class AppliedCotroller {
	
	AppliedService service;
	
	
	
	public AppliedCotroller(AppliedService service) {
		super();
		this.service = service;
	}



	@GetMapping("/GetAll")
	public List<AppliedJob> getAll(){
		return service.getAll();
	}
	
	@PostMapping("/Apply/{UserId}/{JobId}")
	public void apply(@PathVariable int UserId,@PathVariable int JobId) {
		
		service.apply(UserId,JobId);
	}
	
	@GetMapping("GetAllbyUser/{UserId}")
	public List<AppliedJob> getByUserId(@PathVariable int UserId){
		return service.getJobByUser(UserId);
	}
	

}
