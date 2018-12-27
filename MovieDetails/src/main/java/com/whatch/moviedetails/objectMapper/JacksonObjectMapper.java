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

        Iterator<JsonNode> elements = rootNode.elements();

        while (elements.hasNext()) {

            JsonNode movieNode = elements.next();

            JsonNode titleNode = movieNode.path("title");

            JsonNode plotNode = movieNode.path("plot");

            JsonNode yearNode = movieNode.path("year");

            JsonNode imageNode = movieNode.path("image");

            detailsList.add(new Details(titleNode.asText(), plotNode.asText(), yearNode.asInt(), imageNode.asText()));
        }

        return detailsList;
    }
}