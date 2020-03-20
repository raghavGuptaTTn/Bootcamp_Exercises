package com.spring.jpa.caching;

import com.spring.jpa.caching.entities.Product;
import com.spring.jpa.caching.repos.ProductRepository;
import com.spring.jpa.relationships.manytomany.entities.Programmer;
import com.spring.jpa.relationships.onetoone.entities.Licence;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AppTest {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    EntityManager entityManager;

    @Test
    public void contextLLoads(){

    }

    @Test
    public void testCreateProduct(){
        Product product = new Product("redmi", "xiaomi product", 15000d);
        productRepository.save(product);
    }

    @Test
    @Transactional
    public void testLoadProduct(){
        Product product = productRepository.findById(30).get();
        System.out.println(product);
    }

    @Test
    @Transactional
    public void testCaching(){
        // this entity manager object is the jpa equivalent of hibernate session.
        Session session = entityManager.unwrap(Session.class);

        Product product = productRepository.findById(30).get();
        productRepository.findById(30).get();

        // remove the object from the cache.s
        session.evict(product);

        productRepository.findById(30).get();

        // here even after evicting the object from the cache, only single sql query is generated
        // because spring finds the object in the 2 level cache.

    }
}