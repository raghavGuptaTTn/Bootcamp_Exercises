package com.spring.jpa.JPA3assignment.normalQuestions.repos;

import com.spring.jpa.JPA3assignment.normalQuestions.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {


}
