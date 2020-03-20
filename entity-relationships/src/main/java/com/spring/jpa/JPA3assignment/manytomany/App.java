package com.spring.jpa.JPA3assignment.manytomany;


import com.spring.jpa.JPA3assignment.manytomany.entities.Address;
import com.spring.jpa.JPA3assignment.manytomany.entities.Author;
import com.spring.jpa.JPA3assignment.manytomany.entities.Book;
import com.spring.jpa.JPA3assignment.manytomany.repos.AuthorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(App.class, args);

        AuthorRepository repo = applicationContext.getBean(AuthorRepository.class);

        Address add1 = new Address(123, "noida", "UP");
        Address add2 = new Address(787, "delhi", "delhi");
        Address add3 = new Address(77, "bhopal", "MP");

        Set<String> subjects1 = new HashSet<>(Arrays.asList("english", "hindi", "sanskrit"));
        Set<String> subjects2 = new HashSet<>(Arrays.asList("maths", "sst", "science"));
        Set<String> subjects3 = new HashSet<>(Arrays.asList("hindi", "sst", "GK"));

        Book b1 = new Book("spring 5.0");
        Book b2 = new Book("django 5.0");
        Book b3 = new Book("java 11.0");


        Author a1 = new Author("raghav", subjects1, add1);
        a1.addBook(b1);     b1.addAuthor(a1);
        a1.addBook(b2);     b2.addAuthor(a1);
        a1.addBook(b3);     b3.addAuthor(a1);

//        Author a2 = new Author("mohit", subjects3, add2);
//        a2.addBook(b1);     b1.addAuthor(a2);
//        a2.addBook(b2);     b2.addAuthor(a2);

        repo.save(a1);
//        repo.save(a2);
    }
}
