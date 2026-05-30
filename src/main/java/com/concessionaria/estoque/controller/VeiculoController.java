package com.concessionaria.estoque.controller;

import com.concessionaria.estoque.model.Veiculo;
import com.concessionaria.estoque.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    // --- MÉTODOS CRUD BÁSICOS (Que já tínhamos feito) ---

    @GetMapping
    public List<Veiculo> listarTodos() {
        return veiculoRepository.findAll();
    }

    @PostMapping
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    @PutMapping("/{id}")
    public Veiculo atualizar(@PathVariable Long id, @RequestBody Veiculo veiculo) {
        veiculo.setId(id);
        return veiculoRepository.save(veiculo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        veiculoRepository.deleteById(id);
    }


    // --- NOVOS MÉTODOS: FILTROS DE PESQUISA ---

    // Filtro 1: Buscar por Status
    // Exemplo no Postman: GET http://localhost:8081/veiculos/status/Disponível
    @GetMapping("/status/{status}")
    public List<Veiculo> buscarPorStatus(@PathVariable String status) {
        return veiculoRepository.findByStatus(status);
    }

    // Filtro 2: Buscar por Ano
    // Exemplo no Postman: GET http://localhost:8081/veiculos/ano/2024
    @GetMapping("/ano/{ano}")
    public List<Veiculo> buscarPorAno(@PathVariable Integer ano) {
        return veiculoRepository.findByAno(ano);
    }

    // Filtro 3: Buscar carros baratos (Preço Máximo)
    // Exemplo no Postman: GET http://localhost:8081/veiculos/preco/150000
    @GetMapping("/preco/{valorMaximo}")
    public List<Veiculo> buscarPorPrecoMaximo(@PathVariable Double valorMaximo) {
        return veiculoRepository.findByPrecoLessThanEqual(valorMaximo);
    }
}