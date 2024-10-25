package com.example.demo.model;

//Importing required classes 
import lombok.AllArgsConstructor; 
import lombok.Data; 
import lombok.NoArgsConstructor; 
import org.springframework.data.annotation.Id; 
import org.springframework.data.mongodb.core.mapping.Document;


//Annotations 
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "pet") 

public class Pets {
	
	// Attributes	
	@Id
	private String id;
	private String type;	
	private String name;
	
	public Pets(String type, String name) {
		super();
		this.type=type;
		this.name=name;
		
	}
	
    public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
