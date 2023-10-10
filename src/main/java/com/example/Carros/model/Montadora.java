package com.example.Carros.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Montadora {

    @Id
    @GeneratedValue(generator = "montadora_seq")
    @SequenceGenerator(name = "montadora_seq", sequenceName = "montadora_id_seq", allocationSize = 0, initialValue = 4)
    private int id;
    private  String nome;

    public Montadora() {
    }

    public Montadora(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
