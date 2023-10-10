package com.example.Carros.Service;

import com.example.Carros.model.Cliente;
import com.example.Carros.model.Locacao;
import com.example.Carros.repository.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocacaoService {

    private LocacaoRepository repository;
    private ClienteService clienteService;

    public LocacaoService(@Autowired LocacaoRepository repository, @Autowired ClienteService clienteService)
    {
        this.repository = repository;
        this.clienteService = clienteService;
    }

    public List<Locacao> getAll()
    {
        return repository.findAll();
    }

    public Locacao insert(Locacao locacao)
    {
        return repository.save(locacao);
    }

    public List<Locacao> getByClientId(int id)
    {
        Cliente c = clienteService.getById(id);
        return repository.findByCliente(c);
    }

}
