/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento;

import com.mycompany.sistema_de_faturamento.bancoDeDados.BancoDados;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jackson
 */
public class EstoqueProdutos {
    private ArrayList<Estoque> estoques = new ArrayList<>();
    private Estoque estoque;
    
    
    public void addQuantidadeProduto(int id, int idProduto, int quantidade){
        estoque = new Estoque();
        estoque.addEstoque(id, idProduto, quantidade);
        estoques.add(estoque);
    }
    
    public void buscarEstoquebanco() throws SQLException{
        BancoDados banco = new BancoDados();
        String estoqueSelect = banco.select("SELECT * FROM ESTOQUE", 3);
        String [] linhas = estoqueSelect.split("\n");
        
        
        
        for (String linha : linhas) {
           String[] colunas = linha.split(",");
            addQuantidadeProduto(Integer.parseInt(colunas[0]), Integer.parseInt(colunas[1]), Integer.parseInt(colunas[2]));
       }
        
       
    }
    
     //retorna qProdu pelo id
    public Estoque oProdutoQuant(int idProduto) throws SQLException{
        for (Estoque esto : estoques){
            if(esto.getIdProduto()== idProduto){
                return esto;
            }
        } 
        
         EstoqueProdutos pro =  new EstoqueProdutos();
         
         
           Estoque estoque = new Estoque();
           estoque = new Estoque();
           estoque.addQuanBanco(idProduto, 0);

        return null;

    }

    /**
     * @return the estoques
     */
    public ArrayList<Estoque> getEstoques() {
        return estoques;
    }

    /**
     * @param estoques the estoques to set
     */
    public void setEstoques(ArrayList<Estoque> estoques) {
        this.estoques = estoques;
    }
    
    
    
    
}
