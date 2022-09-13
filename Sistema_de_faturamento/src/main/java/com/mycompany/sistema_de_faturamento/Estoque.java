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
public class Estoque {
    private int quantidade;
    private int id;
    private int idProduto;

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
     public void addEstoque(int id, int idProduto, int quantidade){
         this.id = id;
         this.idProduto = idProduto;
         this.quantidade = quantidade;
     }
    
    public void addQuanBanco(int idProduto, int quantidade) throws SQLException{
        BancoDados banco = new BancoDados();
        String insert  = String.format("INSERT INTO ESTOQUE VALUES (%s, %s)", idProduto, quantidade);
        
        banco.insertOUpdate(insert);
    }

    /**
     * @return the qt
     */
 

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    
    
}
