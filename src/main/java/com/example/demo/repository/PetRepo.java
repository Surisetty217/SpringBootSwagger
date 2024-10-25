package com.example.demo.repository;

import com.example.demo.model.Pets; 
import org.springframework.data.mongodb.repository.MongoRepository; 

public interface PetRepo extends MongoRepository<Pets, String> { 
	
}