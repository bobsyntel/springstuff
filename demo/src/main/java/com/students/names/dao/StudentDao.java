package com.students.names.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class StudentDao {
	private ArrayList<String>  studentNames = new ArrayList<String>(); 
	
	
	public StudentDao() {

		 studentNames.add("Bryant");
		  studentNames.add("Donell");
		  studentNames.add("Bob");
		  studentNames.add("Dario");
	}
	
	
	
	 
	 public ArrayList<String> getNames(){
		
		 return studentNames;
	 }
	

}
