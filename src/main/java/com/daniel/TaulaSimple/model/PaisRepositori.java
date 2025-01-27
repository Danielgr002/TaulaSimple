package com.daniel.TaulaSimple.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepositori extends JpaRepository<Pais, Long> {
}