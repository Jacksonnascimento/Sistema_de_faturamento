package com.mycompany.sistema_de_faturamento;

import com.mycompany.sistema_de_faturamento.bancoDeDados.BancoDados;
import java.sql.SQLException;



/**
 *
 * @author Jackson
 */
public class Despesa {
    private String tipo;
    private String descricao;
    private int id;
    private double valor;

    
   //adicionar despesa
    public void addDespesa(int id, String descricao, String tipo, double valor){
        this.tipo = tipo;
        this.descricao = descricao;
        this.id = id;
        this.valor = valor;
    }
    
    //adicionar despesa no banco de dados
    public void addDespesaBanco(String descricao, String tipo, double valor) throws SQLException{
      
        String insert = String.format("INSERT INTO DESPESA VALUES ('%s', '%s', '%s');", descricao, tipo, valor);
        
       BancoDados banco = new BancoDados();
       banco.insertOUpdate(insert);
        
    }
    
    
    /**
     * @param tipo
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    

    
    
    
}
