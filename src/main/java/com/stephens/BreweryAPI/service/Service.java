package com.stephens.BreweryAPI.service;

import com.stephens.BreweryAPI.exception.BreweryNotFoundException;
import com.stephens.BreweryAPI.model.Brewery;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@org.springframework.stereotype.Service
public class Service {

    @Value("${brewery.url}")
    String baseUrl;
    @Value("${brewery.url.search}")
    String search;

    RestTemplate restTemplate = new RestTemplate();

    public List<Brewery> getAllBrews() {
        return brewsHelper(baseUrl);
    }

    public List<Brewery> getUserById(String name) {
        return brewsHelper(baseUrl + search + name);
    }

    public List<Brewery> brewsHelper(String url) {
        List<Brewery> standardizedBrewsArray = null;
        try {
            Brewery[] breweryArray = restTemplate.getForObject(url, Brewery[].class);
            standardizedBrewsArray = Arrays.asList(Objects.requireNonNull(breweryArray));
        } catch (BreweryNotFoundException ex) {
            System.out.println("Brewery Not Found: " + ex);
        }
        return standardizedBrewsArray;
    }
}
