package com.whatch.moviedetails.dao;

import com.whatch.moviedetails.model.Details;

import java.util.List;

public interface DetailsDao {
    public List<Details> findAll();
    public Details findByTitleAndYear(String title, int year);
}
