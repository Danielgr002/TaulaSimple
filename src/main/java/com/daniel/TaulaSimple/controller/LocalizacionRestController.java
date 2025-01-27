package com.daniel.TaulaSimple.controller;

import com.daniel.TaulaSimple.Servicios.CiutatPoblacioMinimaServicios;
import com.daniel.TaulaSimple.Servicios.ObtenerlesProvinciasPorPais;
import com.daniel.TaulaSimple.Servicios.PaisObtenerTodos;
import com.daniel.TaulaSimple.model.Ciutat;
import com.daniel.TaulaSimple.model.Pais;
import com.daniel.TaulaSimple.model.Provincia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/localitzacions")
public class LocalizacionRestController {
    @Autowired
    private PaisObtenerTodos paisService;

    @Autowired
    private ObtenerlesProvinciasPorPais provinciaService;

    @Autowired
    private CiutatPoblacioMinimaServicios ciutatPoblacioMinimaServicios;

    @GetMapping("/paises")
    public List<Pais> obtenirTotselspaisos(){
        return paisService.obtenerTodosLosPaises();
    }

    @GetMapping("/provincias")
    public List<Provincia> obtenirToteslesprovincies(String nomPais) {
        return provinciaService.obtenerProvinciesPerPais(nomPais);
    }

    @GetMapping("/ciudades")
    public List<Ciutat> obtenirToteslesciutats (int PoblacioMinima) {
        return ciutatPoblacioMinimaServicios.obtenerciutatambpoblaciominima(PoblacioMinima);
    }
}
