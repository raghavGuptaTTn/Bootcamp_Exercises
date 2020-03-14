package com.spring.jpa.session2.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Programmer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer salary;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "programmers_projects",
    joinColumns = @JoinColumn(name = "programmer_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "project_id", referencedColumnName = "id"))
    private Set<Project> projects;

    public Programmer() {
    }

    public Programmer(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public Programmer(String name, Integer salary, Set<Project> projects) {
        this.name = name;
        this.salary = salary;
        this.projects = projects;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", projects=" + projects +
                '}';
    }

}
