package com.mediline.videoclub.services;

import com.mediline.videoclub.entities.Movie;
import com.mediline.videoclub.repositories.BaseRepository;
import com.mediline.videoclub.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl extends BaseServiceImpl<Movie, Integer> implements MovieService{

    public MovieServiceImpl(BaseRepository<Movie, Integer> baseRepository) {
        super(baseRepository);
    }

    @Autowired
    private MovieRepository movieRepository;
}
