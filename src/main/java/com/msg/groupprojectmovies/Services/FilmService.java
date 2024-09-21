package com.msg.groupprojectmovies.Services;

import com.msg.groupprojectmovies.Model.Film;
import com.msg.groupprojectmovies.Repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Lägger till @Service-annoteringen och FilmService-klassen- commit 5 (Matteus)
@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;
    //Lägger till metoden getAllFilms för att hämta alla filmer.- Commit 6(Matteus)
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }
    //Commit 7 (Matteus): Lägger till metod för att hämta alla filmer i FilmService.
    public Film getFilmById(Long id) {
        Optional<Film> film = filmRepository.findById(id);
        return film.orElse(null);
    }
    //Lägger till metoder för att spara, ta bort och söka filmer. -Commit 8(Matteus)
    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }

    public void deleteFilm(Long id) {
        filmRepository.deleteById(id);
    }

    public List<Film> searchFilmsByTitle(String title) {
        return filmRepository.findByTitleContainingIgnoreCase(title);
    }
}