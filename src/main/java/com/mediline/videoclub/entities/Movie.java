package com.mediline.videoclub.entities;

import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Movie")
public class Movie {
    @Id
    @GeneratedValue
    private Integer ID;
    private String title;
    private String genre;
}
