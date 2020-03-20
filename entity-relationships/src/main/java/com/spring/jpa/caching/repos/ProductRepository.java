package com.spring.jpa.caching.repos;

import com.spring.jpa.caching.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {


    List<Product> findByName(String name);

    List<Product> findByNameAndDescription(String name, String description);

    List<Product> findByPriceGreaterThan(Double price);

    List<Product> findByDescriptionContains(String word);

    List<Product> findByPriceBetween(Double low, Double high);

    List<Product> findByDescriptionLike(String match);

    // if we pass extra ids which are not in db, it works fine then also.
    List<Product> findByIdIn(List<Integer> ids);



}

