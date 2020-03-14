package com.spring.jpa.assignment2.singletable.repos;

import com.spring.jpa.assignment2.singletable.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
