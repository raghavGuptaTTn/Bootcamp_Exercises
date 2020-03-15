package com.spring.jpa.session2.entities;

import javax.persistence.*;

@Entity
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String number;
    private String type;

    @ManyToOne
    @JoinColumn(name = "customer_id")   // tells the name of new column to be created.
    // @Refernced column attriute is also there.
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
                '}';
    }
}
