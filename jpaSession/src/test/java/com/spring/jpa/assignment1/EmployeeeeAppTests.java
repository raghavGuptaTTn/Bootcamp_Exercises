package com.spring.jpa.assignment1;


import com.spring.jpa.assignment1.entities.Employeeee;
import com.spring.jpa.assignment1.repos.EmployeeeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLOutput;

@SpringBootTest
public class EmployeeeeAppTests {

    @Autowired
    EmployeeeeRepository repository;

    @Test
    public void contextLoads() {

    }

//  Question 3
//  Perform Create Operation on Entity using Spring Data JPA
    @Test
    public void testCreateEmployee() {

        Employeeee emp = new Employeeee(88, "raghav", 22, "ballabgarh");
        repository.save(emp);
    }


    //  Question 4
    //  Perform Update Operation on Entity using Spring Data JPA

    @Test
    public void testUpdateEmployee() {
        System.out.println("updating employee");
        Employeeee emp = repository.findById(2).get();
        emp.setLocation("france");
        repository.save(emp);
    }

    // Question 5.1
    // Perform Delete Operation on Entity using Spring Data JPA
    @Test
    public void testDeleteEmployee() {

        repository.deleteById(1);
    }

    // Question 5.2
    // Perform Read Operation on Entity using Spring Data JPA
    @Test
    public void testReadEmployee() {

        Employeeee emp = repository.findById(4).get();
        System.out.println("employee found ------>>>>>>");
        System.out.println(emp);
    }

    // Question 6
    // Get the total count of the number of Employees
    @Test
    public void testCountEmployee(){
        System.out.println(repository.count());
    }

}

