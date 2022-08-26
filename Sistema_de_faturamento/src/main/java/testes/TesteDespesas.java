/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import com.mycompany.sistema_de_faturamento.Despesas;

/**
 *
 * @author Jackson
 */
public class TesteDespesas {
    public static void main(String[] args) {
        Despesas despesas = new Despesas();
        
        for(int i = 0; i < 4; i++){
            despesas.addDespesas(("Tipo " + i), ("Descrição " + i), i, (10.01 * i));
        }
        
        System.out.println(despesas.aDespesa(1).getTipo());
        System.out.println(despesas.aDespesa(1).getDescricao());
        System.out.println(despesas.aDespesa(1).getValor());
        System.out.println(despesas.aDespesa(1).getId());
        System.out.println("-------------------------------------------------------");
        System.out.println(despesas.valortotal());
        
    }
    
    
}
