package com.api.movies.ratingservice.repository;

import com.api.movies.ratingservice.domain.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
    @Query
    List<Rating> findRatingsByMovieId(@Param("id")Long id);
}
