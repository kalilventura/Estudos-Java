/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.votar.data;

/**
 *
 * @author roger
 */
public class ResultadoVotacao {
    
    private String idUsuario;
    private String idCandidato;
    private String idEleicao;

    public ResultadoVotacao(String idUsuario, String idCandidato, String idEleicao) {
        this.idUsuario = idUsuario;
        this.idCandidato = idCandidato;
        this.idEleicao = idEleicao;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(String idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getIdEleicao() {
        return idEleicao;
    }

    public void setIdEleicao(String idEleicao) {
        this.idEleicao = idEleicao;
    }
    
    
    
}
