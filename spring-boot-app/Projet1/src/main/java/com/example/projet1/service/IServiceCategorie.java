package com.example.projet1.service;

import com.example.projet1.entities.Categorie;

import java.util.List;

public interface IServiceCategorie {
    public Categorie createCategorie(Categorie c);
    public Categorie findCategorieById(int id);
    public Categorie updateCategorie(Categorie c);
    public List<Categorie> findAllCategories();
    public void deleteCategorie(Categorie c);
}
