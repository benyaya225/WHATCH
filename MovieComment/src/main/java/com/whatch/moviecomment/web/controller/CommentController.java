package com.whatch.moviecomment.web.controller;
import com.whatch.moviecomment.model.Comment;
import com.whatch.moviecomment.dao.CommentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentDao commentDao;

    @GetMapping(value = "/Comments/MovieId={movieId}")
    public List<Comment> displayMovieComments(@PathVariable int movieId){
       return commentDao.findMovieComments(movieId);
    }

    @PostMapping(value = "/Comments")
    public void addAComment(@RequestBody Comment comment){
        commentDao.save(comment);
    }

}
