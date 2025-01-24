package com.daniel.TaulaSimple.controller;

import com.daniel.TaulaSimple.model.Ciutat;
import com.daniel.TaulaSimple.model.CiutatRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ciutats")
public class Ciutatcontroller {
    @Autowired
    CiutatRepositori ciutatRepositori;

    @GetMapping
    public List<Ciutat> obtenirCiutats() {
        return (List<Ciutat>) ciutatRepositori.findAll();
    }

    @GetMapping("/(id)")
    public ResponseEntity<Ciutat> obtenirCiutatPerid(@PathVariable(value = "id") Long id){
        Optional<Ciutat> ciutat = ciutatRepositori.findById(id);

        if (ciutat.isPresent()){
            return ResponseEntity.ok().body(ciutat.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Ciutat crearCiutat(@RequestBody Ciutat ciutat) {
        return ciutatRepositori.save(ciutat);
    }

    @DeleteMapping("/{id}")
    public void deleteCiutat(@PathVariable Long id){
        ciutatRepositori.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ciutat> actualizarCiutat(@PathVariable Long id, @RequestBody Ciutat ciutatActualizada) {
        Optional<Ciutat> optionalCiutat = ciutatRepositori.findById(id);

        if (optionalCiutat.isPresent()) {
            Ciutat ciutat = optionalCiutat.get();
            ciutat.setNom(ciutatActualizada.getNom());

            return ResponseEntity.ok().body(ciutatRepositori.save(ciutat));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
