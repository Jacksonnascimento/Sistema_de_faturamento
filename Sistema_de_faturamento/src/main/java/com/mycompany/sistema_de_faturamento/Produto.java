/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento;

/**
 *
 * @author jacks
 */
public class Produto {
    private String nome;
    private int id;
    private float valor;

    public Produto(String nome, int id, float valor) {
        this.nome = nome;
        this.id = id;
        this.valor = valor;
    }

    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ide
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the ide to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    
    
    
    
}
