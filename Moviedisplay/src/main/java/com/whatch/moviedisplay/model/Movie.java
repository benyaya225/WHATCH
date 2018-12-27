package com.whatch.moviedisplay.model;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private Long id;
    private String actors;
    private String re_release_date;
    private String release_date;
    private String directors;
    private String duration;
    private String genre;
    private String nationality;
    private int nber_press_vote;
    private int nber_user_vote;
    private double press_rating;
    private double user_rating;
    private String movie_title;



    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n-----Movie Information-----\n");
        stringBuilder.append("id: " + getId() + "\n" );
        stringBuilder.append("actors: " + getActors() + "\n" );
        stringBuilder.append("re release date: " + getRe_release_date() + "\n" );
        stringBuilder.append("directors: " + getDirectors() + "\n" );
        stringBuilder.append("duration: " + getDuration() + "\n" );
        stringBuilder.append("genre: " + getGenre() + "\n" );
        stringBuilder.append("nationality: " + getNationality() + "\n" );
        stringBuilder.append("nber_press_vote: " + getNber_press_vote() + "\n" );
        stringBuilder.append("nber_user_vote: " + getNber_user_vote() + "\n" );
        stringBuilder.append("press_rating" + getPress_rating() + "\n" );
        stringBuilder.append("user_rating: " + getUser_rating() + "\n" );
        stringBuilder.append("movie_title: " + getMovie_title() + "\n" );
        return stringBuilder.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getRe_release_date() {
        return re_release_date;
    }

    public void setRe_release_date(String re_release_date) {
        this.re_release_date = re_release_date;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getNber_press_vote() {
        return nber_press_vote;
    }

    public void setNber_press_vote(int nber_press_vote) {
        this.nber_press_vote = nber_press_vote;
    }

    public int getNber_user_vote() {
        return nber_user_vote;
    }

    public void setNber_user_vote(int nber_user_vote) {
        this.nber_user_vote = nber_user_vote;
    }

    public double getPress_rating() {
        return press_rating;
    }

    public void setPress_rating(double press_rating) {
        this.press_rating = press_rating;
    }

    public double getUser_rating() {
        return user_rating;
    }

    public void setUser_rating(double user_rating) {
        this.user_rating = user_rating;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }
}
