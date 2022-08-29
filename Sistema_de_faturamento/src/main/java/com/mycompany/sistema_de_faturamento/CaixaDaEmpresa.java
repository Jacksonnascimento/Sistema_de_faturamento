/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento;

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
   
   
   //atribuir valor do prejuizo ou lucro da empresa
   public void PrejuizoOuLucro(){
       if(valorDoCaixa > valorTotalDespesas){
           lucro = valorDoCaixa - valorTotalDespesas;
       } else {
           prejuizo = valorDoCaixa - valorTotalDespesas;
       }
       
       
   }
   
   //somar valor ganho por uma nova compra
   public void valorGanhoPorCompra(double valorGanho){
       this.valorDoCaixa  += valorGanho;
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
