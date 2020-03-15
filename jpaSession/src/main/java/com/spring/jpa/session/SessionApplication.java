package com.spring.jpa.session;

import com.spring.jpa.session.entities.*;
import com.spring.jpa.session.repos.EmployeeRepository;
import com.spring.jpa.session.repos.ProductRepository;
import com.spring.jpa.session.repos.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EntityScan("com.spring.jpa.session.entities")
public class SessionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SessionApplication.class, args);

//		StudentRepository studentRepository = applicationContext.getBean(StudentRepository.class);
//
//		studentRepository.save(new Student(1l, "raghva", "gupta", 100));
//		studentRepository.save(new Student(2l, "gunjan", "gupta", 150));
//		studentRepository.save(new Student(3l, "mohit", "gupta", 200));
//		studentRepository.save(new Student(4l, "manoj", "gupta", 250));
//		studentRepository.delEmp();

//		System.out.println(studentRepository.findAllStudents(PageRequest.of(0,4, Sort.by("score"))));
//		System.out.println(studentRepository.findAllStudents(PageRequest.of(0,4, Sort.by(Sort.Order.desc("score")))));
//		List<Object[]> list = studentRepository.findAllStudentsByName("gunjan");
//		for(Object[] object : list){
//			System.out.println(object[0]);
//
//		}

//		studentRepository.delEmp();

//		System.out.println(studentRepository.findAllStudents());


//		====================address=========================================================================
//		=============================================================================================

//		EmployeeRepository employeeRepository = applicationContext.getBean(EmployeeRepository.class);

//		employeeRepository.save(new TraineeEmployee("raghav", 150000000, new Address("77", "ballabgarh"), 100));
//		employeeRepository.save(new RegularEmployee("gunjan", 600000, new Address("99", "boston") , "tata sky"));

//		System.out.println(employeeRepository.findById(1).get());
//		System.out.println(employeeRepository.findById(2).get());


// 		========================================== product repository ================================

		ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

//		productRepository.save(new Product("apple", "to eat", 100d));
//		productRepository.save(new Product("mango", "to eat", 60d));
//		productRepository.save(new Product("banana", "to eat", 70d));
//		productRepository.save(new Product("pineapple", "to eat", 10d));

//		productRepository.deleteAll();

		System.out.println(productRepository.existsById(161));
//		System.out.println(productRepository.existsById(168));


	}
}
