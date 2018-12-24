package com.whatch.moviecomment.model;

public class Comment {
    private int movieId;
    private String username;
    private int userRate;
    private String content;

    //Default constructor
    public Comment() {
    }


    public Comment(int movieId, String username, int userRate, String content) {
        this.movieId = movieId;
        this.username = username;
        this.userRate = userRate;
        this.content = content;
    }


    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserRate() {
        return userRate;
    }

    public void setUserRate(int userRate) {
        this.userRate = userRate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "movieId=" + movieId +
                ", username='" + username + '\'' +
                ", userRate=" + userRate +
                ", content='" + content + '\'' +
                '}';
    }
}
