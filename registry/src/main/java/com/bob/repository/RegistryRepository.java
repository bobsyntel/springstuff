package com.bob.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bob.model.Student;

@Repository
public interface RegistryRepository extends CrudRepository<Student,Long>{
	List<Student> findall();
	Student findOne(Long id);

}
