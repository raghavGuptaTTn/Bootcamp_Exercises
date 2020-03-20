package com.spring.jpa.JPA3assignment.onetomanybidirectional.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
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

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;

    public Author() {
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

    public Author(String name, Set<String> subjects, Address address, List<Book> books) {
        this.name = name;
        this.subjects = subjects;
        this.address = address;
        this.books = books;
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

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
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

    public void addBook(Book b){
        if(b!=null){
            if(books==null){
                books = new ArrayList<>();
            }
            b.setAuthor(this);
            books.add(b);
        }
    }
}
