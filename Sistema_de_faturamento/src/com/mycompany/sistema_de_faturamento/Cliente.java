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
public class Cliente extends Pessoa {

    private String cpf;
    private ArrayList<Cliente> clientes = new ArrayList();
    
    public Cliente() {
        super();
    }
    
    public void addCliente(int id, String nome, String email, String cpf) {
        super.setId(id);
        super.setNome(nome);
        this.cpf = cpf;
        super.setEmail(email);
    }
    
    public void buscarClientesBanco() {
        BancoDados banco = new BancoDados();
        String select = ("SELECT * FROM CLIENTE");
        select = banco.select(select, 4);
        
        String[] linhas = select.split("\n");
        
        for (String linha : linhas) {
            Cliente cliente = new Cliente();
            String[] colunas = linha.split(",");
            cliente.addCliente(Integer.parseInt(colunas[0]), colunas[1], colunas[2], colunas[3]);            
            clientes.add(cliente);
        }
    }
    
    public Cliente buscarCliente(String cpf) {
        for (Cliente cli : clientes) {
            if (cpf.equals(cli.getCpf())) {
                return cli;
                
            }
        }
        JOptionPane.showMessageDialog(null, "Informe um CPF válido!");
        return null;
        
    }
    
    public Cliente buscarCliente(int id) {
        for (Cliente cli : clientes) {
            if (id == cli.getId()) {
                return cli;
                
            }
        }
        JOptionPane.showMessageDialog(null, "Informe um ID válido!");
        return null;
        
    }

    public void addClienteBanco(String nome, String email, String cpf) throws SQLException {
        BancoDados banco = new BancoDados();
        String insert = String.format("INSERT INTO CLIENTE VALUES ('%s', '%s', '%s')", nome, email, cpf);
        banco.insertOUpdate(insert);
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
    
}
