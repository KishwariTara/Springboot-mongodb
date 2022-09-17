package com.example.springbootmongocrud.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	private Long id;
	private String title;
	private String description;
	private String createdBy;
	private String assignedTo;
	private String completedOn;
	private String status;
	
	

}
