package com.spring.jpa.session2.repos;

import com.spring.jpa.session2.entities.Programmer;
import org.springframework.data.repository.CrudRepository;

public interface ProgrammerRepository extends CrudRepository<Programmer, Integer> {



}
