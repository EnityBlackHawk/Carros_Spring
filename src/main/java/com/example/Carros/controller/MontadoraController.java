package com.example.Carros.controller;

import com.example.Carros.Service.MontadoraService;
import com.example.Carros.model.Montadora;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/montadora")
public class MontadoraController {

    private MontadoraService service;

    public  MontadoraController(@Autowired MontadoraService service)
    {
        this.service = service;
    }

    @GetMapping("/get-all")
    public ResponseEntity< List<Montadora> > getAll()
    {
        List<Montadora> lista = service.getAll();
        return ResponseEntity.ok(lista);
    }

    @PostMapping("/insert")
    public ResponseEntity<Montadora> insert ( @RequestBody Montadora montadora)
    {
        var obj = service.insert(montadora);
        return ResponseEntity.ok(obj);
    }

    @PutMapping("/update")
    public ResponseEntity<Montadora> update (@RequestBody Montadora montadora)
    {
        return  ResponseEntity.ok(service.update(montadora));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable String id)
    {
        service.delete( Integer.parseInt(id) );
        return ResponseEntity.ok(true);
    }

}
