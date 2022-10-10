/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import com.mycompany.sistema_de_faturamento.bancoDeDados.BancoDados;







/**
 *
 * @author Jackson
 */
public class Testes {
    public static void main(String[] args)  {
        BancoDados banco = new BancoDados();
        banco.select("SELECT GETDATE();", 1);
    }
}
