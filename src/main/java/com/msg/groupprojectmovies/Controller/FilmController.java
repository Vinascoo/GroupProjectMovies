package com.msg.groupprojectmovies.Controller;

import com.msg.groupprojectmovies.Model.Film;
import com.msg.groupprojectmovies.Services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {

    @Autowired
    private FilmService filmService;

    // Hämta alla filmer
    @GetMapping
    public List<Film> getAllFilms() {
        return filmService.getAllFilms();
    }
}

// Hämta film baserat på ID

