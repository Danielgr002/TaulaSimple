package com.daniel.TaulaSimple.controller;

import com.daniel.TaulaSimple.Servicios.CiutatsService;
import com.daniel.TaulaSimple.Servicios.FranquiciaService;
import com.daniel.TaulaSimple.model.Franquicia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FranquiciaController {
    @Autowired
    FranquiciaService franquiciaService;

    @GetMapping("/franquicias")
    public String getFranquicia(Model model) {
        model.addAttribute("franquicias", franquiciaService.getAllFranquicias());
        return "franquicias";
    }
}
