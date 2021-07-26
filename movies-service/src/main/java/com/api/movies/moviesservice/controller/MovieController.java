package com.api.movies.moviesservice.controller;

import com.api.movies.moviesservice.domain.Movie;
import com.api.movies.moviesservice.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping
    public List<Movie> findAllMovies() {
        return movieService.findAllMovies();
    }

    @GetMapping("/{movieId}")
    public Movie findMovie(@PathVariable Long movieId) {
        return movieService.findMovieById(movieId);
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.createMovie(movie);
    }

    @DeleteMapping("/{movieId}")
    public void deleteMovie(@PathVariable Long movieId) {
        movieService.deleteMovie(movieId);
    }

    @PutMapping("/{movieId}")
    public Movie updateMovie(@RequestBody Movie movie, @PathVariable Long movieId) {
        return movieService.updateMovie(movie);
    }

}
