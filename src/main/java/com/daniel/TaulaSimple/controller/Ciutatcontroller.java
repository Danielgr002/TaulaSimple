package com.daniel.TaulaSimple.controller;

import com.daniel.TaulaSimple.Servicios.CiutatsService;
import com.daniel.TaulaSimple.Servicios.LlistarBDA;
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
public class Ciutatcontroller {
    @Autowired
    CiutatsService ciutatsService;

    @GetMapping("/ciutats")
    public String getCiutats(Model model) {
        model.addAttribute("ciutats", ciutatsService.getAllCiutats());
        return "ciutats";
    }
}
