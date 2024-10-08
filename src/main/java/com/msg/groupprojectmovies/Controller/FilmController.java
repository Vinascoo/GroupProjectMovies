package com.msg.groupprojectmovies.Controller;

import com.msg.groupprojectmovies.Model.Film;
import com.msg.groupprojectmovies.Services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// FilmController hanterar HTTP-förfrågningar relaterade till filmer,
// inklusive att hämta, skapa, uppdatera och ta bort filmresurser.
@RestController
@RequestMapping("/films")
public class FilmController {

    //lagt till @Autowired (Automatiskt injicera en instans av FilmService)
    @Autowired
    private FilmService filmService;



    //Commit 8 (Siyar): Lägger till @GetMapping för att mappa HTTP GET-förfrågningar till metoden

    @GetMapping
    public ResponseEntity<List<Film>> getAllFilms() {
        return ResponseEntity.ok(filmService.getAllFilms());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Film> getFilmById(@PathVariable Long id) {
        Film film = filmService.getFilmById(id);
        if (film != null) {
            return ResponseEntity.ok(film);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    //Lägger till @PostMapping för att hantera HTTP POST-förfrågningar
    // och skapa en ny film. Returnerar HTTP-status 201 (Created)
    // tillsammans med den sparade filmens data.- Commit 1 (Matteus)
    @PostMapping
    public ResponseEntity<Film> addFilm(@RequestBody Film film) {
        Film savedFilm = filmService.saveFilm(film);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedFilm);
    }

    //Lägger till @PutMapping för att uppdatera en befintlig film med nytt data
    // baserat på ett angivet ID i URL -Commit 2(Matteus)
    @PutMapping("/{id}")
    public ResponseEntity<Film> updateFilm(@PathVariable Long id, @RequestBody Film film) {
        film.setId(id);
        Film updatedFilm = filmService.saveFilm(film);
        return ResponseEntity.ok(updatedFilm);
    }
    //Lägger till @DeleteMapping för att radera en film baserat på ett
    // angivet ID i URL -Commit 3(Matteus)
    //
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFilm(@PathVariable Long id) {
        filmService.deleteFilm(id);
        return ResponseEntity.noContent().build();
    }
}