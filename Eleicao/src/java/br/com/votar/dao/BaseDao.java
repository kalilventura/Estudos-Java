/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.votar.dao;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Internet
 */
public abstract class BaseDao {
    
    public static Connection conn = null;
    public static Statement stm = null;
    
}
