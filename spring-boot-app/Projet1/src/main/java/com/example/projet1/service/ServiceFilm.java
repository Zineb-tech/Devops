package com.example.projet1.service;

import com.example.projet1.entities.Film;
import com.example.projet1.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceFilm  implements IserviceFilm{
    @Autowired
    FilmRepository filmRepository;
    @Override
    public Film createFilm(Film f) {
        return filmRepository.save(f);
    }

    @Override
    public Film findFilmById(int id) {
        return filmRepository.findById(id).get();
    }

    @Override
    public Film updateFilm(Film f) {
        return filmRepository.save(f);
    }

    @Override
    public List<Film> findAllFilms() {
        return filmRepository.findAll();
    }

    @Override
    public void deleteFilm(Film f) {
        filmRepository.delete(f);
    }

    @Override
    public Boolean filmExist(int id){
        return filmRepository.existsById(id);
    }

    @Override
    public List<Film> findFilmByAnneeparution(int anneeparution){
        return filmRepository.findFilmByAnneeparution(anneeparution);
    }
}
