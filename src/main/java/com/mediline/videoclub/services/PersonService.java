package com.mediline.videoclub.services;

import com.mediline.videoclub.entities.Person;
import com.mediline.videoclub.repositories.BaseRepository;
import com.mediline.videoclub.repositories.PersonRepository;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class PersonService implements BaseService<Person>{
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> findAll() throws Exception {
        try{
            return (List<Person>) this.personRepository.findAll();
        }catch (Error e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Person findOne(Integer ID) throws Exception {
        return null;
    }

    @Override
    public Person save(Person entity) throws Exception {
        return null;
    }

    @Override
    public Person update(Integer ID, Person entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Integer ID) throws Exception {
        return false;
    }

    private PersonRepository personRepository;
}
