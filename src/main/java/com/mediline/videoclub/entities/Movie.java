package com.mediline.videoclub.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Movie")
public class Movie extends BaseEntity implements Serializable {

    private String title;
    private String genre;
}
