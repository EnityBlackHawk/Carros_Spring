package com.example.Carros.Service;

import com.example.Carros.model.Montadora;
import com.example.Carros.repository.MontadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MontadoraService {

    private MontadoraRepository repository;

    public MontadoraService( @Autowired MontadoraRepository repository)
    {
        this.repository = repository;
    }

    public List<Montadora> getAll()
    {
        return repository.findAll();
    }

    public Montadora insert(Montadora montadora)
    {
        if(repository.existsById(montadora.getId()))
            throw new RuntimeException("Montadora com id ja existente");
        return repository.save(montadora);
    }

    public Montadora update(Montadora montadora)
    {
        return repository.save(montadora);
    }

    public void delete(int id)
    {
        repository.deleteById(id);
    }

}
