package com.example.Carros.repository;

import com.example.Carros.model.Cliente;
import com.example.Carros.model.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocacaoRepository extends JpaRepository<Locacao, Integer> {

    public List<Locacao> findByCliente(Cliente cliente);

}
