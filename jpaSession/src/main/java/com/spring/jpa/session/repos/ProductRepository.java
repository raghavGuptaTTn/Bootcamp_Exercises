package com.spring.jpa.session.repos;

import com.spring.jpa.session.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {


}
