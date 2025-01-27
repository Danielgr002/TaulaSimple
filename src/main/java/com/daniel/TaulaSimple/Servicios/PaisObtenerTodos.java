package com.daniel.TaulaSimple.Servicios;

import com.daniel.TaulaSimple.model.Pais;
import com.daniel.TaulaSimple.model.PaisRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisObtenerTodos {
    @Autowired
    private PaisRepositori paisRepositori;

    public List<Pais> obtenerTodosLosPaises() {
        return paisRepositori.findAll();
    }

    public Optional<Pais> obtenirPaisPerId(Long id){
        return paisRepositori.findById(id);
    }
}
