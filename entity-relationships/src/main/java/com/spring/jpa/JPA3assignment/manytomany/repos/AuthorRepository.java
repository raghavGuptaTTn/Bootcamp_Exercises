package com.spring.jpa.JPA3assignment.manytomany.repos;

import com.spring.jpa.JPA3assignment.manytomany.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {


}
