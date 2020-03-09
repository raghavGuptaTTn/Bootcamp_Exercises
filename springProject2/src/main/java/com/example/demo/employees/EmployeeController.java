package com.example.demo.employees;

import com.example.demo.exception.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public List<Employee> retrieveAllEmployees(){
        return service.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee retrieveEmployee(@PathVariable Integer id){

        Employee emp = service.findById(id);
        if(emp==null)
            throw new EmployeeNotFoundException("id - "+id + " resource not found");

        return emp;
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        Employee delEmp = service.deleteById(id);
        if(delEmp == null)
            throw new EmployeeNotFoundException("id - "+id + " resource not found");

    }

    @PostMapping("/employees")
    public ResponseEntity<Object> addEmployee(@Valid @RequestBody Employee emp){
        Employee savedEmp = service.saveNew(emp);

        URI location = ServletUriComponentsBuilder
                        .fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(savedEmp.getId())
                        .toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping("/employees/{id}")
    public void updateEmployee(@PathVariable Integer id, @Valid @RequestBody Employee emp){

        Employee savedEmp = service.findById(id);

        if(emp.getId() == null)
            emp.setId(id);

        if(savedEmp == null)
            service.saveNew(emp);

        else{
            service.updateEmployee(id, emp);
        }

    }
}
