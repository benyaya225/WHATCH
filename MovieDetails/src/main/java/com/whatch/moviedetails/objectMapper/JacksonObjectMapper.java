package com.whatch.moviedetails.objectMapper;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class JacksonObjectMapper {
    public static void main(String[] args) throws IOException {

        byte[] jsonData = Files.readAllBytes(Paths.get("src/main/resources/jsonFiles/moviesTest.json"));

        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode rootNode = objectMapper.readTree(jsonData);

        Iterator<JsonNode> elements = rootNode.elements();

        while(elements.hasNext()) {

            JsonNode movieNode = elements.next();

            JsonNode actorsNode = movieNode.path("actors");
            System.out.println("actors = " + actorsNode);

            JsonNode releaseDateNode = movieNode.path("release_date");
            System.out.println("releaseDate = " + releaseDateNode);

            JsonNode directorsNode = movieNode.path("directors");
            System.out.println("directors = " + directorsNode);

            JsonNode genreNode = movieNode.path("genre");
            System.out.println("genre = " + genreNode);

            JsonNode pressRatingNode = movieNode.path("press_rating");
            System.out.println("pressRating = " + pressRatingNode);

            JsonNode movieTitleNode = movieNode.path("movie_title");
            System.out.println("movieTitle = " + movieTitleNode);
        }
    }
}