/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento;

import java.util.ArrayList;

/**
 *
 * @author Jackson
 */
public class Despesas {
   private ArrayList<Despesa> despesas = new ArrayList<>();
   private Despesa despesa;
    
   //adicionar desesas a arraylist 
    public void addDespesas(String tipo, String descricao, int id, double valor){
        despesa = new Despesa();
        despesa.addDespesa(tipo, descricao, id, valor);
        getDespesas().add(despesa);
    
    }
    
    //retorna despesa pelo id
    public Despesa aDespesa(int id){
        for (Despesa de : despesas){
            if(de.getId() == id){
                return de;
            }
        }
        System.out.println("Não existe despesa com esse ID. O sistema será fechado." );
        System.exit(0);
        return null;
    }
    
    //calcular valor total das despesas 
    public double valortotal(){
        double valorTotal = 0;
        for (Despesa de : despesas){
            valorTotal += de.getValor();
        }
        return valorTotal;
    }

    /**
     * @return the despesas
     */
    public ArrayList<Despesa> getDespesas() {
        return despesas;
    }

    /**
     * @param despesas the despesas to set
     */
    public void setDespesas(ArrayList<Despesa> despesas) {
        this.despesas = despesas;
    }
    
    
}
