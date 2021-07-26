package com.api.movies.ratingservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@NamedQuery(name = "Rating.findRatingsByMovieId", query = "FROM Rating WHERE movieId = :id")
public class Rating {
    @Id
    @GeneratedValue
    private Long id;
    private Long movieId;
    private Integer stars;
}
