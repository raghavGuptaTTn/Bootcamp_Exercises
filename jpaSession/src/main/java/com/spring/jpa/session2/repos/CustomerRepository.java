package com.spring.jpa.session2.repos;

import com.spring.jpa.session2.entities.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Long> {


}
