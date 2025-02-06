package com.daniel.TaulaSimple.Servicios;

import com.daniel.TaulaSimple.model.Ciutat;
import com.daniel.TaulaSimple.model.CiutatRepositori;
import com.daniel.TaulaSimple.model.Provincia;
import com.daniel.TaulaSimple.model.ProvinciaRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaService {
    @Autowired
    private ProvinciaRepositori provinciaRepositori;

    public Iterable<Provincia> getAllProvincias() {
        return provinciaRepositori.findAll();
    }

    public Provincia saveProvincia(Provincia provincia) {
        return provinciaRepositori.save(provincia);
    }
}

