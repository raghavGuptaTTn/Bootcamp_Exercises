package com.spring.jpa.relationships.manytomany;

import com.spring.jpa.relationships.manytomany.entities.Programmer;
import com.spring.jpa.relationships.manytomany.entities.Project;
import com.spring.jpa.relationships.manytomany.repos.ProgrammerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;

@SpringBootTest
public class AppTest {

    @Autowired
    ProgrammerRepository repository;

    @Test
    public void contextLoads(){

    }

    @Test
    public void testCreateProgrammer(){

        Programmer programmer = new Programmer("shyam", 50000);
        Project project = new Project("motus");
        programmer.addProject(project);
        project.addProgrammer(programmer);

        repository.save(programmer);

    }

    @Test
    @Transactional
    public void testLoadProgrammer(){

        Programmer programmer = repository.findById(15).get();
        System.out.println(programmer);
        System.out.println(programmer.getProjects());

    }
}