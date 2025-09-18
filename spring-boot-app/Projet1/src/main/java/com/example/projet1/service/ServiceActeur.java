package com.example.projet1.service;

import com.example.projet1.entities.Acteur;
import com.example.projet1.repository.ActeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceActeur implements IServiceActeur{
    @Autowired
    ActeurRepository acteurRepository;
    @Override
    public Acteur createActeur(Acteur a) {
        return acteurRepository.save(a);
    }

    @Override
    public Acteur findActeurById(int id) {
        return acteurRepository.findById(id).get();
    }

    @Override
    public Acteur updateActeur(Acteur a) {
        return acteurRepository.save(a);
    }

    @Override
    public List<Acteur> findAllActeurs() {
        return acteurRepository.findAll();
    }

    @Override
    public void deleteActeur(Acteur a) {
        acteurRepository.delete(a);
    }
}
