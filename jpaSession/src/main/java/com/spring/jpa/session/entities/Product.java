package com.spring.jpa.session.entities;

import javax.persistence.*;

// by default - what spring does is -
// mysql uses small letters for everything.
// rather than camel case, it uses underscore notation.
// so it automatically converts the names from entities into diff names in tables
// it does the mapping also.
// if we want some specific names, then we may use the @Table and @Column annotations.
// @Table and @Column will also not take up capital letters anywhere and camel case also.
// but will allow to give custom names.


@Entity
//@Table(name = "PRo_Duct")  // if table name is different than class name.
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

//    @Column(name = "DescriPtion")   // if col name is diff from field name.
    private String Description;
    private Double price;

    public Product() {
    }

    public Product(String fullName, String description, Double price) {
        this.name = fullName;
        Description = description;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public String getFullName() {
        return name;
    }

    public void setFullName(String fullName) {
        this.name = fullName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Description='" + Description + '\'' +
                ", price=" + price +
                '}';
    }
}
