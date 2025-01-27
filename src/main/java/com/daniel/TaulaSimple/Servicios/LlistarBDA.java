package com.daniel.TaulaSimple.Servicios;

import com.daniel.TaulaSimple.model.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LlistarBDA {

    @Autowired
    PaisRepositori paisRepositori;

    @Autowired
    CiutatRepositori ciutatRepositori;

    @Autowired
    ProvinciaRepositori provinciaRepositori;

    @PostConstruct
    public void LlistarTablapaisos(){
        List<Pais> paisos = paisRepositori.findAll();
        System.out.println("PAISOS: ");
        for (Pais pais : paisos){
            System.out.println("ID: " + pais.getId()+ " Nom: " + pais.getNom());
        }
    }

    @PostConstruct
    public void LlistarCiudades (){
        List<Ciutat> ciutatas = ciutatRepositori.findAll();
        System.out.println("CIUDADES: ");
        for (Ciutat ciutat: ciutatas){
            System.out.println("ID: "+ciutat.getId()+ " Nom: " +ciutat.getNom()+ " Poblacio: " +ciutat.getPoblacion());
        }
    }

    @PostConstruct
    public void LlistarProvincias (){
        List<Provincia> provincias = provinciaRepositori.findAll();
        System.out.println("PROVINCIAS: ");
        for (Provincia provincia : provincias){
            System.out.println("ID: " + provincia.getId() +" Nom: "+ provincia.getNom());
        }
    }

}
