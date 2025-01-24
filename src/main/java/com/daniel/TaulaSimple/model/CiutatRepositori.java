package com.daniel.TaulaSimple.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiutatRepositori extends CrudRepository<Ciutat, Long> {
}
