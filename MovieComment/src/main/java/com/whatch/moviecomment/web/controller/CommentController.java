package com.whatch.moviecomment.web.controller;
import com.whatch.moviecomment.model.Comment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @GetMapping(value = "/Comments/{movieId}")
    public Comment displayMovieComments(@PathVariable int movieId){
        Comment comment = new Comment(movieId, "cmez", 5, "Very ineresting plot and good actors.");
        return comment;
    }


}
