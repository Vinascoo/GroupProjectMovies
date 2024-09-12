package com.msg.groupprojectmovies.Services;

import com.msg.groupprojectmovies.Model.Film;
import com.msg.groupprojectmovies.Repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;

    // Hämta alla filmer
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    // Hämta film baserat på ID
    public Film getFilmById(Long id) {
        return filmRepository.findById(id).orElse(null);
    }

    // Spara ny film eller uppdatera befintlig
    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }

    // Ta bort film baserat på ID
    public void deleteFilm(Long id) {
        filmRepository.deleteById(id);
    }

    // Sök filmer baserat på titel
    public List<Film> searchFilmsByTitle(String title) {
        return filmRepository.findByTitleContaining(title);
    }

    // Sök filmer baserat på regissör
    public List<Film> searchFilmsByDirector(String director) {
        return filmRepository.findByDirector(director);
    }

    // Sök filmer baserat på genre
    public List<Film> searchFilmsByGenre(String genre) {
        return filmRepository.findByGenre(genre);
    }
}
