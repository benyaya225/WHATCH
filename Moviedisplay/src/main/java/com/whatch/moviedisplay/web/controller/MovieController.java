package com.whatch.moviedisplay.web.controller;
import com.whatch.moviedisplay.dao.MovieDao;
import com.whatch.moviedisplay.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class MovieController {

    @Autowired
    private MovieDao movieDao;

    @GetMapping(value = "/Movies/title={movieTitle}")
    public Movie displayMovieByTitle(@PathVariable String movieTitle) {
        return null;
    }

    @GetMapping(value = "/Movies/genre={movieGenre}")
    public String displayMovieByGenre(@PathVariable String movieGenre){
        return "You are looking for the movies of genre: " + movieGenre;
    }

    @GetMapping(value = "/Movies/release_year={movieReleaseYear}")
    public String displayMovieByReleaseYear(@PathVariable String movieReleaseYear){
        return "You are looking for the movies released in: " + movieReleaseYear;
    }

}
