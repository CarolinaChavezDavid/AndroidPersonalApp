package com.carolinaapp.apis.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {

    @Id
    private Long id;
    private String firstName;
    private String secondName;
    private String LastName;
    private Integer dayBirth;
    private Integer monthBirth;
    private Integer yearBirth;
    private String description;
    private String city;
    private String country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Integer getDayBirth() {
        return dayBirth;
    }

    public void setDayBirth(Integer dayBirth) {
        this.dayBirth = dayBirth;
    }

    public Integer getMonthBirth() {
        return monthBirth;
    }

    public void setMonthBirth(Integer monthBirth) {
        this.monthBirth = monthBirth;
    }
    public Integer getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(Integer yearBirth) {
        this.yearBirth = yearBirth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
