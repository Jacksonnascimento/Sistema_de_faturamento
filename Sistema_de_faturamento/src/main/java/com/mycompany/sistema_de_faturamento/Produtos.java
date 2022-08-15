/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento;

import java.util.ArrayList;

/**
 *
 * @author jacks
 */
public class Produtos {
    ArrayList<Produto> produtos = new ArrayList<>();

    public Produtos(String nome, int id, float valor) {
         Produto produto = new Produto(nome, id, valor);
         produtos.add(produto);
         
    }
    
    
}
