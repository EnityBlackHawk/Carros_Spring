package com.example.Carros.controller;

import com.example.Carros.Service.LocacaoService;
import com.example.Carros.model.Locacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locacao")
public class LocacaoController {

    private LocacaoService service;

    public LocacaoController(@Autowired LocacaoService service)
    {
        this.service = service;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Locacao>> getAll()
    {
        List<Locacao> list = service.getAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/insert")
    public ResponseEntity<Locacao> insert(@RequestBody Locacao locacao)
    {
        Locacao resultado = service.insert(locacao);
        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/get-by-cliente-id/{id}")
    public ResponseEntity<List<Locacao>> getByClientId( @PathVariable String id)
    {
        return ResponseEntity.ok(service.getByClientId(
                Integer.parseInt(id)
        ));
    }

}
