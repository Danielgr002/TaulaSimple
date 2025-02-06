package com.daniel.TaulaSimple.Servicios;

import com.daniel.TaulaSimple.model.Ciutat;
import com.daniel.TaulaSimple.model.CiutatRepositori;
import com.daniel.TaulaSimple.model.Pais;
import com.daniel.TaulaSimple.model.PaisRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisService {
    @Autowired
    private PaisRepositori paisRepositori;

    public Iterable<Pais> getAllPaisos() {
        return paisRepositori.findAll();
    }

    public Pais savePaisos(Pais pais) {
        return paisRepositori.save(pais);
    }
}
