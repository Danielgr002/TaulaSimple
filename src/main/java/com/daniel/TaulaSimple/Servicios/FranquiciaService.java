package com.daniel.TaulaSimple.Servicios;

import com.daniel.TaulaSimple.model.Ciutat;
import com.daniel.TaulaSimple.model.CiutatRepositori;
import com.daniel.TaulaSimple.model.Franquicia;
import com.daniel.TaulaSimple.model.FranquiciaRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FranquiciaService {
    @Autowired
    private FranquiciaRepositori franquiciaRepositori;

    public Iterable<Franquicia> getAllFranquicias() {
        return franquiciaRepositori.findAll();
    }

    public Franquicia saveFRanquicia(Franquicia franquicia) {
        return franquiciaRepositori.save(franquicia);
    }
}
