package com.spring.jpa.JPA3assignment.onetoone.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @ElementCollection
    @CollectionTable(name = "author_subjects", joinColumns = @JoinColumn(name = "author_id"))
    @Column(name = "subject")
    private Set<String> subjects;

    @Embedded
    private Address address;

    @OneToOne(mappedBy = "author")
    private Book book;

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

    public Author(String name, Set<String> subjects, Address address, Book book) {
        this.name = name;
        this.subjects = subjects;
        this.address = address;
        this.book = book;
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
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
