package com.spring.jpa.practice;

import com.spring.jpa.practice.entities.Product;
import com.spring.jpa.practice.repos.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Arrays;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(App.class, args);

//        EmpRepository empRepository = applicationContext.getBean(EmpRepository.class);

//        empRepository.save(new Emp("raghav"));
//        empRepository.save(new Emp("raghav"));
//        empRepository.save(new Emp("raghav"));
//        empRepository.save(new Emp("raghav"));

        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

//      productRepository.save(new Product("apple", "to eat", 100d));
//		productRepository.save(new Product("mango", "to eat", 60d));
//		productRepository.save(new Product("banana", "to eat", 70d));
//		productRepository.save(new Product("pineapple", "to eat", 10d));
//      productRepository.save(new Product("banana", "to make shake", 90d));
//      productRepository.save(new Product("pineapple", "to get juice", 880d));
//        productRepository.save(new Product("kiwi", "to throw", 500d));
//        productRepository.save(new Product("kiwi", "to throw", 60d));
//        productRepository.save(new Product("kiwi", "to eat", 900d));
//        productRepository.save(new Product("guava", "to juice", 20d));
//        productRepository.save(new Product("papaya", "for acidity", 50d));






//        productRepository.findByName("pineapple")
//                .forEach(e-> System.out.println(e));
//
//        productRepository.findByNameAndDescription("pineapple", "to get juice")
//                .forEach(e-> System.out.println(e));
//
//        productRepository.findByPriceGreaterThan(50d)
//                .forEach(e-> System.out.println(e));
//
//        productRepository.findByDescriptionContains("eat")
//                .forEach(e-> System.out.println(e));
//
//        productRepository.findByPriceBetween(20d, 90d)
//                    .forEach(e-> System.out.println(e));
//
//        productRepository.findByDescriptionLike("%eat%")
//                .forEach(e-> System.out.println(e));


//        productRepository.findByIdIn(Arrays.asList(189, 190, 191, 192))
//                .forEach(e-> System.out.println(e));



        // page object also knows about the total number of pages.
        // slice object knows that whether a next page is there or not.
        // list object doesn't know anything.
        // it knows the list of data only.
//        PAGING ONLY ==========================================
//        Pageable pageable = PageRequest.of(2,2);
//        Page<Product> products = productRepository.findAll(pageable);
//        products.forEach(e-> System.out.println(e));


//        SORTING ONLY =========================================
//        productRepository.findAll(Sort.by("name").ascending())
//                .forEach(e-> System.out.println(e));
//        System.out.println("--------------------------------");
//        productRepository.findAll(Sort.by("name").descending())
//                .forEach(e-> System.out.println(e));
//        System.out.println("--------------------------------");
//        productRepository.findAll(Sort.by("price").ascending())
//                .forEach(e-> System.out.println(e));
//        System.out.println("--------------------------------");
//        productRepository.findAll(Sort.by("price").descending())
//                .forEach(e-> System.out.println(e));
//        System.out.println("--------------------------------");
//        productRepository.findAll(Sort.by("name").ascending().and(Sort.by("price").descending()))
//                .forEach(e-> System.out.println(e));


//        PAGING AND SORTING ONLY ==============================
//          Pageable pageable = PageRequest.of(2,3, Sort.by("name"));
//        Page<Product> products = productRepository.findAll(pageable);
//        products.forEach(e-> System.out.println(e));

//        PAGING AND SORTING IN FINDERS ========================
        Pageable pageable = PageRequest.of(2,2, Sort.by("price"));
        productRepository.findByPriceBetween(20d, 90d, pageable)
                    .forEach(e-> System.out.println(e));

    }
}
