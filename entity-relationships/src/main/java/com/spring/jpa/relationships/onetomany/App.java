package com.spring.jpa.relationships.onetomany;

import com.spring.jpa.relationships.onetomany.entities.Customer;
import com.spring.jpa.relationships.onetomany.entities.PhoneNumber;
import com.spring.jpa.relationships.onetomany.repos.CustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(App.class, args);

        CustomerRepository repo = applicationContext.getBean(CustomerRepository.class);

//        Customer cust1 = new Customer("gunjan");
//        cust1.addPhoneNumber(new PhoneNumber("9811676767", "mobile"));
//
//        Customer cust2 = new Customer("mohit");
//        cust2.addPhoneNumber(new PhoneNumber("9811676767", "mobile"));
//
//        Customer cust3 = new Customer("thomas");
//        cust3.addPhoneNumber(new PhoneNumber("9866676767", "mobile"));
//        cust3.addPhoneNumber(new PhoneNumber("9866671111", "landline"));
//
//        Customer cust4 = new Customer("parik");
//        cust4.addPhoneNumber(new PhoneNumber("9991676767", "mobile"));
//
//        repo.save(cust1);
//        repo.save(cust2);
//        repo.save(cust3);
//        repo.save(cust4);




    }
}
