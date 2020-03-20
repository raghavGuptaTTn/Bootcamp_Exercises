package com.spring.jpa.relationships.manytomany.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String name;

    @ManyToMany(mappedBy = "projects") // indicates that this is the reverse of the association defined in programmrs
    private Set<Programmer> programmers;

    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, Set<Programmer> programmers) {
        this.name = name;
        this.programmers = programmers;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Programmer> getProgrammers() {
        return programmers;
    }

    public void setProgrammers(Set<Programmer> programmers) {
        this.programmers = programmers;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }

//    =============================================

    public void addProgrammer(Programmer programmer){
        if(programmer != null){
            if(programmers == null)
                programmers = new HashSet<>();

//            programmer.addProject(this);

            programmers.add(programmer);
        }
    }
}
