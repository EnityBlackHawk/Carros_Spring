package com.example.Carros.Service;

import com.example.Carros.model.Cliente;
import com.example.Carros.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository repository;

    public ClienteService(@Autowired ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente getById(int id)
    {
        return repository.findById(id).orElse(null);
    }

    public List<Cliente> getAll()
    {
        return repository.findAll();
    }

    public Cliente insert(Cliente cliente)
    {
        return repository.save(cliente);
    }

}
