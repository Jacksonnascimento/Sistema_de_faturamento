/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento;

import com.mycompany.sistema_de_faturamento.bancoDeDados.BancoDados;

/**
 *
 * @author Jackson
 */
public class VendaProduto {
    private int id;
    private int idCliente;
    private int idProduto;
    private String cpf;
    
    
  public void addVendaProdutoBanco(int idCliente, int idProduto){
      BancoDados banco = new BancoDados();
      banco.insertOUpdate(String.format("INSERT INTO  COMPRA (ID_CLIENTE, ID_PRODUTO) VALUES(%s, %s)", idCliente, idProduto));
  }
      

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
