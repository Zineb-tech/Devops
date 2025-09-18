package com.example.projet1.controller;

import com.example.projet1.entities.Film;
import com.example.projet1.service.IServiceActeur;
import com.example.projet1.service.IServiceCategorie;
import com.example.projet1.service.IserviceFilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/film/")
public class FilmController {
    @Autowired
    IserviceFilm iServiceFilm;
    @Autowired
    IServiceCategorie iServiceCategorie;
    @Autowired
    IServiceActeur iServiceActeur;

    @GetMapping("all")
    public String all (Model model)
    {
        model.addAttribute("films",iServiceFilm.findAllFilms());
        model.addAttribute("acteurs",iServiceActeur.findAllActeurs());
        return "affiche";
    }
    @GetMapping("new")
    public String afficheNewForm(Model model)
    {
        model.addAttribute("categories",iServiceCategorie.findAllCategories());
        model.addAttribute("acteurs",iServiceActeur.findAllActeurs());
        return "ajout";
    }
    @PostMapping("add")
    public String add(Film f)
    {
        iServiceFilm.createFilm(f);
        return "redirect:/film/all";
    }
    @GetMapping("delete/{id}")
    public String delete (@PathVariable int id)
    {
        iServiceFilm.deleteFilm(iServiceFilm.findFilmById(id));
        return "redirect:/film/all";
    }
    @GetMapping("edit/{id}")
    public String modifier (@PathVariable int id, Model model)
    {
        model.addAttribute("film", iServiceFilm.findFilmById(id));
        model.addAttribute("categories",iServiceCategorie.findAllCategories());
        return "edit";
    }
    @PostMapping("update")
    public String update(Film f)
    {
        iServiceFilm.updateFilm(f);
        return "redirect:/film/all";
    }
}