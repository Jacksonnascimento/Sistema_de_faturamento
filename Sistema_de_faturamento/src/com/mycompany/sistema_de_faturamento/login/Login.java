/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento.login;

import com.mycompany.sistema_de_faturamento.Pessoa;
import com.mycompany.sistema_de_faturamento.bancoDeDados.BancoDados;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jacks
 */
public class Login extends Pessoa{

    
    private String tipo;
    private String senha;
 
    private String nomeUsuario;
    private ArrayList<Login> usuarios = new ArrayList();
  
    
    public Login() {
        super();
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


   

    public void criarLogin(int id, String nome, String nomeUsuario, String tipo, String senha, String email) {
        super.setNome(nome); 
        this.senha = senha;
        super.setEmail(email); 
        super.setId(id);
        this.nomeUsuario = nomeUsuario;
        this.tipo = tipo;

    }

    public void criarLoginBanco(String nome, String nomeUsuario, String tipo, String senha, String email) throws SQLException {
        
        String insert = String.format("INSERT INTO USUARIO VALUES ('%s', '%s', '%s', '%s', '%s')",
                nome, nomeUsuario, tipo, senha, email);

        BancoDados banco = new BancoDados();

        banco.insertOUpdate(insert);
    }


    public void criarBuscarUsuariosBanco(){
        String select = "SELECT * FROM USUARIO";
        BancoDados banco = new BancoDados();
        String resultado = banco.select(select, 6);
        
        String [] linhas = resultado.split("\n");
        
        
        for (String linha : linhas){
            String [] colunas = linha.split(",");
            Login login = new Login();
            login.criarLogin(Integer.parseInt(colunas[0]), colunas[1], colunas[2],
                    colunas[3], colunas[4], colunas[5]);
            usuarios.add(login);
        }
    }

    //metodo para buscar as informa????es no banco
    public boolean validarUsrSenha(String usr, String senha) throws SQLException {
        
        for(Login usuario : usuarios){
            if(usr.equals(usuario.nomeUsuario))
            {
                if(senha.equals(usuario.getSenha()))
                {
                    return true;
                } else
                {
                    JOptionPane.showMessageDialog(null, "Senha incorreta!");
                    return false;
                }
            } 
     }
       JOptionPane.showMessageDialog(null, "Usu??rio ou senha incorretos!");
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
