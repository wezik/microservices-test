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

    @GetMapping
    public List<Rating> findRatingsByMovieId(@RequestParam(required = false, defaultValue = "0") Long movie_id) {
        return movie_id==0 ? ratingService.findAllRatings() : ratingService.findRatingsByMovieId(movie_id);
    }

    @PostMapping
    public Rating addRating(@RequestBody Rating rating) {
        return ratingService.createRating(rating);
    }

    @DeleteMapping("/{ratingId}")
    public void deleteRating(@PathVariable Long ratingId) {
        ratingService.deleteRating(ratingId);
    }

    @PutMapping
    public Rating updateMovie(@RequestBody Rating rating) {
        return ratingService.updateRating(rating);
    }

}
