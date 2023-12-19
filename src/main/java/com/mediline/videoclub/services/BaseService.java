package com.mediline.videoclub.services;

import com.mediline.videoclub.entities.BaseEntity;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends BaseEntity, ID extends Serializable>{
    public List<E> findAll() throws Exception;
    public E findOne(ID id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws Exception;


}
