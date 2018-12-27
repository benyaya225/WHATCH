package com.whatch.moviedetails.model;

public class Details {
    private String title;
    private String plot;
    private int year;
    private String image;

    public Details(String title, String plot, int year, String image) {
        this.title = title;
        this.plot = plot;
        this.year = year;
        this.image = image;
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

    public String getImage() {
        return image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
