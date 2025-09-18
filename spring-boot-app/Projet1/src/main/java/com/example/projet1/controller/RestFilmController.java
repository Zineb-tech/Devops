package com.example.projet1.controller;

import com.example.projet1.entities.Film;
import com.example.projet1.exception.FilmNotfoundException;
import com.example.projet1.service.IserviceFilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/films")
public class RestFilmController {
    @Autowired
    IserviceFilm iserviceFilm;

    @GetMapping("")
    public List<Film> getall(){
        return iserviceFilm.findAllFilms();
    }

    @GetMapping("/getparid/{id}")
    public Film getFilm(@PathVariable int id){
        if(!iserviceFilm.filmExist(id))throw new FilmNotfoundException();
        return iserviceFilm.findFilmById(id);
    }

    @PostMapping("/add")
    public Film ajoutFilm(@RequestBody Film f){
        return iserviceFilm.createFilm(f);
    }

    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable int id)
    {
        if(!iserviceFilm.filmExist(id))throw new FilmNotfoundException();
        iserviceFilm.deleteFilm(iserviceFilm.findFilmById(id));
        return "film supprimé";
    }
    @PutMapping("/update")
    public Film modifFilm(@RequestBody Film f){
        if(!iserviceFilm.filmExist(f.getId()))throw new FilmNotfoundException();
        return iserviceFilm.updateFilm(f);
    }

    @GetMapping("/getParAnnee/{a}")
    public List<Film> getFilmsParAnnee(@PathVariable int a){
        return iserviceFilm.findFilmByAnneeparution(a);
    }
}
