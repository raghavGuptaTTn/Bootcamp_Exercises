package com.spring.jpa.JPA3assignment.normalQuestions.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    // Question 3 - Introduce a List of subjects for author.
    private Set<String> subjects;

    // Question 2 - Create instance variable of Address class inside Author class and save it as embedded object.
    @Embedded
    private Address address;

    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    public Author(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Author(String name, Set<String> subjects, Address address) {
        this.name = name;
        this.subjects = subjects;
        this.address = address;
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

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                ", address=" + address +
                '}';
    }
}
