package com.Coorg.JobSerach.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Coorg.JobSerach.Model.AppliedJob;
import com.Coorg.JobSerach.Model.Product;
import com.Coorg.JobSerach.Model.Users;
import com.Coorg.JobSerach.Repo.AppliedRepo;
import com.Coorg.JobSerach.Repo.ProductRepo;
import com.Coorg.JobSerach.Repo.UserRepo;


@Service
public class AppliedService {

	AppliedRepo Arepo;
	UserRepo Urepo;
	ProductRepo Prepo;
	
	public AppliedService(AppliedRepo arepo, UserRepo urepo, ProductRepo prepo) {
		super();
		Arepo = arepo;
		Urepo = urepo;
		Prepo = prepo;
	}




	public List<AppliedJob> getAll(){
		return Arepo.findAll();
	}




	public void apply(int userId, int jobId) {

		System.out.println(userId +":"+ jobId);
		
		Users user = Urepo.findById(userId).orElseThrow(()->new RuntimeException("User Not Found"));
		
		Product product = Prepo.findById(jobId).orElseThrow(()->new RuntimeException("job Not Found"));
		
		AppliedJob appJob = new AppliedJob();
		appJob.setProd(product);
		appJob.setUser(user);
		
		System.out.println(appJob);
		Arepo.save(appJob);
		
	}




	public List<AppliedJob> getJobByUser(int userId) {
		// TODO Auto-generated method stub
		
		return Arepo.findByUserId(userId);
	}
	
	
}
