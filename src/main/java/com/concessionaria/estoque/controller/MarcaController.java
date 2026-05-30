package com.concessionaria.estoque.controller;

import com.concessionaria.estoque.model.Marca;
import com.concessionaria.estoque.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    @Autowired
    private MarcaRepository marcaRepository;

    @GetMapping
    public List<Marca> listarTodas() {
        return marcaRepository.findAll();
    }

    @PostMapping
    public Marca salvar(@RequestBody Marca marca) {
        return marcaRepository.save(marca);
    }

    @PutMapping("/{id}")
    public Marca atualizar(@PathVariable Long id, @RequestBody Marca marca) {
        marca.setId(id);
        return marcaRepository.save(marca);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        marcaRepository.deleteById(id);
    }
}