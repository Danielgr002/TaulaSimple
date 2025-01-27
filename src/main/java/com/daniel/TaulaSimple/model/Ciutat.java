package com.daniel.TaulaSimple.model;
import jakarta.persistence.*;

@Entity
@Table (name = "CIUTAT")
public class Ciutat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;


    @ManyToOne
    @JoinColumn(name = "PROVINCIA_ID")
    private Provincia provincia;

    public Ciutat() {
    }

    public Ciutat(long id, String nom, Provincia provincia) {
        this.id = id;
        this.nom = nom;
        this.provincia = provincia;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

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
