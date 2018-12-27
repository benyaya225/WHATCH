package com.user.user.repository;

import com.user.user.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("movieRepository")
public interface MovieRepository extends JpaRepository<Movie,Integer> {

}
