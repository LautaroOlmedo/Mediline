package com.mediline.videoclub.services;

import com.mediline.videoclub.entities.MovieEntity;
import com.mediline.videoclub.repositories.BaseRepository;
import com.mediline.videoclub.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl extends BaseServiceImpl<MovieEntity, Integer> implements MovieService{

    public MovieServiceImpl(BaseRepository<MovieEntity, Integer> baseRepository) {
        super(baseRepository);
    }

    @Autowired
    private MovieRepository movieRepository;
}
