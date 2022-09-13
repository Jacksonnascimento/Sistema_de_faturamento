/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento;

import com.mycompany.sistema_de_faturamento.bancoDeDados.BancoDados;
import java.sql.SQLException;

/**
 *
 * @author Jackson
 */
public class Cliente {
    private int  id;
    private String nome;
    private String cpf;
    private String email;

    
    public void addCliente(int id, String nome, String cpf, String email){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.setEmail(email);
    }
    
    public void addClienteBanco(String nome, String cpf, String email) throws SQLException{
        BancoDados banco = new BancoDados();
        String insert = String.format("INSERT INTO CLIENTE VALUES ('%s', '%s', '%s')", nome, cpf, email);
        banco.insertOUpdate(insert);
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    
    
}
