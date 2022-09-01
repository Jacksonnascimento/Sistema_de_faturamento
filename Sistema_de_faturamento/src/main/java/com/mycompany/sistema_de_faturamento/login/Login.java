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
    
    public void criarLogin(int id, String nome, String senha, String email, String nomeUsuario){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.id = id;
        this.nomeUsuario = nomeUsuario;
        
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
        BancoDados banco = new BancoDados();
        String resultado = banco.banco(1, "SELECT * FROM USUARIO WHERE NOME_USUARIO = " + usr 
                + " AND " + "SENHA=" + senha, 6);
        
        if(resultado != null){
            
            String[] select = resultado.split(",");
            
            criarLogin(Integer.parseInt(select[0]), select[1], select[4], select[5], select[2]);
            

            System.out.println(getNome());
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
