package com.whatch.moviedisplay.jsonreader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.whatch.moviedisplay.model.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.IOException;

public class MyObjectMapper {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public Movie readJsonWithObjectMapper() throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        Movie movie = objectMapper.readValue(new File("C:\\Javaprojects\\BJTU_Cloud_Project_WHATCH\\WHATCH\\Moviedisplay\\src\\main\\resources\\json\\movies.json"), Movie.class);
        logger.info(movie.toString());
        return movie;
    }


}
