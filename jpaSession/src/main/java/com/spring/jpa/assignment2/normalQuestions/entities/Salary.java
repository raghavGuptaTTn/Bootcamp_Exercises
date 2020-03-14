package com.spring.jpa.assignment2.normalQuestions.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Salary {

    private Double basicSalary;
    private Double bonusSalary;
    private Double taxAmount;
    private Double specialAllowanceSalary;

    public Salary() {
    }

    public Salary(Double basicSalary, Double bonusSalary, Double taxAmount, Double specialAllowanceSalary) {
        this.basicSalary = basicSalary;
        this.bonusSalary = bonusSalary;
        this.taxAmount = taxAmount;
        this.specialAllowanceSalary = specialAllowanceSalary;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(Double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Double getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(Double specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "basicSalary=" + basicSalary +
                ", bonusSalary=" + bonusSalary +
                ", taxAmount=" + taxAmount +
                ", specialAllowanceSalary=" + specialAllowanceSalary +
                '}';
    }
}
