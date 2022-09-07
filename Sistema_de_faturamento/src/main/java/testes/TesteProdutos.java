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
        Produtos produtos = new Produtos();
        
        produtos.buscarProdutosBancos();
        
        /*
        for(Produto produto : produtos.getProdutos()){
            System.out.println("Descrição: " + produto.getDscricao() + " Valor: " + produto.getValor() + "\n");
        } */ 
        
        System.out.println(produtos.oProduto(2).getDscricao());
        System.out.println(produtos.oProduto(2).getValor());
    }
    
}
