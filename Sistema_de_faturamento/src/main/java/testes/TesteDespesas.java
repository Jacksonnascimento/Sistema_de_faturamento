/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import com.mycompany.sistema_de_faturamento.Despesa;
import com.mycompany.sistema_de_faturamento.Despesas;
import com.mycompany.sistema_de_faturamento.bancoDeDados.BancoDados;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Jackson
 */
public class TesteDespesas {
    public static void main(String[] args) throws SQLException {
     /*   Despesas despesas = new Despesas();
        
        for(int i = 0; i < 4; i++){
            despesas.addDespesas(("Tipo " + i), ("Descrição " + i), i, (10.01 * i));
        }
        
        System.out.println(despesas.aDespesa(2).getTipo());
        System.out.println(despesas.aDespesa(2).getDescricao());
        System.out.println(despesas.aDespesa(2).getValor());
        System.out.println(despesas.aDespesa(2).getId());
        System.out.println("-------------------------------------------------------");
        System.out.println(despesas.valortotal());
        
        
      */
     /*
    BancoDados banco = new BancoDados();
    Despesas despesas = new Despesas();
    
    String despesasSelect = banco.banco(1, "SELECT * FROM DESPESA", 4);
           
    String [] linhas = despesasSelect.split("\n");
    
    for(int i = 0; i < linhas.length; i++){
        String [] colunas = linhas[i].split(",");
        despesas.addDespesas(Integer.parseInt(colunas[0]), colunas[1], colunas[2], Double.parseDouble(colunas[3]));
              
    }
    */
     
    Despesas despesas = new Despesas();
    despesas.BuscarDespesasBanco();
    for(Despesa despesa : despesas.getDespesas()){
        System.out.println(despesa.getId() + ":" +despesa.getDescricao());
    }
        /*
    Despesa despesa = despesas.aDespesa(4);
        System.out.println(despesa.getDescricao()); */
    
    }
    
    
    
     
    
}
