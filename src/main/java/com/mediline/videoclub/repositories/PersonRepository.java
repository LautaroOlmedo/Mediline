package com.mediline.videoclub.repositories;

import com.mediline.videoclub.entities.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends BaseRepository<Person, Integer> {
}
