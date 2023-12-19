package com.mediline.videoclub.entities;



import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@RedisHash("Person")
public class Person implements Serializable {

    public Person(){}
    public Person(String firstName, String lastName, Date birthdate, boolean hasInsurance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.hasInsurance = hasInsurance;
    }

    public int getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isHasInsurance() {
        return hasInsurance;
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance;
    }

    public Set<Integer> getMovieIds() {
        return movieIds;
    }

    public void setMovieIds(Integer movieIds) {
        this.movieIds.add(movieIds);
    }

    @Id
    @GeneratedValue
    private Integer ID;
    private String firstName;
    private String lastName;
    private Date birthdate;
    private boolean hasInsurance;
    @Reference
    private Set<Integer> movieIds = new HashSet<>();
}
