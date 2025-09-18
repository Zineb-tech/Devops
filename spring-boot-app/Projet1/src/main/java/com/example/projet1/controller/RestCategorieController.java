package com.example.projet1.controller;

import com.example.projet1.entities.Categorie;
import com.example.projet1.service.IServiceCategorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class RestCategorieController {
    @Autowired
    IServiceCategorie iServiceCategorie;

    @GetMapping("")
    public List<Categorie> getall(){
        return iServiceCategorie.findAllCategories();
    }

    @GetMapping("/getparid/{id}")
    public Categorie getCategorie(@PathVariable int id){
        return iServiceCategorie.findCategorieById(id);
    }

    @PostMapping("/add")
    public Categorie ajoutCategorie(@RequestBody Categorie f){
        return iServiceCategorie.createCategorie(f);
    }

    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable int id)
    {
        iServiceCategorie.deleteCategorie(iServiceCategorie.findCategorieById(id));
        return "film supprimé";
    }
    @PutMapping("/update")
    public Categorie modifCategorie(@RequestBody Categorie f){
        return iServiceCategorie.updateCategorie(f);
    }
}
