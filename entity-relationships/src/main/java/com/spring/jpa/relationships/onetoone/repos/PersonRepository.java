package com.spring.jpa.relationships.onetoone.repos;

import com.spring.jpa.relationships.onetoone.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
