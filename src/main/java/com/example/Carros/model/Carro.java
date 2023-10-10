package com.example.Carros.model;

import jakarta.persistence.*;

@Entity
public class Carro {

    @Id
    @GeneratedValue
    private int id;

    private String placa;

    private String modelo;

    @ManyToOne
    @JoinColumn(name = "marca")
    private Montadora marca;

    public Carro() {
    }

    public Carro(int id, String placa, String modelo, Montadora marca) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Montadora getMarca() {
        return marca;
    }

    public void setMarca(Montadora marca) {
        this.marca = marca;
    }
}
