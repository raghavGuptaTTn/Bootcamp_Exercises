package com.spring.jpa.assignment2.normalQuestions.repos;

import com.spring.jpa.assignment2.normalQuestions.entities.Worker;
import org.springframework.data.repository.CrudRepository;

public interface WorkerRepository extends CrudRepository<Worker, Integer> {


}