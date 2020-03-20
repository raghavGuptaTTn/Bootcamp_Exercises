package com.spring.jpa.relationships.onetoone;

import com.spring.jpa.relationships.onetoone.entities.Licence;
import com.spring.jpa.relationships.onetoone.entities.Person;
import com.spring.jpa.relationships.onetoone.repos.LicenceRepository;
import com.spring.jpa.relationships.onetoone.repos.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Date;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(App.class, args);

        LicenceRepository licenceRepository = applicationContext.getBean(LicenceRepository.class);
        PersonRepository personRepository = applicationContext.getBean(PersonRepository.class);

//        Person p1 = new Person("james", "gupta", 21);
//        Licence l1 = new Licence("4 wheeler", new Date(), new Date(), p1);
//
//        Person p2 = new Person("john", "cena", 29);
//        Licence l2 = new Licence("2 wheeler", new Date(), new Date(), p2);
//
//        Person p3 = new Person("sumit", "goyal", 32);
//        Licence l3 = new Licence("2 wheeler", new Date(), new Date(), p3);
//
//        licenceRepository.save(l1);
//        licenceRepository.save(l2);
//        licenceRepository.save(l3);

//        System.out.println(licenceRepository.findById(57).get());
//        System.out.println(personRepository.findById(58).get());




        Licence l1 = new Licence("4 wheeler", new Date(), new Date());
        Person p1 = new Person("james", "gupta", 21, l1);

        Licence l2 = new Licence("2 wheeler", new Date(), new Date());
        Person p2 = new Person("john", "cena", 29, l2);

        Licence l3 = new Licence("2 wheeler", new Date(), new Date());
        Person p3 = new Person("sumit", "goyal", 32, l3);

        personRepository.save(p1);
        personRepository.save(p2);
        personRepository.save(p3);


    }
}
