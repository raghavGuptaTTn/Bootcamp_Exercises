package com.spring.jpa.JPA3assignment.onetoone.repos;

import com.spring.jpa.JPA3assignment.onetoone.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {


}
