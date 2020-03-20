package com.spring.jpa.relationships.manytomany.repos;

import com.spring.jpa.relationships.manytomany.entities.Programmer;
import org.springframework.data.repository.CrudRepository;

public interface ProgrammerRepository extends CrudRepository<Programmer, Integer> {
    public static void main(String[] args) {

    }
}
