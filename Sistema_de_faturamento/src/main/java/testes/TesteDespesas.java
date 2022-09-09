/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;


import com.mycompany.sistema_de_faturamento.Despesa;



import java.sql.SQLException;

/**
 *
 * @author Jackson
 */
public class TesteDespesas {
    public static void main(String[] args) throws SQLException {
        
       Despesa despesa = new Despesa();
        
        for(int i = 0; i < 15; i++){
            despesa.addDespesaBanco("Despesa n" + i, "Teste", 16.3 * i);
        }
    
    
    
     
    
}
}
