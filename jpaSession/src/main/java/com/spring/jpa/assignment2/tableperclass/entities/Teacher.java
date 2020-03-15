package com.spring.jpa.assignment2.tableperclass.entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Teacher extends Person {

    private Integer salary;

    public Teacher() {
    }

    public Teacher(String name, Integer age, String gender, Integer salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public Integer getsalary() {
        return salary;
    }

    public void setsalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "salary=" + salary +
                '}';
    }
}
