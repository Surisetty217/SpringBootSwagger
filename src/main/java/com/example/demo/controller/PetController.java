package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pets;
import com.example.demo.repository.PetRepo; 

//Annotation

@RestController
public class PetController {
	
	@Autowired
	private PetRepo repo;
	
	@PostMapping("/addPet")
	public String savePet(@RequestBody Pets pet){ 
        repo.save(pet); 
        
        return "Added Successfully"; 
    } 
	
	@GetMapping("/findAllPets")
	public List<Pets> getPets() { 
        
        return repo.findAll(); 
    } 
  
     
	@DeleteMapping("/delete/{id}") 
    public String deletePet(@PathVariable String id){ 
        repo.deleteById(id); 
        
        return "Deleted Successfully !!!"; 
    } 

}
