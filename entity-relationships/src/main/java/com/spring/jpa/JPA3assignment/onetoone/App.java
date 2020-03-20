package com.spring.jpa.JPA3assignment.onetoone;


import com.spring.jpa.JPA3assignment.onetoone.entities.Address;
import com.spring.jpa.JPA3assignment.onetoone.entities.Author;
import com.spring.jpa.JPA3assignment.onetoone.entities.Book;
import com.spring.jpa.JPA3assignment.onetoone.repos.BookRepository;
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

        BookRepository repo = applicationContext.getBean(BookRepository.class);

        Address add1 = new Address(123, "noida", "UP");
        Address add2 = new Address(787, "delhi", "delhi");
        Address add3 = new Address(77, "bhopal", "MP");

        // Question 4 - Persist 3 subjects for each author.
        Set<String> subjects1 = new HashSet<>(Arrays.asList("english", "hindi", "sanskrit"));
        Set<String> subjects2 = new HashSet<>(Arrays.asList("maths", "sst", "science"));
        Set<String> subjects3 = new HashSet<>(Arrays.asList("hindi", "sst", "GK"));

        Book b1 = new Book("spring 5.0");
        Book b2 = new Book("django 5.0");
        Book b3 = new Book("java 11.0");
//        Book b4 = new Book("hadoop 5.0");
//        Book b5 = new Book("maths challenges");
//        Book b6 = new Book("puzzles");
//        Book b7 = new Book("english communication");
//        Book b8 = new Book("story book");
//        Book b9 = new Book("fairy tales");
//        Book b10 = new Book("the monk who sold his ferrari");

        Author author1 = new Author("didu", subjects1, add1, b1);
        Author author2 = new Author("raghav", subjects2, add2, b2);
        Author author3 = new Author("bhai", subjects3, add3, b3);

        b1.setAuthor(author1);
        b2.setAuthor(author2);
        b3.setAuthor(author3);

        repo.save(b1);
        repo.save(b2);
        repo.save(b3);

    }
}
