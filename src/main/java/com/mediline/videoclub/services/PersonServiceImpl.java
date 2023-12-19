package com.mediline.videoclub.services;

import com.mediline.videoclub.entities.Person;
import com.mediline.videoclub.repositories.BaseRepository;
import com.mediline.videoclub.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends BaseServiceImpl<Person, Integer> implements PersonService{
    public PersonServiceImpl(BaseRepository<Person, Integer> baseRepository) {
        super(baseRepository);

    }

    @Autowired
    private PersonRepository personRepository;
}
