package com.daniel.TaulaSimple.Servicios;

import com.daniel.TaulaSimple.model.Ciutat;
import com.daniel.TaulaSimple.model.CiutatRepositori;
import com.daniel.TaulaSimple.model.PaisRepositori;
import com.daniel.TaulaSimple.model.ProvinciaRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiutatPoblacioMinimaServicios {
    @Autowired
    private CiutatRepositori ciutatRepositori;

    public List<Ciutat> obtenerciutatambpoblaciominima(int poblacioMInima) {
        List<Ciutat> toteslesCiutats = ciutatRepositori.findAll();
        List<Ciutat> ciutatsfiltrades = new ArrayList<>();

        for (Ciutat ciutat :toteslesCiutats) {
            if (ciutat.getPoblacion() > poblacioMInima) {
                ciutatsfiltrades.add(ciutat);
            }
        }
        return ciutatsfiltrades;
    }
}
