package com.whatch.moviedisplay.dao;
import com.whatch.moviedisplay.model.Movie;

import java.io.IOException;
import java.util.List;

public interface MovieDao {
    public Movie findByTitle(String title);
    public List<Movie> findByGenre(String genre);
    public List<Movie> findByReleaseYear(String releaseYear);
}
