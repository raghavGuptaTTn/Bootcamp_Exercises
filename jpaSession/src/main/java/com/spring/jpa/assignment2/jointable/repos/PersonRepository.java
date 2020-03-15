package com.spring.jpa.assignment2.jointable.repos;


import com.spring.jpa.assignment2.jointable.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
