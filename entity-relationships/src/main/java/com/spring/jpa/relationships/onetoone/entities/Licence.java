package com.spring.jpa.relationships.onetoone.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Licence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @Temporal(TemporalType.DATE)
    private Date validFrom;

    @Temporal(TemporalType.DATE)
    private Date validTo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    private Person person;

    public Licence() {
    }

    public Licence(String name) {
        this.name = name;
    }

    public Licence(String name, Date validFrom, Date validTo) {
        this.name = name;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    public Licence(String name, Date validFrom, Date validTo, Person person) {
        this.name = name;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.person = person;
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

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Licence{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
//                ", person=" + person +
                '}';
    }
}
