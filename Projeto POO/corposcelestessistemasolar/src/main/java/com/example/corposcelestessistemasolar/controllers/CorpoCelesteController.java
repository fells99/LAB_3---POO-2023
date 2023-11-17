package com.example.corposcelestessistemasolar.controllers;  // Ajuste o pacote conforme necessário

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.corposcelestessistemasolar.models.CorposCelesteSistemaSolar;
import com.example.corposcelestessistemasolar.repository.CorposCelestesrepository;

@RestController
@RequestMapping("/corpos-celestes")
public class CorpoCelesteController {

    private final CorposCelestesrepository corpoCelesteRepository;

    public CorpoCelesteController(CorposCelestesrepository corpoCelesteRepository) {
        this.corpoCelesteRepository = corpoCelesteRepository;
    }

    @GetMapping
    public ResponseEntity<List<CorposCelesteSistemaSolar>> listarCorposCelestes() {
        List<CorposCelesteSistemaSolar> corposCelestes = corpoCelesteRepository.findAll();
        return ResponseEntity.ok(corposCelestes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CorposCelesteSistemaSolar> buscarCorpoCeleste(@PathVariable Long id) {
        return corpoCelesteRepository.findById(id)
                .map(corpoCeleste -> ResponseEntity.ok().body(corpoCeleste))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CorposCelesteSistemaSolar> criarCorpoCeleste(@RequestBody CorposCelesteSistemaSolar corpoCeleste) {
        CorposCelesteSistemaSolar novoCorpoCeleste = corpoCelesteRepository.save(corpoCeleste);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCorpoCeleste);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CorposCelesteSistemaSolar> atualizarCorpoCeleste(@PathVariable Long id, @RequestBody CorposCelesteSistemaSolar corpoCelesteAtualizado) {
        return corpoCelesteRepository.findById(id)
                .map(corpoExistente -> {
                    corpoCelesteAtualizado.setId(id);
                    CorposCelesteSistemaSolar corpoAtualizado = corpoCelesteRepository.save(corpoCelesteAtualizado);
                    return ResponseEntity.ok(corpoAtualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirCorpoCeleste(@PathVariable Long id) {
        if (corpoCelesteRepository.existsById(id)) {
            corpoCelesteRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
