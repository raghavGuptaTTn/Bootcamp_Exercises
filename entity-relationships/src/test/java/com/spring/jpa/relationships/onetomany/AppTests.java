package com.spring.jpa.relationships.onetomany;

import com.spring.jpa.relationships.onetomany.entities.Customer;
import com.spring.jpa.relationships.onetomany.entities.PhoneNumber;
import com.spring.jpa.relationships.onetomany.repos.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;

@SpringBootTest
public class AppTests {

    @Autowired
    CustomerRepository repository;

    @Test
    public void contextLoads(){

    }


    @Test
    public void testCreateCustomer(){
        Customer cust3 = new Customer("james bill");
        cust3.addPhoneNumber(new PhoneNumber("9866676767", "mobile"));
        cust3.addPhoneNumber(new PhoneNumber("9866671111", "landline"));

        repository.save(cust3);
    }


    @Test
    @Transactional  // for lazy
    // by default the fetching is laxy in spring but it doesnt fetch the data even when required.
    // so by applying transactional, its starts doing that - proper lazy
    public void testLoadCustomer(){
        Customer customer = repository.findById(5).get();
        System.out.println(customer.getName());

        Set<PhoneNumber> numbers = customer.getNumbers();
        numbers.stream()
                .forEach(e-> System.out.println(e));
    }

    @Test
//    @Transactional
    public void testUpdateCustomer(){
        Optional<Customer> cust = repository.findById(5);
        Customer customer = cust.get();

        System.out.println(customer.getName());
        customer.setName("john bush");

        Set<PhoneNumber> numbers = customer.getNumbers();
        numbers.forEach(e-> e.setType("landline"));
        repository.save(customer);
    }

    @Test
    public void testDelete(){
        repository.deleteById(1);
    }
}
