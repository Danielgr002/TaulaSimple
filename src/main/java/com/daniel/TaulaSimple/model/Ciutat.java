package com.daniel.TaulaSimple.model;
import jakarta.persistence.*;

@Entity
@Table (name = "CIUTAT")
public class Ciutat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nom;



    public Ciutat() {
    }

    public Ciutat(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    @ManyToOne
    @JoinColumn(name = "PROVINCIA_ID")
    private Provincia provincia;

    public void setId(long id) {
        this.id = id;
    }

    public void setNom(String name) {
        this.nom = name;
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
}
