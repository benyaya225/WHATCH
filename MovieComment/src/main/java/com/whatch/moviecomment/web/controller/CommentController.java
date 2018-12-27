package com.whatch.moviecomment.web.controller;
import com.whatch.moviecomment.model.Comment;
import com.whatch.moviecomment.dao.CommentDao;
import com.whatch.moviecomment.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class CommentController {

    @Qualifier("commentRepository")
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping(value = "/Comments/MovieId={movieId}")
    public List<Comment> displayMovieComments(@PathVariable int movieId){
       return commentRepository.findByMovieId(movieId);
    }

    @PostMapping(value = "/Comments")
    public Comment addAComment(@RequestBody Comment comment){
       return commentRepository.save(comment);
    }

}
