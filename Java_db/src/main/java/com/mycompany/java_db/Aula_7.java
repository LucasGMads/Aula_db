package com.mycompany.java_db;

import java.sql.*;
import javax.swing.JFrame;
        
public class Aula_7 {

    private static final String URL = "jdbc:mysql//localhost:3306/java_db";
    private static final String USER = "root";
    private static final String SENHA = "1234";
    
    public static Connection Conectar() {
        try {
            Connection conexao = DriverManager.getConnection(URL, USER, SENHA);
            return conexao;
        } catch (SQLException e){
            return null;
        }
    }
    
    public static void main(String[] args) {
        JFrame TelaPrincipal = new JFrame("TelaPrincipal");
        TelaPrincipal.setSize(800, 200); 
        TelaPrincipal.setLayout(null);
        TelaPrincipal.setVisible(true);
        
    }
        

            
}