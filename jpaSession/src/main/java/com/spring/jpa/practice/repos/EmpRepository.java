package com.spring.jpa.practice.repos;

import com.spring.jpa.practice.entities.Emp;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepository extends CrudRepository<Emp, Integer> {

}
