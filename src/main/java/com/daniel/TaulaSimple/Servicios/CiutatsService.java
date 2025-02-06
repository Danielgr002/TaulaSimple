package com.daniel.TaulaSimple.Servicios;

import com.daniel.TaulaSimple.model.Ciutat;
import com.daniel.TaulaSimple.model.CiutatRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiutatsService {
    @Autowired
    private CiutatRepositori ciutatRepositori;

    public Iterable<Ciutat> getAllCiutats() {
        return ciutatRepositori.findAll();
    }

    public Ciutat saveCiutat(Ciutat ciutat) {
        return ciutatRepositori.save(ciutat);
    }
}
