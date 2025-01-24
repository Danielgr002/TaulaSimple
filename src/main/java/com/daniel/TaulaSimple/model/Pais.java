package com.daniel.TaulaSimple.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table( name = "PAIS", schema = "public")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nom;

    public Pais(Long id, String nom) {
        Id = id;
        this.nom = nom;
    }

    public Pais() {
    }

    @OneToMany(mappedBy = "Provincia")
    private List<Provincia> provincias;

    public Long getId() {
        return Id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
