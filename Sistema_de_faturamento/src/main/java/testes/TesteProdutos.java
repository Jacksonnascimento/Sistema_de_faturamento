/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;


import com.mycompany.sistema_de_faturamento.Produto;
import com.mycompany.sistema_de_faturamento.Produtos;
import java.sql.SQLException;


/**
 *
 * @author jackson
 */
public class TesteProdutos {
    
    public static void main(String[] args) throws SQLException {
        Produto produto;
        
        
        for(int i = 0; i < 15; i++){
            produto = new Produto();
            produto.addProdutoBanco("Produto teste" + i, 23.1 * i);
        }
        
        
    }
    
}
