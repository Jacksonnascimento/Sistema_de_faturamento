/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_faturamento.bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author jacks
 */
public class BancoDados {
    
        public String banco(int tipo, String query) {
        String resultado = "";
        String connectionUrl =
                "jdbc:sqlserver://localhost:1433;"
                + "database=FPG_WEB_CM_COCOS;"
                + "user=sa;"
                + "password=87519023;"
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement.
            
            if(tipo == 1){
               resultSet = statement.executeQuery(query);
               
                while (resultSet.next()) {
                resultado += resultSet.getString(1);
                return resultado;
                }
                
               
            } else if (tipo == 2){
                statement.executeQuery(query);
            }
            
            

          /*  // Print results from select statement
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            } */
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }

}
