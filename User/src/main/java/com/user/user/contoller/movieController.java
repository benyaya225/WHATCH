package com.user.user.contoller;

import com.user.user.model.Movie;
import com.user.user.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class movieController {
    @Qualifier("movieRepository")
    @Autowired
    MovieRepository movieRepository;


    @PostMapping("user/{id}/fav")
    public Movie Save(@RequestBody Movie movie){
        return movieRepository.save(movie);
    }
}
