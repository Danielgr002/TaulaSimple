package com.daniel.TaulaSimple.model;
import jakarta.persistence.*;

import java.util.Set;

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
            name = "ciutat-franq",
            joinColumns = @JoinColumn(name = "ciutat-franq_ciutat_id_fk"),
            inverseJoinColumns = @JoinColumn(name = "ciutat-franq_franquicia_id_franquicia_fk"))
    Set<Franquicia> franquicias;

    public Ciutat() {
    }

    public Ciutat(long id, String nom, int poblacion, Provincia provincia, Set<Franquicia> franquicias) {
        this.id = id;
        this.nom = nom;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.franquicias = franquicias;
    }

    public Set<Franquicia> getFranquicias() {
        return franquicias;
    }

    public void setFranquicias(Set<Franquicia> franquicias) {
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
