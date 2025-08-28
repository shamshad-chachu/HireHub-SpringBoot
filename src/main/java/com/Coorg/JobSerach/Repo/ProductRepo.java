package com.Coorg.JobSerach.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Coorg.JobSerach.Model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}
