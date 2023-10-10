package com.example.Carros.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Locacao {

    @Id
    @GeneratedValue(generator = "locacao_seq")
    @SequenceGenerator(name = "locacao_seq", sequenceName = "locacao_id_seq", allocationSize = 0)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_carro")
    private Carro carro;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date data_locacao;

    public Locacao() {
    }

    public Locacao(int id, Cliente cliente, Carro carro, Date data_locacao) {
        this.id = id;
        this.cliente = cliente;
        this.carro = carro;
        this.data_locacao = data_locacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Date getData_locacao() {
        return data_locacao;
    }

    public void setData_locacao(Date data_locacao) {
        this.data_locacao = data_locacao;
    }
}
