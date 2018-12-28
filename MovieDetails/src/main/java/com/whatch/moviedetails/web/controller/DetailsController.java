package com.whatch.moviedetails.web.controller;

import com.whatch.moviedetails.dao.DetailsDao;
import com.whatch.moviedetails.model.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DetailsController {
    @Autowired
    private DetailsDao detailsDao;

    @RequestMapping(value="/MoviesDetails", method= RequestMethod.GET)
    public List<Details> displayMovieList() {
        return detailsDao.findAll();
    }


    @GetMapping(value="/MoviesDetails/MovieTitle={title}")
    public List<Details> displayMovieDetailsByTitle(@PathVariable String title) {
        return detailsDao.findByTitle(title);
    }

    @GetMapping(value="/MoviesDetails/MovieDirector={director}")
    public List<Details> displayMovieDetailsByDirector(@PathVariable String director) {
        return detailsDao.findByDirector(director);
    }

    @GetMapping(value="/MoviesDetails/MovieYear={year}")
    public Details displayMovieDetailsByYear(@PathVariable int year) {
        return detailsDao.findByYear(year);
    }

    /*
    @GetMapping(value="/MoviesDetails/MovieTitle={title}/MovieYear={year}")
    public Details displayMovieDetailsByGenre(@PathVariable String genre) {
        return detailsDao.findGenre(genre);
    }

    @GetMapping(value="/MoviesDetails/MovieTitle={title}/MovieYear={year}")
    public Details displayMovieDetailsByTitleAndDirector(@PathVariable String title, @PathVariable String director) {
        return detailsDao.findByTitleAndDirector(title, director);
    }
    */

    @GetMapping(value="/MoviesDetails/MovieTitle={title}/MovieYear={year}")
    public Details displayMovieDetailsByTitleAndYear(@PathVariable String title, @PathVariable int year) {
        return detailsDao.findByTitleAndYear(title, year);
    }

    /*
    @GetMapping(value="/MoviesDetails/MovieTitle={title}/MovieYear={year}")
    public Details displayMovieDetailsTitleAndGenre(@PathVariable String title, @PathVariable String genre) {
        return detailsDao.findByTitleAndGenre(title, genre);
    }

    @GetMapping(value="/MoviesDetails/MovieTitle={title}/MovieYear={year}")
    public Details displayMovieDetailsByDirectorAndYear(@PathVariable String director, @PathVariable int year) {
        return detailsDao.findByDirectorAndYear(director, year);
    }

    @GetMapping(value="/MoviesDetails/MovieTitle={title}/MovieYear={year}")
    public Details displayMovieDetailsByDirectorAndGenre(@PathVariable String director, @PathVariable String genre) {
        return detailsDao.findByDirectorAndGenre(director, genre);
    }

    @GetMapping(value="/MoviesDetails/MovieTitle={title}/MovieYear={year}")
    public Details displayMovieDetailsByYearAndGenre(@PathVariable int year, @PathVariable String genre) {
        return detailsDao.findByYearAndGenre(year, genre);
    }

    @GetMapping(value="/MoviesDetails/MovieTitle={title}/MovieYear={year}")
    public Details displayMovieDetailsByTitleAndDirectorAndYear(@PathVariable String title, @PathVariable String director, @PathVariable int year) {
        return detailsDao.findByTitleAndDirectorAndYear(title, director, year);
    }

    @GetMapping(value="/MoviesDetails/MovieTitle={title}/MovieYear={year}")
    public Details displayMovieDetailsByTitleAndDirectorAndGenre(@PathVariable String title, @PathVariable String director, @PathVariable String genre) {
        return detailsDao.findByTitleAndDirectorAndGenre(title, director, genre);
    }

    @GetMapping(value="/MoviesDetails/MovieTitle={title}/MovieYear={year}")
    public Details displayMovieDetailsByTitleAndYearAndGenre(@PathVariable String title, @PathVariable int year, @PathVariable String genre) {
        return detailsDao.findByTitleAndYearAndGenre(title, year, genre);
    }

    @GetMapping(value="/MoviesDetails/MovieTitle={title}/MovieYear={year}")
    public Details displayMovieDetailsByDirectorAndYearAndGenre(@PathVariable String director, @PathVariable int year, @PathVariable String genre) {
        return detailsDao.findByDirectorAndYearAndGenre(director, year, genre);
    }

    @GetMapping(value="/MoviesDetails/MovieTitle={title}/MovieYear={year}")
    public Details displayMovieDetailsByTitleAndDirectorAndYearAndGenre(@PathVariable String title, @PathVariable String director, @PathVariable int year, @PathVariable String genre) {
        return detailsDao.findByTitleAndDirectorAndYearAndGenre(title, director, year, genre);
    }
    */
}
