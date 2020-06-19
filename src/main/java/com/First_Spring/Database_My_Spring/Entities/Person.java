package com.First_Spring.Database_My_Spring.Entities;

import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Person {

    private int id;
    private String name;
    private String location;
    private Date birthdate;

    public Person(){

    }

    public Person(int id, String name, String location, Date birthdate) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthdate = birthdate;
    }


    @Id
    public int getId() {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

}
