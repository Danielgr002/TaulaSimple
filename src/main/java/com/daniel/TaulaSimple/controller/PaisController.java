package com.daniel.TaulaSimple.controller;

import com.daniel.TaulaSimple.Servicios.CiutatsService;
import com.daniel.TaulaSimple.Servicios.LlistarBDA;
import com.daniel.TaulaSimple.Servicios.PaisService;
import com.daniel.TaulaSimple.model.Ciutat;
import com.daniel.TaulaSimple.model.CiutatRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PaisController {
    @Autowired
    PaisService paisService;

    @GetMapping("/paisos")
    public String getPaisos(Model model) {
        model.addAttribute("paisos", paisService.getAllPaisos());
        return "paisos";
    }


}