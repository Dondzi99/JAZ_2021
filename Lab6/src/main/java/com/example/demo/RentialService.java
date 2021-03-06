package com.example.demo;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RentialService {

    private final RestTemplate restTemplate;

    public RentialService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie getMovie(Integer ID)
    {
        return restTemplate.getForObject("http://localhost:8080/controller/movies/"+ID, Movie.class);
    }

    public void returnMovie(Integer ID)
    {
        restTemplate.put(
                "http://localhost:8080/controller/movies/setAvailableT/"+ID,
                HttpMethod.PUT, null, Void.class);
    }

    public void movieGet(Integer ID)
    {
        restTemplate.put(
                "http://localhost:8080/controller/movies/setAvailableF/"+ID,
                HttpMethod.PUT, null, Void.class);
    }
}
