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
        banco.banco(2, "UPDATE USUARIO SET EMAIL = 'helber@hotmail.com' WHERE ID = 2", 0);
        
        banco = new BancoDados();
        String resultado = banco.banco(1, "SELECT * FROM USUARIO WHERE NOME_USUARIO = 'helber'", 6);
        String[] textoSeparado = resultado.split(",");
        
        for (int i = 0; i < textoSeparado.length  - 1; i++){
            System.out.println("Coluna " + i + ": " + textoSeparado[i]);
        }
      
       
        
        
    }
}
