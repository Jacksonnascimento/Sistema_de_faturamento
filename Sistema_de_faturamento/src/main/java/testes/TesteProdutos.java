/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;


import com.mycompany.sistema_de_faturamento.Produtos;


/**
 *
 * @author jackson
 */
public class TesteProdutos {
    
    public static void main(String[] args) {
        Produtos produtos = new Produtos();
        
        for(int i = 1; i < 25; i++){
            produtos.AddProdutos("Produto" + i, i, i + 0.1);
        }
    
      
      System.out.println(produtos.oProduto(24).getNome());
      System.out.println(produtos.oProduto(24).getId());
      System.out.println(produtos.oProduto(24).getValor());
    }
    
}
