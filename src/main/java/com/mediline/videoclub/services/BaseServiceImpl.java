package com.mediline.videoclub.services;

import com.mediline.videoclub.entities.BaseEntity;
import com.mediline.videoclub.repositories.BaseRepository;

import java.io.Serializable;
import java.util.List;


public abstract class BaseServiceImpl<E extends BaseEntity, ID extends Serializable> implements BaseService<E, ID> {
    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }
    @Override
    public List<E> findAll() throws Exception {
        try{
            return (List<E>) this.baseRepository.findAll();
        }catch (Error e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public E findOne(ID id) throws Exception {
        try{
            return this.baseRepository.findById(id);
        }catch (Error e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public E save(E entity) throws Exception {
        try{
            return this.baseRepository.save(entity);
        }catch (Error e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public E update(ID id, E entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(ID id) throws Exception {
        return this.baseRepository.deleteById(id);
    }

    protected BaseRepository<E, ID> baseRepository;
}
