package com.mediline.videoclub.repositories;

import com.mediline.videoclub.entities.Movie;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends BaseRepository<Movie, Integer> {
}
