package com.spring.jpa.assignment2.jointable.entities;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
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
