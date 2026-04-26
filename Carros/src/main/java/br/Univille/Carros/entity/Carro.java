package br.Univille.Carros.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String ano;
    private String conbustivel;

    @ManyToOne
    private Pessoa pessoa;

    @ManyToOne
    private Marca marca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getConbustivel() {
        return conbustivel;
    }

    public void setConbustivel(String conbustivel) {
        this.conbustivel = conbustivel;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }



    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", conbustivel='" + conbustivel + '\'' +
                ", pessoaId=" + pessoa +
                '}';
    }
}
