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
    public Details findByTitle(String title) {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            if(details.getTitle().equals(title)){
                return details;
            }
        }
        return null;
    }

    @Override
    public Details findByDirector(String director) {
        try {
            detailsList = JacksonObjectMapper.getAllMovies();
        } catch(IOException ie) {
            ie.printStackTrace();
        }
        for (Details details : detailsList) {
            if(details.getDirectors().equals(director)){
                return details;
            }
        }
        return null;
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
