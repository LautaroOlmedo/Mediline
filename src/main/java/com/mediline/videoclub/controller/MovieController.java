package com.mediline.videoclub.controller;

import com.mediline.videoclub.entities.MovieEntity;
import com.mediline.videoclub.services.MovieServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/movie")
public class MovieController extends BaseControllerImpl<MovieEntity, MovieServiceImpl>{
}
