package com.api.movies.ratingservice.controller;

import com.api.movies.ratingservice.domain.Rating;
import com.api.movies.ratingservice.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
@RequiredArgsConstructor
public class RatingController {

    private final RatingService ratingService;

    @GetMapping("/{movieId}")
    public List<Rating> findRatingsByMovieId(@PathVariable(required = false) Long movieId) {
        return movieId==null ? ratingService.findAllRatings() : ratingService.findRatingsByMovieId(movieId);
    }

    @PostMapping
    public Rating addRating(@RequestBody Rating rating) {
        return ratingService.createRating(rating);
    }

    @DeleteMapping("/{ratingId}")
    public void deleteRating(@PathVariable Long ratingId) {
        ratingService.deleteRating(ratingId);
    }

    @PutMapping("/{ratingId}")
    public Rating updateMovie(@RequestBody Rating rating, @PathVariable(required = false) Long ratingId) {
        return ratingService.updateRating(rating);
    }

}
