package com.whatch.moviecomment.dao;
import com.whatch.moviecomment.model.Comment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class CommentDaoImpl implements CommentDao {

    public static List<Comment> comments = new ArrayList<>();
    static {
        comments.add(new Comment(1, "cmez", 5, "Very interesting plot and good actors."));
        comments.add(new Comment(1, "bly", 2, "Very annoying plot and mediocre main actors."));
        comments.add(new Comment(2, "bdao", 4, "Good movie."));
    }
    @Override
    public List<Comment> findByMovieId(int movieId){
        List<Comment> result = new ArrayList<>();
        for (Comment comment : comments){
            if(comment.getMovieId() == movieId){
                result.add(comment);
                return result;
            }
        }
        return result;
    }

    @Override
    public Comment save(Comment comment){
        comments.add(comment);
        return comment;
    }
}
