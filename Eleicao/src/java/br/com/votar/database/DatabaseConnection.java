/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.votar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Internet
 */
public class DatabaseConnection {
    
    private static final String URL = "jdbc:derby://localhost:1527/uninove";
    private static final String USER = "uninove";
    private static final String PASSWORD = "root";

    private static Connection con = null;
    private static final Statement stm = null;

    public static Connection conectar() {
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.INFO, null, "Conectado");
            return con;
        } catch (SQLException e) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, e);
            return con = null;
        }
    }

    public static void desconectar(Connection con) {
        try {
            if (con != null) {
                con.close();
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.INFO, null, "Desconectado");
            }else{
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.WARNING, null, "Não há conexão com o banco de dados");
            }
        } catch (SQLException e) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
