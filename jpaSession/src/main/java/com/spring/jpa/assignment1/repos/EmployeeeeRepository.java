package com.spring.jpa.assignment1.repos;

import com.spring.jpa.assignment1.entities.Employeeee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface EmployeeeeRepository extends PagingAndSortingRepository<Employeeee, Integer> {


//  Create and use finder to find Employee by Name
    List<Employeeee> findByName(String name);

//  Create and use finder to find Employees starting with A character
    List<Employeeee> findByNameLike(String pattern);

//  Create and use finder to find Employees Between the age of 28 to 32
    List<Employeeee> findByAgeBetween(Integer low, Integer high);





}
