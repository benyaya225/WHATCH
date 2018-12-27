package com.whatch.moviedetails.objectMapper;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.whatch.moviedetails.model.Details;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JacksonObjectMapper {
    public static void main(String[] args) throws IOException {
        getAllMovies();
    }

    public static List<Details> getAllMovies() throws IOException {

        List<Details> detailsList = new ArrayList<Details>();

        byte[] jsonData = Files.readAllBytes(Paths.get("src/main/resources/jsonFiles/moviesDetail.json"));

        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode rootNode = objectMapper.readTree(jsonData);

        Iterator<JsonNode> rootElements = rootNode.elements();

        while (rootElements.hasNext()) {

            JsonNode movieNode = rootElements.next();

            JsonNode titleNode = movieNode.path("title");

            JsonNode plotNode = movieNode.path("plot");

            JsonNode yearNode = movieNode.path("year");

            JsonNode ratingNode = movieNode.path("rating");

            JsonNode directorsNode = movieNode.path("directors");

            List<String> directorsList = new ArrayList<String>();

            Iterator<JsonNode> directorsElements = directorsNode.elements();
            while(directorsElements.hasNext()){
                JsonNode director = directorsElements.next();
                directorsList.add(director.asText());
            }

            JsonNode genresNode = movieNode.path("genres");

            /*
            List<String> genresList = new ArrayList<String>();

            Iterator<JsonNode> genresElements = genresNode.elements();
            while(genresElements.hasNext()){
                JsonNode genre = genresElements.next();
                genresList.add(genre.asText());
            }
            */

            JsonNode imageNode = movieNode.path("image");

            JsonNode runningTimeSecsNode = movieNode.path("running_time_secs");

            detailsList.add(new Details(titleNode.asText(), plotNode.asText(), yearNode.asInt(), ratingNode.asDouble(), directorsNode.asText(), genresNode.asText(), imageNode.asText(), runningTimeSecsNode.asInt()));
        }

        return detailsList;
    }
}