package com.whatch.moviedisplay.dao;
import com.whatch.moviedisplay.jsonreader.MyObjectMapper;
import com.whatch.moviedisplay.model.Movie;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;


@Repository
public class MovieDaoImpl implements MovieDao {

    private MyObjectMapper myObjectMapper;

    @Override
    public Movie findByTitle(String title){
        return null;
    }

    @Override
    public List<Movie> findByGenre(String genre){
        return null;
    }

    @Override
    public List<Movie> findByReleaseYear(String releaseYear){
        return null;
    }

}
