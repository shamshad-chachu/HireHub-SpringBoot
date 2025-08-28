package com.Coorg.JobSerach.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Coorg.JobSerach.Model.AppliedJob;



@Repository
public interface AppliedRepo extends JpaRepository<AppliedJob, Long> {

	List<AppliedJob> findByUserId(int userId);

//	List<AppliedJob> findByUserId();

}
