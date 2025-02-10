package com.daniel.TaulaSimple.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PROVINCIA", schema = "public")
public class Provincia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    @OneToMany(mappedBy = "provincia")
    private List<Ciutat> ciutats;

    @ManyToOne
    @JoinColumn(name = "PAIS_ID")
    private Pais pais;

    public Provincia(Long id, String nom, List<Ciutat> ciutats, Pais pais) {
        this.id = id;
        this.nom = nom;
        this.ciutats = ciutats;
        this.pais = pais;
    }

    public List<Ciutat> getCiutats() {
        return ciutats;
    }

    public void setCiutats(List<Ciutat> ciutats) {
        this.ciutats = ciutats;
    }

    public Provincia() {

    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nombre) {
        this.nom = nombre;
    }
}
