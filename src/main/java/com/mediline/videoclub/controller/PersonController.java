package com.mediline.videoclub.controller;

import com.mediline.videoclub.entities.PersonEntity;
import com.mediline.videoclub.services.PersonServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/person")
public class PersonController extends BaseControllerImpl<PersonEntity, PersonServiceImpl> {
}
