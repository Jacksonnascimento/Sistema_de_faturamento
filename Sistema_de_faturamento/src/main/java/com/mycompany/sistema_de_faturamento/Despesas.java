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
 * @author Jackson
 */
public class Despesas {
   private ArrayList<Despesa> despesas = new ArrayList<>();
   private Despesa despesa;
    
   //adicionar desesas a arraylist 
    public void addDespesas(int id, String descricao, String tipo, double valor){
        despesa = new Despesa();
        despesa.addDespesa(id, descricao, tipo, valor);
        getDespesas().add(despesa);
    
    }
    
    //adicionar desesas a arraylist 
    public void BuscarDespesasBanco() throws SQLException{
        
        BancoDados banco = new BancoDados();
        
        String despesasSelect = banco.banco(1, "SELECT * FROM DESPESA", 4);
        String [] linhas = despesasSelect.split("\n");
        
       for (String linha : linhas) {
           String[] colunas = linha.split(",");
           despesa = new Despesa();
           despesa.addDespesa(Integer.parseInt(colunas[0]), colunas[1], colunas[2], Double.parseDouble(colunas[3]));
           despesas.add(despesa);
       }
        
        
        
    
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
