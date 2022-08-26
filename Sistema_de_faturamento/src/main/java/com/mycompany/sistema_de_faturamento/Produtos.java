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
public final class Produtos {

    private ArrayList<Produto> produtos = new ArrayList<>();
    private Produto produto;


    public void AddProdutos(String nome, int id, double valor) {
        produto = new Produto();
        produto.addProduto(nome, id, valor);
        produtos.add(produto);

    }

    public void AddProdutos(ArrayList<Produto> pros) {
        this.produtos = pros;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public Produto oProduto(int id) {
        for (Produto pro : produtos) {
            if (pro.getId() == id) {
                return pro;
            }
        }
        System.out.println("Não existe produto com esse id. O sistema será fechado");
        System.exit(0);
        return null;

    }

}
