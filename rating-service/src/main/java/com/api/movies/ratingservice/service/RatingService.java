package com.api.movies.ratingservice.service;

import com.api.movies.ratingservice.domain.Rating;
import com.api.movies.ratingservice.repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RatingService {

    private final RatingRepository ratingRepository;

    public List<Rating> findAllRatings() {
        return ratingRepository.findAll();
    }

    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    public void deleteRating(Long id) {
        ratingRepository.deleteById(id);
    }

    public Rating updateRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    public List<Rating> findRatingsByMovieId(Long movieId) {
        return ratingRepository.findRatingsByMovieId(movieId);
    }
}
