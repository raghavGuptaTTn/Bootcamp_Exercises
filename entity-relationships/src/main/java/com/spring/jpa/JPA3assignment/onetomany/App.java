package com.spring.jpa.JPA3assignment.onetomany;


import com.spring.jpa.JPA3assignment.onetomany.entities.Address;
import com.spring.jpa.JPA3assignment.onetomany.entities.Author;
import com.spring.jpa.JPA3assignment.onetomany.entities.Book;
import com.spring.jpa.JPA3assignment.onetomany.repos.AuthorRepository;
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
        Book b4 = new Book("hadoop 5.0");
        Book b5 = new Book("maths challenges");
        Book b6 = new Book("puzzles");
        Book b7 = new Book("english communication");
        Book b8 = new Book("story book");
        Book b9 = new Book("fairy tales");
        Book b10 = new Book("the monk who sold his ferrari");

        Author a1 = new Author("raghav", subjects1, add1, Arrays.asList(b1, b2, b3));
        Author a2 = new Author("vijeta", subjects2, add2, Arrays.asList(b4, b10));
        Author a3 = new Author("bhanu", subjects3, add3, Arrays.asList(b5, b6, b7, b8, b9));

        repo.save(a1);
        repo.save(a2);
        repo.save(a3);

    }
}

