package com.spring.jpa.assignment2.normalQuestions;

import com.spring.jpa.assignment2.normalQuestions.entities.Employee;
import com.spring.jpa.assignment2.normalQuestions.repos.EmployeeRepository;
import com.spring.jpa.assignment2.normalQuestions.repos.WorkerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Assignment1Application {
    public static void main(String[] args) {


        ApplicationContext applicationContext = SpringApplication.run(Assignment1Application.class, args);

        EmployeeRepository employeeRepository = applicationContext.getBean(EmployeeRepository.class);

//        employeeRepository.save(new Employee("raghav", "gupta", 1000000, 21));
//        employeeRepository.save(new Employee("gunjan", "gupta", 2000000, 22));
//        employeeRepository.save(new Employee("mohit", "gupta", 3000000, 23));
//        employeeRepository.save(new Employee("mukesh", "gupta", 4000000, 24));
//        employeeRepository.save(new Employee("sangeeta", "gupta", 5000000, 25));
//        employeeRepository.save(new Employee("shilpi", "gupta", 6000000, 26));
//        employeeRepository.save(new Employee("mohit", "gupta", 7000000, 27));
//        employeeRepository.save(new Employee("avi", "gupta", 8000000, 28));
//        employeeRepository.save(new Employee("sanchi", "gupta", 9000000, 29));
//        employeeRepository.save(new Employee("bauji", ".", 10000000, 30));
//        employeeRepository.save(new Employee("sandep", "singh", 1000, 55));
//        employeeRepository.save(new Employee("raman", "Singh", 1000, 44));
//        employeeRepository.save(new Employee("sushant", "gopal", 10, 60));

//          view the table.
          employeeRepository.findAllEmployees()
                            .stream()
                            .forEach(e-> System.out.println(e));


//        Question 1 ===========================================
//        List<Object[]> list = employeeRepository.findAllEmployeesBySalaryGreaterThanAvgSalary();
//        for(Object[] obj : list){
//            System.out.println(obj[0] + " - " + obj[1]);
//        }

//        Question 2 ===========================================
//        employeeRepository.updateEmployeeSalary(employeeRepository.findAvgSalary(), 99999999);
//        employeeRepository.findAllEmployees()
//                          .stream()
//                          .forEach(e-> System.out.println(e));


//        Question 3 ===========================================
//        employeeRepository.deleteMinSalaryEmployees(employeeRepository.findMinSalary());
//        employeeRepository.findAllEmployees()
//                .stream()
//                .forEach(e-> System.out.println(e));


//        Question 4
//        List<Object[]> list = employeeRepository.findEmployeesByLastName();
//        for(Object[] obj : list){
//            System.out.println(obj[0] + " - " + obj[1] + " - " + obj[2]);
//        }

//        Question 5
//        employeeRepository.deleteEmployeesBySalary(45);
//        employeeRepository.findAllEmployees()
//                .stream()
//                .forEach(e-> System.out.println(e));



//        Question 9
        WorkerRepository workerRepository = applicationContext.getBean(WorkerRepository.class);
//
//        workerRepository.save(new Worker("raghav", "gupta", 22,
//                new Salary(900000.00d, 100000.0d, 10000.0d, 25000.0d)));
//
//        workerRepository.save(new Worker("gunjan", "gupta", 24,
//                new Salary(700000.00d, 200000.0d, 10000.0d, 2500.0d)));
//
//        workerRepository.save(new Worker("mohit", "gupta", 20,
//                new Salary(500000.00d, 200000.0d, 10000.0d, 21000.0d)));
//
//        workerRepository.save(new Worker("hitesh", "gupta", 26,
//                new Salary(300000.00d, 300000.0d, 10000.0d, 2000.0d)));

//        System.out.println(workerRepository.findById(104).get());
//        System.out.println(workerRepository.findById(105).get());





    }
}
