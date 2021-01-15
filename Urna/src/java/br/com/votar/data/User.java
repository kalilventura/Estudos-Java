/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.votar.data;

/**
 *
 * @author Internet
 */
public class User {
    
    private int idUsuario;
    private String usuario;
    private String senha;

    public User(int idUsuario, String usuario) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
    }

    
    

    public User() {
        
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
