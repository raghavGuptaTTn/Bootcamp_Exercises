package com.spring.jpa.assignment2.normalQuestions.repos;

import com.spring.jpa.assignment2.normalQuestions.entities.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;


public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    @Query("from Employee")
    public List<Employee> findAllEmployees();


    // Question 1
    // Display the first name, last name of all employees having salary greater
    // than average salary ordered in ascending by their age and in descending
    // by their salary.
    @Query("select firstName, lastName from Employee e where e.salary > " +
            "(select avg(salary) from Employee) " +
            "order by age asc, salary desc")
    public List<Object[]> findAllEmployeesBySalaryGreaterThanAvgSalary();


    // Help for question 2
    @Query("select avg(salary) as minsal from Employee")
    public Integer findAvgSalary();


    // Question 2
    // Update salary of all employees by a salary passed as a parameter
    // whose existing salary is less than the average salary.
    @Transactional
    @Modifying
    @Query("update Employee e set e.salary = :newsal where e.salary < :avgSalary")
    public void updateEmployeeSalary(@Param("avgSalary") Integer avgSalary, @Param("newsal") Integer newsal);




    // Help for question 3
    @Query("select min(salary) as minsal from Employee")
    public Integer findMinSalary();


    // Question 3
    // Delete all employees with minimum salary.
    @Transactional
    @Modifying
    @Query("delete from Employee e where e.salary = :minsal")
    public void deleteMinSalaryEmployees(@Param("minsal") Integer minsal);


    // Question 4
    // Display the id, first name, age of all employees where last name ends with "singh"
    @Query(value = "select empId, empFirstName, empAge from employeeTable" +
            " where empLastName like '%singh' ", nativeQuery = true)
    public List<Object[]> findEmployeesByLastName();


    // Question 5
    // Delete all employees with age greater than 45(Should be passed as a parameter)
    @Transactional
    @Modifying
    @Query(value = "delete from employeeTable where empAge > :age", nativeQuery = true)
    public void deleteEmployeesBySalary(@Param("age") Integer age);
}
