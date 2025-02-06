package com.daniel.TaulaSimple.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FranquiciaRepositori extends JpaRepository<Franquicia, Long> {
}
