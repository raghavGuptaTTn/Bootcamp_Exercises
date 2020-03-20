package com.spring.jpa.JPA3assignment.normalQuestions;


import com.spring.jpa.JPA3assignment.onetoone.entities.Address;
import com.spring.jpa.JPA3assignment.onetoone.entities.Book;
import com.spring.jpa.JPA3assignment.onetoone.repos.AuthorRepository;
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

        // Question 4 - Persist 3 subjects for each author.
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

//        repo.save(new Author("charles darwin", add1, ));
    }
}

// ====================== QUESTION 9 ============================
// Which method on the session object can be used to remove an object from the cache?

// evict() method is used to remove an object from the LEVEL 1 cache.


// ====================== QUESTION 10 ============================
// What does @transactional annotation do?

/*
its is used for multiple purposes as i have seen.
1. in case of lazy fetching, by default hibernate fetches the parent class data only, not the child objects.
   even if they are required later, it still doesn't fetch them and throws lazy exception.

   by using @Transactional, it starts fetching the data later also when its required.


2. its also used to implement ATOMICITY in a transaction. we can add its over a method or a class which ensures
   that either full method is executed or nothing.
   if there is any exception in between the method, it will roll back the changes to the database.
 */
