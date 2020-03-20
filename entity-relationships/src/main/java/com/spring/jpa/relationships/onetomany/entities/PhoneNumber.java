package com.spring.jpa.relationships.onetomany.entities;

import javax.persistence.*;

@Entity
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String number;
    private String type;

    @ManyToOne              // by this we tell that many phone numbers will be mapped to one customer.
    @JoinColumn(name = "customer_id")   // we tell the name of the column to be used to connect the tables.
                                        // it acts as the foreign key.
    private Customer customer;

    public PhoneNumber() {
    }

    public PhoneNumber(String number, String type) {
        this.number = number;
        this.type = type;
    }

    public PhoneNumber(String number, String type, Customer customer) {
        this.number = number;
        this.type = type;
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", customer=" + customer.toString() +
                '}';
    }
}
