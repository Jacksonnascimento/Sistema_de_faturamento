/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import com.mycompany.sistema_de_faturamento.bancoDeDados.BancoDados;


/**
 *
 * @author jacks
 */
public class BancoTeste {
    
    public static void main(String[] args)  {
        BancoDados banco = new BancoDados();
        String resultado = banco.banco(1, "SELECT PES_NOME, PES_COD FROM GER_PESSOA where pes_cod = 58");
        
        System.out.println(resultado);
       
        
        
    }
}
