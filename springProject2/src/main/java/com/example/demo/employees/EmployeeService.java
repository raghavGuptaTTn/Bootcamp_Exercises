package com.example.demo.employees;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class EmployeeService {

    private static List<Employee> employeeList = new ArrayList<>();
    private static Integer empCount = 0;

    static {
        employeeList.add(new Employee(1, "raghav", 22));
        employeeList.add(new Employee(2, "mohit", 20));
        employeeList.add(new Employee(3, "john", 24));
        employeeList.add(new Employee(4, "thomas", 26));
    }

    public List<Employee> findAll() {
        return employeeList;
    }

    public Employee findById(Integer id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id)
                return emp;
        }
        return null;
    }

    public Employee saveNew(Employee emp) {
        if (emp.getId() == null)
            emp.setId(empCount++);
        employeeList.add(emp);
        return emp;
    }

    public Employee deleteById(Integer id) {

        Iterator<Employee> it = employeeList.iterator();

        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getId() == id) {
                it.remove();
                return emp;
            }
        }
        return null;
    }

    public void updateEmployee(Integer id, Employee empNew){


        for(Employee emp : employeeList){
            if(id.equals(emp.getId()))
            {
                emp.setAge(empNew.getAge());
                emp.setName(empNew.getName());
            }
        }
    }
}
