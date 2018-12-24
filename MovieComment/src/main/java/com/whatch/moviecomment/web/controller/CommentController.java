package com.whatch.moviecomment.web.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @GetMapping(value = "/Comments/{id}")
    public String displayMovieComments(@PathVariable int id){
        return "here are the comments for the movie of id" + id;
    }


}
