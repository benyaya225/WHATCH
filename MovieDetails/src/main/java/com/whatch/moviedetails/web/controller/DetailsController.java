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

    @GetMapping(value="/MoviesDetails/MovieTitle={title}/MovieYear={year}")
    public Details displayMovieDetails(@PathVariable String title,@PathVariable int year) {
        return detailsDao.findByTitleAndYear(title, year);
    }
}
