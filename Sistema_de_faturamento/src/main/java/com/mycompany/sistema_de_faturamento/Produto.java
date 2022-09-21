/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento;

import com.mycompany.sistema_de_faturamento.bancoDeDados.BancoDados;
import java.sql.SQLException;

/**
 *
 * @author jacks
 */
public class Produto {
    private String descricao;
    private int id;
    private double valor;

    public  Produto(){
       
    }
    
    //adicionar produto
    public void addProduto(int id, String descricao, double valor) {
        this.descricao = descricao;
        this.id = id;
        this.valor = valor;
    }
    
    public void buscarProdutoBanco(int id){
        BancoDados banco = new BancoDados();
        String select = String.format("SELECT * FROM PRODUTO WHERE ID =  '%s'", id);
        select = banco.select(select, 3);
        String [] colunas = select.split(",");
        addProduto(Integer.parseInt(colunas[0]), colunas[1], Double.parseDouble(colunas[2]));
    }
    
    public void addProdutoBanco(String descricao, double valor) throws SQLException{
    
        String insert = String.format("INSERT INTO PRODUTO VALUES ('%s', '%s');", descricao, valor); 
        BancoDados banco = new BancoDados();
        banco.insertOUpdate(insert);
    }

    
    /**
     * @return the nome
     */
    public String getDscricao() {
        return descricao;
    }

    /**
     * @param descricao the nome to set
     */
    public void setDscricao(String descricao) {
        this.descricao = descricao;
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
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

   
    
     
    
}
