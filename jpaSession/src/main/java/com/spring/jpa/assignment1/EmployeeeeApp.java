package com.spring.jpa.assignment1;


import com.spring.jpa.assignment1.entities.Employeeee;
import com.spring.jpa.assignment1.repos.EmployeeeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@SpringBootApplication
public class EmployeeeeApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(EmployeeeeApp.class, args);

        EmployeeeeRepository repo = applicationContext.getBean(EmployeeeeRepository.class);

//        repo.save( new Employeeee(1, "john", 22, "london"));
//        repo.save( new Employeeee(2, "james", 23, "paris"));
//        repo.save( new Employeeee(3, "williams", 24, "new york"));
//        repo.save( new Employeeee(4, "thomas", 27, "dubai"));
//        repo.save( new Employeeee(5, "saint", 12, "thailand"));
//        repo.save( new Employeeee(6, "parry", 25, "hong kong"));
//        repo.save( new Employeeee(7, "john", 29, "iran"));

//        Question 7
//        Implement Pagination and Sorting on the bases of Employee Age
//          Pageable pageable = PageRequest.of(1,3, Sort.by("age").descending());
//          Page<Employeeee> employeeees = repo.findAll(pageable);
//          employeeees.forEach(e-> System.out.println(e));

//        Question 8
//        repo.findByName("john")
//                .forEach(e-> System.out.println(e));

//        Question 9
//        repo.findByNameLike("J%")
//                .forEach(e-> System.out.println(e));

//        Question 10
//        repo.findByAgeBetween(25, 30)
//                .forEach(e-> System.out.println(e));


    }
}
