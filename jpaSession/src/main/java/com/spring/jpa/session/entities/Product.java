//package com.spring.jpa.session.entities;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//// camel case auto managed
//
//@Entity
//@Table  // if table name is different than class name.
//public class Product {
//
//    @Id
//    private Integer id;
//    private String name;
//
//    @Column(name = "description")   // if col name is diff from field name.
//    private String desc;
//    private Double price;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//}
