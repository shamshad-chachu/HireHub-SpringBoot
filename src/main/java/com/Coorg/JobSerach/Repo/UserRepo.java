package com.Coorg.JobSerach.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Coorg.JobSerach.Model.Users;


public interface UserRepo extends JpaRepository<Users,Integer> {

}
