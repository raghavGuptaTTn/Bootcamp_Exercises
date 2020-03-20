package com.spring.jpa.JPA3assignment.onetomanybidirectional.repos;

import com.spring.jpa.JPA3assignment.onetomanybidirectional.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {


}
