/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento;

import com.mycompany.sistema_de_faturamento.bancoDeDados.BancoDados;
import java.sql.SQLException;

/**
 *
 * @author Jackson
 */
public class CaixaDaEmpresa {
   private int id;
   private double valorDoCaixa = 0;
   private double valorTotalDespesas;
   private double prejuizo = 0;
   private double lucro = 0;
   private BancoDados banco;
   
   
   //atribuir valor do prejuizo ou lucro da empresa
   public void PrejuizoOuLucro(){
       if(valorDoCaixa > valorTotalDespesas){
           lucro = valorDoCaixa - valorTotalDespesas;
       } else {
           prejuizo = valorTotalDespesas - valorDoCaixa;
       }
       
       
   }
   public void buscarInforBanco() throws SQLException{
       banco = new BancoDados();
       String caixaSelect = banco.select("SELECT * FROM CAIXA_EMPRESA WHERE ID = 1", 2);
       String [] colunas = caixaSelect.split(",");
       
       setId(Integer.parseInt(colunas[0]));
       setValorDoCaixa(Double.parseDouble(colunas[1]));
       
       
      
       banco = new BancoDados();
       String  selectValor = banco.select("SELECT SUM(VALOR) FROM DESPESA", 1);
       String [] coluna = selectValor.split(",");
       
       
       setValorTotalDesspesas(Double.parseDouble(coluna[0]));
       
       PrejuizoOuLucro();
       
 
       
   }
   
   //somar valor ganho por uma nova compra
   public void valorGanhoPorCompra(double valorGanho){
       this.valorDoCaixa  += valorGanho;
   }
   
   public void SomarValorganhoBanco(double valor){
       banco = new BancoDados();
       String update = String.format("UPDATE CAIXA_EMPRESA SET VALOR_CAIXA += %s WHERE ID = 1", valor);
       banco.insertOUpdate(update);
   }
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
     * @return the valorDoCaixa
     */
    public double getValorDoCaixa() {
        return valorDoCaixa;
    }

    /**
     * @param valorDoCaixa the valorDoCaixa to set
     */
    public void setValorDoCaixa(double valorDoCaixa) {
        this.valorDoCaixa = valorDoCaixa;
    }

    /**
     * @return the valorTotalDespesas
     */
    public double getValorTotalDespesas() {
        return valorTotalDespesas;
    }

    /**
     * @param valorTotalDespesas the valorTotalDespesas to set
     */
    public void setValorTotalDesspesas(double valorTotalDespesas) {
        this.valorTotalDespesas = valorTotalDespesas;
    }

    /**
     * @return the prejuizo
     */
    public double getPrejuizo() {
        PrejuizoOuLucro();
        return prejuizo;
    }

    /**
     * @return the lucro
     */
    public double getLucro() {
        PrejuizoOuLucro();
        return lucro;
    }
   
   
}
