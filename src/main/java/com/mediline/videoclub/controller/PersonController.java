package com.mediline.videoclub.controller;

import com.mediline.videoclub.entities.Person;
import com.mediline.videoclub.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/person")
public class PersonController {

    @GetMapping("/all")
    public ResponseEntity<?> getAll(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(personRepository.findAll());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.OK).body("{\"error\":\"Error.\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Integer id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(personRepository.findById(id));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.OK).body("{\"error\":\"Error.\"}");
        }
    }


    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Person person){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(personRepository.save(person));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.OK).body("{\"error\":\"Error. Please try later\"}");
        }
    }


   /* @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Person person){
        try{
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.OK).body("{\"error\":\"Error. Please try later\"}");
        }
    }*/

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        try{
            personRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body(true);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.OK).body("{\"error\":\"Error.\"}");
        }
    }

    @Autowired
    private PersonRepository personRepository;
}
