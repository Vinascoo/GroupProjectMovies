package com.msg.groupprojectmovies.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalBookService {
    private final RestTemplate restTemplate = new RestTemplate();

    public String searchBooks(String query) {
        String url = "https://ipwho.is/books/v1/volumes?q=" + query;
        return restTemplate.getForObject(url, String.class);
    }
}
