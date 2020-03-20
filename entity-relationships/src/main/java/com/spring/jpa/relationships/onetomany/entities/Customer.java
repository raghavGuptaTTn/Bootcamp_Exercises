package com.spring.jpa.relationships.onetomany.entities;

import sun.java2d.loops.CustomComponent;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
                                        // by this we tell spring about the association
                                        // by mappedBy we mean that who owns the association.
    private Set<PhoneNumber> numbers;   // by this line we create the association

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, Set<PhoneNumber> numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PhoneNumber> getNumbers() {
        return numbers;
    }

    public void setNumbers(Set<PhoneNumber> numbers) {
        this.numbers = numbers;
    }

    public void print() {
        String s = "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numbers=";

        numbers.forEach(e-> System.out.println(e));

    }

    public void addPhoneNumber(PhoneNumber ph){
        if(ph != null){
            if(numbers == null){
                numbers = new HashSet<>();
            }
            ph.setCustomer(this);
            numbers.add(ph);
        }
    }
}
