package com.example.projet1.service;

import com.example.projet1.entities.Film;

import java.util.List;

public interface IserviceFilm {
    public Film createFilm(Film f);
    public Film findFilmById(int id);
    public Film updateFilm(Film f);
    public List<Film> findAllFilms();
    public void deleteFilm(Film f);
    public Boolean filmExist(int id);

    List<Film> findFilmByAnneeparution(int anneeparution);
}
