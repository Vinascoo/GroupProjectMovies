package com.msg.groupprojectmovies.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalFilmService {
    private final RestTemplate restTemplate = new RestTemplate();

    public String searchFilms(String query) {
        String url = "https://api.themoviedb.org/3/search/movie?api_key=df0eb7f0729911f3781785d3811ec8dd&query=" + query;
        return restTemplate.getForObject(url, String.class);
    }
}
