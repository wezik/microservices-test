package com.api.movies.moviesservice.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Movie {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String author;
}
