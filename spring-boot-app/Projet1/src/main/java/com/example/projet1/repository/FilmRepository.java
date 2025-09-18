package com.example.projet1.repository;

import com.example.projet1.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer> {
    public List<Film> findFilmByAnneeparution (int anneeparution);
}
