package com.spring.jpa.practice.entities;

import javax.persistence.*;

@Entity
public class Emp {

    @TableGenerator(name = "emp_gen", table = "id_gen", pkColumnName = "name", pkColumnValue = "value")
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "emp_gen")
    private Integer id;
    private String name;

    public Emp() {
    }

    public Emp(String name) {
        this.name = name;
    }

    public Emp(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
