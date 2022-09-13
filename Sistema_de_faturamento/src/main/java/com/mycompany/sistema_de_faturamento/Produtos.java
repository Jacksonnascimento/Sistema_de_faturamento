/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento;

import com.mycompany.sistema_de_faturamento.bancoDeDados.BancoDados;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author jacks
 */
public final class Produtos {

    private ArrayList<Produto> produtos = new ArrayList<>();
    private Produto produto;


    //adicionar os produtos a arraylist
    public void addProdutos( int id, String descricao, double valor) {
        produto = new Produto();
        produto.addProduto(id, descricao, valor);
        produtos.add(produto);

    }
    
    public void buscarProdutosBancos() throws SQLException {
        BancoDados banco = new BancoDados();
        
        String produtosSelect = banco.select("SELECT * FROM PRODUTO", 3);
        String [] linhas = produtosSelect.split("\n");
        
       for (String linha : linhas) {
           String[] colunas = linha.split(",");
           produto = new Produto();
           produto.addProduto(Integer.parseInt(colunas[0]), colunas[1], Double.parseDouble(colunas[2]));
           produtos.add(produto);
       }
        

    }


    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    //buscar o produto pelo id
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
