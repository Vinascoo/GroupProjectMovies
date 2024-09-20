package com.msg.groupprojectmovies.Repositories;

import com.msg.groupprojectmovies.Model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {
    List<Film> findByTitleContainingIgnoreCase(String title);
}