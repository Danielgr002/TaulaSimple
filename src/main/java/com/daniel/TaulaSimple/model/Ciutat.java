package com.daniel.TaulaSimple.model;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "CIUTAT")
public class Ciutat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private int poblacion;

    @ManyToOne
    @JoinColumn(name = "PROVINCIA_ID")
    private Provincia provincia;

    @ManyToMany
    @JoinTable(
            name = "CIUTAT_FRANQ",
            joinColumns = @JoinColumn(name = "CIUDAD_ID"),
            inverseJoinColumns = @JoinColumn(name = "FRANQUICIA_ID"))
    List<Franquicia> franquicias;

    public Ciutat() {
    }

    public Ciutat(long id, String nom, int poblacion, Provincia provincia, List<Franquicia> franquicias) {
        this.id = id;
        this.nom = nom;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.franquicias = franquicias;
    }

    public List<Franquicia> getFranquicias() {
        return franquicias;
    }

    public void setFranquicias(List<Franquicia> franquicias) {
        this.franquicias = franquicias;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
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
