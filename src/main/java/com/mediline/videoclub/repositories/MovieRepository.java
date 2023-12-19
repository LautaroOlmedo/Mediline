package com.mediline.videoclub.repositories;

import com.mediline.videoclub.entities.MovieEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends BaseRepository<MovieEntity, Integer> {
}
