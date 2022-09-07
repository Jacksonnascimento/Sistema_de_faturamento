/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import com.mycompany.sistema_de_faturamento.CaixaDaEmpresa;
import com.mycompany.sistema_de_faturamento.Despesas;


import java.sql.SQLException;

/**
 *
 * @author Jackson
 */
public class TesteDespesas {
    public static void main(String[] args) throws SQLException {
        
        Despesas despesas = new Despesas();
        despesas.buscarDespesasBanco();
        
        System.out.println(despesas.aDespesa(3).getDescricao());
    
    
    
     
    
}
}
