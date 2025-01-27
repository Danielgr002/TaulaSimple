package com.daniel.TaulaSimple.Servicios;

import com.daniel.TaulaSimple.model.Provincia;
import com.daniel.TaulaSimple.model.ProvinciaRepositori;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ObtenerlesProvinciasPorPais {
    private ProvinciaRepositori provinciaRepositori;

    public List<Provincia> obtenerProvinciesPerPais(String nomPais) {
        List<Provincia> provincias = provinciaRepositori.findAll();
        List<Provincia> resultat = new ArrayList<>();

        for (Provincia provincia : provincias){
            if (provincia.getPais().getNom().equalsIgnoreCase(nomPais)){
                resultat.add(provincia);
            }
        }
        return resultat;
    }
}
