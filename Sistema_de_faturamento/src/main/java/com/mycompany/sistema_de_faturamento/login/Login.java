/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento.login;

import com.mycompany.sistema_de_faturamento.bancoDeDados.BancoDados;
import java.sql.SQLException;

/**
 *
 * @author jacks
 */
public class Login {
    private int id;
    private String nome;
    private String tipo;
    private String senha;
    private String email;
    private String nomeUsuario;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
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
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void criarLogin(int id, String nome, String nomeUsuario, String tipo, String senha, String email ){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.id = id;
        this.nomeUsuario = nomeUsuario;
        this.tipo = tipo;
        
    }
    
    public void criarLoginBanco(String nome, String nomeUsuario, String tipo, String senha, String email) throws SQLException{
        
        
    String insert = String.format("INSERT INTO USUARIO VALUES ('%s', '%s', '%s', '%s', '%s')",
                nome, nomeUsuario, tipo, senha, email); 
       
        
      BancoDados banco = new BancoDados();
        
       banco.banco(2, insert, 0);
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
    
    
    //metodo para buscar as informações no banco
    public boolean buscarInfoBanco(String usr, String senha) throws SQLException{
        String select = String.format("SELECT * FROM USUARIO WHERE NOME_USUARIO = '%s' AND SENHA='%s'", usr, senha);
        BancoDados banco = new BancoDados();
        String resultado = banco.banco(1, select, 6);
        /*String resultado = banco.banco(1, "SELECT * FROM USUARIO WHERE NOME_USUARIO = " + usr 
                + " AND " + "SENHA=" + senha, 6);*/
        
        if(resultado != null){
            
            String[] colunas = resultado.split(",");
            
            //int id, String nome, String nomeUsuario, String tipo, String senha, String email 
            criarLogin(Integer.parseInt(colunas[0]), colunas[1], colunas[2], 
                    colunas[3], colunas[4], colunas[5]);
   
            return true;
        } else 
            return false;
    
    }

    /**
     * @return the nomeUsuario
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * @param nomeUsuario the nome_usuario to set
     */
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
}
