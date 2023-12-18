package com.mediline.videoclub.repositories;


import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepository<E> extends CrudRepository<E, Integer> {

}
