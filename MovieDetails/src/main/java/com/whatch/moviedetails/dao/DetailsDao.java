package com.whatch.moviedetails.dao;

import com.whatch.moviedetails.model.Details;

import java.util.List;

public interface DetailsDao {
    public List<Details> findAll();
    public List<Details> findByTitle(String title);
    public List<Details> findByDirector(String director);
    public Details findByYear(int year);
    public Details findGenre(String genre);
    public Details findByTitleAndDirector(String title, String director);
    public Details findByTitleAndYear(String title, int year);
    public Details findByTitleAndGenre(String title, String genre);
    public Details findByDirectorAndYear(String director, int year);
    public Details findByDirectorAndGenre(String director, String genre);
    public Details findByYearAndGenre(int year, String genre);
    public Details findByTitleAndDirectorAndYear(String title, String director, int year);
    public Details findByTitleAndDirectorAndGenre(String title, String director, String genre);
    public Details findByTitleAndYearAndGenre(String title, int year, String genre);
    public Details findByDirectorAndYearAndGenre(String director, int year, String genre);
    public Details findByTitleAndDirectorAndYearAndGenre(String title, String director, int year, String genre);
}
