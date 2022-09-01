/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import com.mycompany.sistema_de_faturamento.bancoDeDados.BancoDados;
import java.sql.SQLException;


/**
 *
 * @author jacks
 */
public class BancoTeste {
    
    public static void main(String[] args) throws SQLException  {
        BancoDados banco;
        banco = new BancoDados();
        String resultado = banco.banco(1, "SELECT NOME FROM USUARIO WHERE NOME_USUARIO = 'jack'");
        
        System.out.println(resultado);
      
       
        
        
    }
}
