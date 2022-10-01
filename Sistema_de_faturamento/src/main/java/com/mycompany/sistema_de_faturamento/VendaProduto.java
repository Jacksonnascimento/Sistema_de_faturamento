/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento;

import com.mycompany.sistema_de_faturamento.bancoDeDados.BancoDados;
import java.time.LocalDateTime;
import java.util.Random;

/**
 *
 * @author Jackson
 */
public class VendaProduto {
    private int idCliente;
    private int idProduto;
    private String cpf;
    BancoDados banco;
    private String codCompra;
    
  public void addVendaProdutoBanco(int idCliente, int idProduto){
      banco = new BancoDados();
      banco.insertOUpdate(String.format("INSERT INTO  COMPRA (ID_CLIENTE, ID_PRODUTO) VALUES(%s, %s)", idCliente, idProduto));
  }
    
    public void addVendasProdutosBanco(int idCliente, Produtos produtos){
        String insert;
        Random random = new Random();
        codCompra = 
                String.format("%s:%s:%s:%s:%s", 
                        LocalDateTime.now().getYear() 
                        ,idCliente, 
                        LocalDateTime.now().getDayOfYear(), 
                        LocalDateTime.now().getHour(),
                        random.nextInt()
                        );
        
        banco = new BancoDados();
        insert = String.format("INSERT INTO COMPRAS VALUES('%s',GETDATE(), '%s')", codCompra, idCliente);
        banco.insertOUpdate(insert);
        insert = "";
        
        for(Produto produto : produtos.getProdutos()){
            insert += String.format("INSERT INTO COMPRA_CLIENTE (COD_DA_COMPRA, ID_CLIENTE, ID_PRODUTO) VALUES('%s', %s, %s)\n", codCompra, idCliente, produto.getId());
        }
       
        banco = new BancoDados();
        banco.insertOUpdate(insert);
    }
    
    public int quantidadeVendasProduto(int idProduto){
        String select = String.format("SELECT COUNT(ID_PRODUTO) FROM COMPRA WHERE ID_PRODUTO = %s", idProduto);
        banco = new BancoDados();
        select = banco.select(select, 1);
        String [] coluna = select.split(",");
        return Integer.parseInt(coluna[0]);
        
        
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
