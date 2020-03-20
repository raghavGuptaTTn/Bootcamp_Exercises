package com.spring.jpa.relationships.onetoone;

import com.spring.jpa.relationships.onetoone.entities.Licence;
import com.spring.jpa.relationships.onetoone.entities.Person;
import com.spring.jpa.relationships.onetoone.repos.LicenceRepository;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.Date;


@SpringBootTest
public class AppTest {

    @Autowired
    EntityManager entityManager;

    @Autowired
    LicenceRepository licenceRepository;

    @Test
    public void contextLoads(){

    }

    @Test
    public void testCreateCustomer(){
        Person person = new Person("raghav", "gupta", 22);
        Licence licence = new Licence("car", new Date(), new Date(), person);

        licenceRepository.save(licence);
    }

    @Test
    @Transactional
    public void testLoadCustomer(){
        Licence licence = licenceRepository.findById(25).get();
        System.out.println(licence);
        System.out.println(licence.getPerson());
    }

    @Test
    @Transactional
    public void testCaching(){
        // this entity manager object is the jpa equivalent of hibernate session.
        Session session = entityManager.unwrap(Session.class);

        Licence licence = licenceRepository.findById(25).get();
        Licence licence1 = licenceRepository.findById(25).get();

        // remove the object from the cache.
        session.evict(licence);

        licenceRepository.findById(25).get();
    }

}