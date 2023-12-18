package com.mediline.videoclub.services;

import com.mediline.videoclub.entities.Person;
import com.mediline.videoclub.repositories.BaseRepository;
import com.mediline.videoclub.repositories.PersonRepository;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonService implements BaseService<Person>{

    public PersonService(BaseRepository baseRepository){
        this.baseRepository = baseRepository;
    }



    @Override
    public List<Person> findAll() throws Exception {
        try {
            List<Person> persons = new ArrayList<>();
            baseRepository.findAll().iterator().forEachRemaining(person -> persons.add((Person) person));
            return persons;
        }catch (Error e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Person findOne(Integer ID) throws Exception {
        return null;
    }


    @Override
    @Transactional
    public Person save(Person entity) throws Exception {
        try{
            return (Person) baseRepository.save(entity);
        }catch (Error e){
            throw new Exception(e.getMessage());
        }
    }
    private BaseRepository baseRepository;
}
