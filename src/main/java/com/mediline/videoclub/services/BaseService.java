package com.mediline.videoclub.services;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseService<E>{
    public List<E> findAll() throws Exception;
    public E findOne(Integer ID) throws Exception;
    public E save(E entity) throws Exception;
    public E update(Integer ID, E entity) throws Exception;
    public boolean delete(Integer ID) throws Exception;


}
