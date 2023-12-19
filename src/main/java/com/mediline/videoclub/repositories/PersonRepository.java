package com.mediline.videoclub.repositories;

import com.mediline.videoclub.entities.PersonEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends BaseRepository<PersonEntity, Integer> {
}
