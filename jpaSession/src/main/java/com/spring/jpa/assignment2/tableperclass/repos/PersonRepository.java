package com.spring.jpa.assignment2.tableperclass.repos;


import com.spring.jpa.assignment2.tableperclass.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
