package com.spring.jpa.JPA3assignment.onetoone.repos;

import com.spring.jpa.JPA3assignment.onetoone.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
