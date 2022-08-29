/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento;

/**
 *
 * @author Jackson
 */
public class VendaProduto {
    private int idVenda;
    private int idProduto;
    private double valorDaVenda;
    private double valorPago;
    private double troco = 0;
    
    
    
    public double troco(){
        if(valorPago > valorDaVenda){
          troco =  valorPago - valorDaVenda;
        }
        
        return troco;
    }

    /**
     * @return the idVenda
     */
    public int getIdVenda() {
        return idVenda;
    }

    /**
     * @param idVenda the idVenda to set
     */
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
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
     * @return the valorDaVenda
     */
    public double getValorDaVenda() {
        return valorDaVenda;
    }

    /**
     * @param valorDaVenda the valorDaVenda to set
     */
    public void setValorDaVenda(double valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }

    /**
     * @return the valorPago
     */
    public double getValorPago() {
        return valorPago;
    }

    /**
     * @param valorPago the valorPago to set
     */
    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    /**
     * @return the troco
     */
    public double getTroco() {
        return troco;
    }

    /**
     * @param troco the troco to set
     */
    public void setTroco(double troco) {
        this.troco = troco;
    }
    
    
    
}
