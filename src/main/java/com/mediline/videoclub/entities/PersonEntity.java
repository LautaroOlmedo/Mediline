package com.mediline.videoclub.entities;




import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@RedisHash("Person")
public class PersonEntity extends BaseEntity implements Serializable {

    public PersonEntity(){}
    public PersonEntity(String firstName, String lastName, Date birthdate, boolean hasInsurance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.hasInsurance = hasInsurance;
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


    private String firstName;
    private String lastName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC")
    private Date birthdate;
    private boolean hasInsurance;
    @Reference
    private Set<Integer> movieIds = new HashSet<>();
}
