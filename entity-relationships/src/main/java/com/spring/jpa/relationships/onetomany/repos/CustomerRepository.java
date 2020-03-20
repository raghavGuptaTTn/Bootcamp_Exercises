package com.spring.jpa.relationships.onetomany.repos;


import com.spring.jpa.relationships.onetomany.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {


}
