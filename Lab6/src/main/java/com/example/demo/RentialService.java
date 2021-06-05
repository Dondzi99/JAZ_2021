package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RentialService {

    @Autowired RestConfig restConfig;

    public Movie getMovie(Integer ID)
    {
        return restConfig.restTemplate().getForObject("http://localhost:8080/controller/movies/"+ID, Movie.class);
    }

    public void returnMovie(Integer ID)
    {
        restConfig.restTemplate().put(
                "http://localhost:8080/controller/movies/setAvailable/"+ID,
                HttpMethod.PUT, null, Void.class);
    }
}
