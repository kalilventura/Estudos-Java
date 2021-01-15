/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.votar.dao;

import br.com.votar.data.User;
import br.com.votar.database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Internet
 */
public class UsuarioDao {

    private static Connection conn = null;
    private static Statement stm = null;

    public User userIsValid(User user) throws SQLException {
        User usuario = null;
        try {
            conn = DatabaseConnection.conectar();
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            String select = "SELECT * FROM UNINOVE.\"usuario\" "
                    + "WHERE \"usuario\".\"usuario\" = '" + user.getUsuario() + "' AND \"usuario\".\"senha\" = '" + user.getSenha() + "'";

            PreparedStatement preparedStatement = conn.prepareStatement(select);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while(resultSet.next()){
                    usuario = new User(resultSet.getInt("idusuario"),resultSet.getString("usuario"));
                }
            }
            return usuario; 

        } catch (Exception error) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, error.getMessage());
            return usuario;
        }
    }
}
