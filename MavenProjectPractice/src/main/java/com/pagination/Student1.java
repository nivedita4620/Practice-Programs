package com.pagination;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student1 {
    @Id
    private int rollno;
    private String name;
    private String city;

    // Getters and setters
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
