package com.whatch.moviedetails.dao;

import com.whatch.moviedetails.model.Details;
import com.whatch.moviedetails.objectMapper.JacksonObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Repository
public class DetailsDaoImpl implements DetailsDao{

    List<Details> detailsList = new ArrayList<Details>();

    private boolean isSameTitle(String movieTitle, String searchTitle) {
        if(movieTitle.contains(searchTitle)){
            return true;
        }
        else {
            return false;
        }
    }

    private boolean isSameYear(int movieYear, int searchYear) {
        if(movieYear == searchYear){
            return true;
        }
        else {
            return false;
        }
    }

    private boolean isSameDirector(List<String> movieDirectors, String searchDirector) {
        boolean gotSameDirector = false;
        ListIterator<String> directorsIterator = movieDirectors.listIterator();
        while(directorsIterator.hasNext()){
            String director = directorsIterator.next().toLowerCase();
            if(director.contains(searchDirector)){
                gotSameDirector = true;
            }
        }
        if(gotSameDirector == true) {
            return true;
        }
        else {
            return false;
        }
    }

    /*
    private boolean isSameGenre(List<String> movieGenres, String searchGenre) {
        if(movieTitle.contains(searchTitle)){
            return true;
        }
        else {
            return false;
        }
    }
    */

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
    public List<Details> findByTitle(String title) {
        List<Details> detailsListByTitle = new ArrayList<Details>();
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            String movieTitle = details.getTitle().toLowerCase();
            String searchTitle = title.toLowerCase();
            if(isSameTitle(movieTitle, searchTitle)){
                detailsListByTitle.add(details);
            }
        }
        return detailsListByTitle;
    }

    @Override
    public List<Details> findByDirector(String director) {
        List<Details> detailsListByDirector = new ArrayList<Details>();
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            List<String> movieDirectors = details.getDirectors();
            String searchDirector = director.toLowerCase();
            if(isSameDirector(movieDirectors, searchDirector)){
                detailsListByDirector.add(details);
            }
        }
        return detailsListByDirector;
    }

    @Override
    public Details findByYear(int year) {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            if(details.getYear() == year){
                return details;
            }
        }
        return null;
    }

    @Override
    public Details findGenre(String genre) {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            if(details.getGenres().equals(genre)){
                return details;
            }
        }
        return null;
    }

    @Override
    public Details findByTitleAndDirector(String title, String director) {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            if((details.getTitle().equals(title)) || (details.getDirectors().equals(director))){
                return details;
            }
        }
        return null;
    }

    @Override
    public Details findByTitleAndYear(String title, int year) {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            if((details.getTitle().equals(title)) || (details.getYear() == year)){
                return details;
            }
        }
        return null;
    }

    @Override
    public Details findByTitleAndGenre(String title, String genre) {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            if((details.getTitle().equals(title)) || (details.getGenres().equals(genre))){
                return details;
            }
        }
        return null;
    }

    @Override
    public Details findByDirectorAndYear(String director, int year) {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            if((details.getDirectors().equals(director)) || (details.getYear() == year)){
                return details;
            }
        }
        return null;
    }

    @Override
    public Details findByDirectorAndGenre(String director, String genre) {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            if((details.getDirectors().equals(director)) || (details.getGenres().equals(genre))){
                return details;
            }
        }
        return null;
    }

    @Override
    public Details findByYearAndGenre(int year, String genre) {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            if((details.getYear() == year) || (details.getGenres().equals(genre))){
                return details;
            }
        }
        return null;
    }

    @Override
    public Details findByTitleAndDirectorAndYear(String title, String director, int year) {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            if((details.getTitle().equals(title)) || (details.getDirectors().equals(director)) || (details.getYear() == year)){
                return details;
            }
        }
        return null;
    }

    @Override
    public Details findByTitleAndDirectorAndGenre(String title, String director, String genre) {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            if((details.getTitle().equals(title)) || (details.getDirectors().equals(director)) || (details.getGenres().equals(genre))){
                return details;
            }
        }
        return null;
    }

    @Override
    public Details findByTitleAndYearAndGenre(String title, int year, String genre) {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            if((details.getTitle().equals(title)) || (details.getYear() == year) || (details.getGenres().equals(genre))){
                return details;
            }
        }
        return null;
    }

    @Override
    public Details findByDirectorAndYearAndGenre(String director, int year, String genre) {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            if((details.getDirectors().equals(director)) || (details.getYear() == year) || details.getGenres().equals(genre)){
                return details;
            }
        }
        return null;
    }

    @Override
    public Details findByTitleAndDirectorAndYearAndGenre(String title, String director, int year, String genre) {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            if((details.getTitle().equals(title)) || (details.getDirectors().equals(director)) || (details.getYear() == year) || details.getGenres().equals(genre)){
                return details;
            }
        }
        return null;
    }
}
