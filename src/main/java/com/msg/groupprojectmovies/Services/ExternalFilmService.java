package com.msg.groupprojectmovies.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalFilmService {
    private final RestTemplate restTemplate = new RestTemplate();

    public String searchFilms(String query) {
        String url = "https://api.themoviedb.org/3/search/movie?api_key=8d9d0b4a259a870ed0ffa76eb055d047&query=" + query;
        return restTemplate.getForObject(url, String.class);
    }
}