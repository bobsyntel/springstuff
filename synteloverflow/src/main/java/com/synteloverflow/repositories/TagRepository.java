package com.synteloverflow.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.synteloverflow.models.Tag;



@Repository
public interface TagRepository extends CrudRepository<Tag,Long> {
  List<Tag> findAll();
  Tag findBySubject(String name);
  
 // @Query("SELECT t FROM Tag t WHERE t.subject=:subject")
  //Tag fetchSubject(@Param("subject") String subject);
}
