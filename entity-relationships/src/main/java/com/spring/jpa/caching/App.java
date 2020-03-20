package com.spring.jpa.caching;

import com.spring.jpa.practice.repos.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(App.class, args);

        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

    }
}
