package com.example.corposcelestessistemasolar.models;  // Ajuste o pacote conforme necessário


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "corpos_celestes")
@Entity(name = "corpos_celestes")
public class CorposCelesteSistemaSolar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String nome;

    @Column(length = 255)
    private String tipo;

    private double tamanho;

    private double distanciaDoSol;

    @Column(length = 255)
    private String elementoQuimicoPredominante;

    // Construtores, getters e setters...

    public CorposCelesteSistemaSolar() {
        // Inicializar algumas propriedades aqui, se necessário
    }

    public CorposCelesteSistemaSolar(String nome, String tipo, double tamanho, double distanciaDoSol, String elementoQuimicoPredominante) {
        this.nome = nome;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.distanciaDoSol = distanciaDoSol;
        this.elementoQuimicoPredominante = elementoQuimicoPredominante;
    }

    // Getters e setters...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getDistanciaDoSol() {
        return distanciaDoSol;
    }

    public void setDistanciaDoSol(double distanciaDoSol) {
        this.distanciaDoSol = distanciaDoSol;
    }

    public String getElementoQuimicoPredominante() {
        return elementoQuimicoPredominante;
    }

    public void setElementoQuimicoPredominante(String elementoQuimicoPredominante) {
        this.elementoQuimicoPredominante = elementoQuimicoPredominante;
    }

    // Métodos equals e hashCode...

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CorposCelesteSistemaSolar that = (CorposCelesteSistemaSolar) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
