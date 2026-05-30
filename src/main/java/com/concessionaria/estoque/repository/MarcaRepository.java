package com.concessionaria.estoque.repository;

import com.concessionaria.estoque.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository diz ao Spring que esta interface lida com o banco de dados
// JpaRepository<Classe, Tipo_do_ID> já traz o Salvar, Apagar e Procurar prontos!
@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
}