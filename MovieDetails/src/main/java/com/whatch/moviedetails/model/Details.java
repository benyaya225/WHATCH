package com.whatch.moviedetails.model;

public class Details {
    private String title;
    private String plot;
    private int year;
    private double rating;
    private String directors;
    private String genres;
    private String image;
    private int runningTimeSecs;

    public Details(String title, String plot, int year, double rating, String directors, String genres, String image, int runningTimeSecs) {
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

    public String getDirectors() {
        return directors;
    }

    public String getGenres() {
        return genres;
    }

    public String getImage() {
        return image;
    }

    public int getRunningTimeSecs() {
        return runningTimeSecs;
    }
}
