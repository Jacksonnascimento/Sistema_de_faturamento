/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import com.mycompany.sistema_de_faturamento.Cliente;
import com.mycompany.sistema_de_faturamento.Estoque;
import com.mycompany.sistema_de_faturamento.EstoqueProdutos;
import java.sql.SQLException;

/**
 *
 * @author Jackson
 */
public class Testes {
    public static void main(String[] args) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.buscarCliente("123456") ;
        
            System.out.println(cliente.getNome());
        
        
        
    }
}
