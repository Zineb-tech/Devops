package com.example.projet1.controller;


import com.example.projet1.entities.Acteur;
import com.example.projet1.service.IServiceActeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/acteur/")
public class ActeurController {

    @Autowired
    IServiceActeur iServiceActeur;

    @GetMapping("all")
    public String all(Model model){
        model.addAttribute("acteurs", iServiceActeur.findAllActeurs());
        return "afficheActeur";
    }

    @GetMapping("new")
    public String afficheNewForm(Model model){

        return "ajoutActeur";
    }
    @PostMapping("add")
    public String add(Acteur a){
        iServiceActeur.createActeur(a);
        return "redirect:/acteur/all";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable int id){
        iServiceActeur.deleteActeur(iServiceActeur.findActeurById(id));
        return "redirect:/acteur/all";
    }


    @GetMapping("edit/{id}")
    public String afficheFormModif(@PathVariable int id, Model model){
        Acteur acteur = iServiceActeur.findActeurById(id);
        model.addAttribute("acteur", acteur);
        return "editActeur";
    }
    @PostMapping("update")
    public String update(Acteur f){
        iServiceActeur.updateActeur(f);
        return "redirect:/acteur/all";
    }
}
