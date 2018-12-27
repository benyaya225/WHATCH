package com.whatch.moviecomment.repository;

import com.whatch.moviecomment.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("commentRepository")
public interface CommentRepository extends JpaRepository<Comment,Integer> {
    List<Comment> findByMovieId(int movieId);
}
