package com.spring.jpa.JPA3assignment.onetomany.repos;

import com.spring.jpa.JPA3assignment.onetomany.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {


}
