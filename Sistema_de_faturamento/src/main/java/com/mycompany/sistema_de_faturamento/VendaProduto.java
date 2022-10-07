/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento;

import com.mycompany.sistema_de_faturamento.bancoDeDados.BancoDados;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Jackson
 */
public class VendaProduto {
    private int idCliente;
    private int idProduto;
    private String cpf;
    private BancoDados banco;
    private int idCompra;
    private String codCompra;
    private String dataCompra;
    
    public void addVendaProduto(int idCompra, String codCompra, int idCliente, int idProduto, String dataCompra){
        this.idCompra = idCompra;
        this.codCompra = codCompra;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.dataCompra = dataCompra;
        
    }
    
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
        insert = String.format("INSERT INTO COMPRAS VALUES('%s',GETDATE(), '%s')", getCodCompra(), idCliente);
        banco.insertOUpdate(insert);
        insert = "";
        
        for(Produto produto : produtos.getProdutos()){
            insert += String.format("INSERT INTO COMPRA_CLIENTE (COD_DA_COMPRA, ID_CLIENTE, ID_PRODUTO) VALUES('%s', %s, %s)\n", 
                    getCodCompra(), idCliente, produto.getId());
        }
       
        banco = new BancoDados();
        banco.insertOUpdate(insert);
    }
    
    public ArrayList<VendaProduto> buscarUltimaCompra(int idCliente){
        banco = new BancoDados();
        VendaProduto venda;
        
        ArrayList<VendaProduto> vendasProduto = new ArrayList<>();
            
        String select = String.format("SELECT CC.*, C.DATA_DA_COMPRA FROM COMPRA_CLIENTE CC INNER JOIN COMPRAS C ON CC.COD_DA_COMPRA = C.COD_DA_COMPRA\n" +
                        "WHERE CC.COD_DA_COMPRA = \n" +
                        "(SELECT TOP 1 COD_DA_COMPRA FROM COMPRAS WHERE ID_CLIENTE = CC.ID_CLIENTE ORDER BY DATA_DA_COMPRA DESC)\n" +
                        "AND CC.ID_CLIENTE = %s", idCliente);
        
        select = banco.select(select, 5);
        
        String [] linhas = select.split("\n");
        
        for (String linha : linhas){
            String [] colunas = linha.split(",");
            
            venda = new VendaProduto();
            
            venda.addVendaProduto(Integer.parseInt(colunas[0]), colunas[1], Integer.parseInt(colunas[2]), Integer.parseInt(colunas[3]), colunas[4]);
            
            vendasProduto.add(venda);
        }
                
        return vendasProduto;
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

    
    

    /**
     * @return the codCompra
     */
    public String getCodCompra() {
        return codCompra;
    }

    /**
     * @return the dataCompra
     */
    public String getDataCompra() {
        return dataCompra;
    }
    
    

    
    
}
