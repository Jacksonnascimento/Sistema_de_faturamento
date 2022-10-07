/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import com.mycompany.sistema_de_faturamento.VendaProduto;





/**
 *
 * @author Jackson
 */
public class Testes {
    public static void main(String[] args)  {
        VendaProduto vendas = new VendaProduto();
        
        
        for(VendaProduto venda : vendas.buscarUltimaCompra(27)){
            System.out.println(venda.getIdCliente());
            System.out.println(venda.getIdProduto());
            System.out.println(venda.getCodCompra());
            System.out.println(venda.getDataCompra());
        }
        
        
        
    }
}
