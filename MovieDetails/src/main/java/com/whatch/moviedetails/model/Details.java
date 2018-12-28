package com.whatch.moviedetails.model;

import java.util.List;

public class Details {
    private String title;
    private String plot;
    private int year;
    private double rating;
    private List<String> directors;
    private List<String> genres;
    private String image;
    private int runningTimeSecs;

    public Details(String title, String plot, int year, double rating, List<String> directors, List<String> genres, String image, int runningTimeSecs) {
        this.title = title;
        this.plot = plot;
        this.year = year;
        this.rating = rating;
        this.directors = directors;
        this.genres = genres;
        this.image = image;
        this.runningTimeSecs = runningTimeSecs;
    }

    public String getTitle() {
        return title;
    }

    public String getPlot() {
        return plot;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public List<String> getDirectors() {
        return directors;
    }

    public List<String> getGenres() {
        return genres;
    }

    public String getImage() {
        return image;
    }

    public int getRunningTimeSecs() {
        return runningTimeSecs;
    }
}
