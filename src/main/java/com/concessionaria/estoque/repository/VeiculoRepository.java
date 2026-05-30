package com.concessionaria.estoque.repository;

import com.concessionaria.estoque.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    // 1. Buscar veículos por Status (ex: "Disponível")
    List<Veiculo> findByStatus(String status);

    // 2. Buscar veículos pelo Ano
    List<Veiculo> findByAno(Integer ano);

    // 3. Buscar veículos com preço MENOR OU IGUAL a um valor (LessThanEqual)
    List<Veiculo> findByPrecoLessThanEqual(Double preco);
}