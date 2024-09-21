package com.msg.groupprojectmovies.Repositories;

import com.msg.groupprojectmovies.Model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {

    // Commit 1 (Siyar): Lagt till metod för att söka filmer baserat på titel.
    List<Film> findByTitleContainingIgnoreCase(String title);
}