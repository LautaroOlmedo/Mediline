package com.mediline.videoclub.services;

import com.mediline.videoclub.entities.PersonEntity;
import com.mediline.videoclub.repositories.BaseRepository;
import com.mediline.videoclub.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends BaseServiceImpl<PersonEntity, Integer> implements PersonService{
    public PersonServiceImpl(BaseRepository<PersonEntity, Integer> baseRepository) {super(baseRepository);}

    @Autowired
    private PersonRepository personRepository;
}
