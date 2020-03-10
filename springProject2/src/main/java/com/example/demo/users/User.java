package com.example.demo.users;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;


@ApiModel(description = "all details about the user.")
public class User {

    private Integer id;

    @Size(min = 2, message = "name should have minimum 2 characters")
    @ApiModelProperty(notes = "name has to be minimum 2 characters long")
    private String name;

    @Past(message = "date of birth can not be a future date")
    @ApiModelProperty(notes = "birth date has to be in past")
    private Date dob;

    User(){

    }

    public User(int id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
    // required of we want to print the object directly.
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
