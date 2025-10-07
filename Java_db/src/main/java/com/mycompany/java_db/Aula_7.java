package com.mycompany.java_db;

import java.sql.*;
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
}