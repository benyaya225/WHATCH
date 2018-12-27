package com.whatch.moviedetails.dao;

import com.whatch.moviedetails.model.Details;
import com.whatch.moviedetails.objectMapper.JacksonObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

@Repository
public class DetailsDaoImpl implements DetailsDao{

    List<Details> detailsList;

    @Override
    public List<Details> findAll() {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        return detailsList;
    }

    @Override
    public Details findByTitleAndYear(String title, int year) {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            if((details.getTitle().equals(title)) && (details.getYear() == year)){
                return details;
            }
        }
        return null;
    }
}
