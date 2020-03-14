package com.spring.jpa.assignment2.tableperclass;

import com.spring.jpa.assignment2.tableperclass.entities.Student;
import com.spring.jpa.assignment2.tableperclass.entities.Teacher;
import com.spring.jpa.assignment2.tableperclass.repos.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(MainApp.class, args);

        PersonRepository personRepository = applicationContext.getBean(PersonRepository.class);

//        personRepository.save(new Teacher("raghav", 22, "male", 25000));
//        personRepository.save(new Teacher("john", 21, "female", 28000));
//        personRepository.save(new Student("james", 28, "female", 6600));
//        personRepository.save(new Student("shyam", 16, "male", 2500));
//
//        System.out.println(personRepository.findAll());
    }
}
