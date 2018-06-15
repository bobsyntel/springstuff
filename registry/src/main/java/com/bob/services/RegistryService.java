package com.bob.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bob.model.Student;
import com.bob.repository.RegistryRepository;

@Service
public class RegistryService {
	
	@Autowired
	private RegistryRepository regRepo;
	
	public void create(Student student) {
		regRepo.save(student);
	}
	
	public List<Student> allStudents(){
		return regRepo.findall();
	}
	public Student findStudent(Long id) {
		return regRepo.findOne(id);
	}

}
