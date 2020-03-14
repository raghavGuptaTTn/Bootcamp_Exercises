package com.spring.jpa.assignment2.singletable.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("student")
public class Student extends Person{

    private Integer fees;

    public Student() {
    }

    public Student(String name, Integer age, String gender, Integer fees) {
        super(name, age, gender);
        this.fees = fees;
    }

    public Integer getFees() {
        return fees;
    }

    public void setFees(Integer fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "fees=" + fees +
                '}';
    }
}
