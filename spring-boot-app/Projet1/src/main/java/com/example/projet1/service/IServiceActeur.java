package com.example.projet1.service;


import com.example.projet1.entities.Acteur;

import java.util.List;

public interface IServiceActeur {
    public Acteur createActeur(Acteur a);
    public Acteur findActeurById(int id);
    public Acteur updateActeur(Acteur a);
    public List<Acteur> findAllActeurs();
    public void deleteActeur(Acteur a);
}
