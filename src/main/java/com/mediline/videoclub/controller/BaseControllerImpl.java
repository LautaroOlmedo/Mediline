package com.mediline.videoclub.controller;

import com.mediline.videoclub.entities.BaseEntity;
import com.mediline.videoclub.entities.PersonEntity;
import com.mediline.videoclub.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class BaseControllerImpl <E extends BaseEntity, S extends BaseService<E, Integer>> implements BaseController<E, Integer>{
    @GetMapping("/all")
    public ResponseEntity<?> getAll(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.OK).body("{\"error\":\"Error.\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Integer id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findOne(id));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.OK).body("{\"error\":\"Error.\"}");
        }
    }


    @PostMapping("/create")
    public ResponseEntity<?> save(@RequestBody E person){
        try{

            return ResponseEntity.status(HttpStatus.OK).body(service.save(person));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.OK).body("{\"error\":\"Error. Please try later\"}");
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody PersonEntity personEntity){
        try{
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.OK).body("{\"error\":\"Error. Please try later\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        try{
            service.delete(id);
            return ResponseEntity.status(HttpStatus.OK).body(true);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.OK).body("{\"error\":\"Error.\"}");
        }
    }
    @Autowired
    protected S service;
}
