package com.spring.jpa.session.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue("regular-employee")

@PrimaryKeyJoinColumn(name = "id")
public class RegularEmployee extends Employee{

    private String project;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public RegularEmployee() {
    }

    public RegularEmployee(String name, int salary, Address address, String project) {
        super(name, salary, address);
        this.project = project;
    }

    @Override
    public String toString() {
        return "RegularEmployee{" + super.toString() + " " +
                "project='" + project + '\'' +
                '}';
    }
}
