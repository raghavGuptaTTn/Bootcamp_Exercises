package com.spring.jpa.session2;

import com.spring.jpa.assignment2.normalQuestions.Assignment1Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Assignment1Application.class, args);

    }

}
