package com.concessionaria.estoque.controller;

import com.concessionaria.estoque.model.Modelo;
import com.concessionaria.estoque.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modelos")
public class ModeloController {

    @Autowired
    private ModeloRepository modeloRepository;

    @GetMapping
    public List<Modelo> listarTodos() {
        return modeloRepository.findAll();
    }

    @PostMapping
    public Modelo salvar(@RequestBody Modelo modelo) {
        return modeloRepository.save(modelo);
    }

    @PutMapping("/{id}")
    public Modelo atualizar(@PathVariable Long id, @RequestBody Modelo modelo) {
        modelo.setId(id);
        return modeloRepository.save(modelo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        modeloRepository.deleteById(id);
    }
}