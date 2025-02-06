package com.daniel.TaulaSimple.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "FRANQUICIA")
public class Franquicia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;

    @ManyToMany
    @JoinTable(
            name = "ciutat-franq",
            joinColumns = @JoinColumn(name = "ciutat-franq_franquicia_id_franquicia_fk"),
            inverseJoinColumns = @JoinColumn(name = "ciutat-franq_ciutat_id_fk"))
    Set<Ciutat> ciutats;

    public Franquicia() {
    }

    public Franquicia(long id, String nom, Set<Ciutat> ciutats) {
        this.id = id;
        this.nom = nom;
        this.ciutats = ciutats;
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCiutats(Set<Ciutat> ciutats) {
        this.ciutats = ciutats;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Ciutat> getCiutats() {
        return ciutats;
    }
}
