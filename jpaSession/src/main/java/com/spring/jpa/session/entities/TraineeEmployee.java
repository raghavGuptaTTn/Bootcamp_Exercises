package com.spring.jpa.session.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue("trainee-employee")

@PrimaryKeyJoinColumn(name = "id")
public class TraineeEmployee extends Employee{

    private int assessmentScore;

    public int getAssessmentScore() {
        return assessmentScore;
    }

    public void setAssessmentScore(int assessmentScore) {
        this.assessmentScore = assessmentScore;
    }

    public TraineeEmployee(String name, int salary, Address address, int assessmentScore) {
        super(name, salary, address);
        this.assessmentScore = assessmentScore;
    }

    public TraineeEmployee() {
    }

    @Override
    public String toString() {
        return "TraineeEmployee{" + super.toString() + " " +
                "assessmentScore=" + assessmentScore +
                '}';
    }
}
