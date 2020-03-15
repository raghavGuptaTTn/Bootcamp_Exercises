package com.spring.jpa.session.repos;

import com.spring.jpa.session.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{



}
