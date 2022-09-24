/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento.bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jacks
 */
public class BancoDados {
    
        String connectionUrl
                = "jdbc:sqlserver://localhost:1433;"
                + "database=Sistema_Faturamento;"
                + "user=sa;"
                + "password=87519023;"
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";

        ResultSet resultSet = null;
    
    public String select(String query, int quantColunas){
        String resultado = "";
         try ( Connection connection = DriverManager.getConnection(connectionUrl);  Statement statement = connection.createStatement();) {

                String selectSql = query;
                resultSet = statement.executeQuery(selectSql);

                while (resultSet.next()) {
                    for (int i = 1; i <= quantColunas; i++) {
                        resultado += resultSet.getString(i) + ",";

                    }

                    resultado += "\n";

                }
               // System.out.println("Select: " + selectSql);
                connection.close();
                
                return resultado;
            } catch (SQLException e) {
            }
         
         return null;
    }
    
    
    public void insertOUpdate(String query){
        
            try ( Connection connection = DriverManager.getConnection(connectionUrl);  PreparedStatement prepsInsertProduct = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);) {
                prepsInsertProduct.execute();
               // System.out.println("Query: " + query);
                connection.close();
            } catch (SQLException e) {
            }
        }
    
    
    public void log(String query){
                query = query.replaceAll("'", " ´ ");
               query = String.format("INSERT INTO LOG_OPERACOES VALUES ('%s')",  query );
        
            try ( Connection connection = DriverManager.getConnection(connectionUrl);  PreparedStatement prepsInsertProduct = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);) {
                prepsInsertProduct.execute();    
                connection.close();
            } catch (SQLException e) {
            }
        }
    

}
