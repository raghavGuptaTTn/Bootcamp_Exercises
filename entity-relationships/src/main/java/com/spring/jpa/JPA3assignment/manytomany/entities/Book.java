package com.spring.jpa.JPA3assignment.manytomany.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String bookName;

    @ManyToMany(mappedBy = "books")
    private List<Author> authors;

    public Book() {
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authors=" + authors +
                '}';
    }


    public void addAuthor(Author a){
        if(a!=null){
            if(authors==null){
                authors = new ArrayList<>();
            }
//            b.setAuthor(this);
            authors.add(a);
        }
    }
}
