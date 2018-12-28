package com.whatch.moviecomment.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="comment_id")
    private int id;
    @Column(name = "movie_id")
    private int movieId;
    @Column(name = "username")
    private String username;
    @Column(name = "user_rate")
    private int userRate;
    @Column(name = "content")
    private String content;


    public Comment(int movieId, String username, int userRate, String content) {
        this.movieId = movieId;
        this.username = username;
        this.userRate = userRate;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
