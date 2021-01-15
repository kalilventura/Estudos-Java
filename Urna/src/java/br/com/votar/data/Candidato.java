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
public class Candidato {
    
    private int candidatoId;
    private String candidatoNome;
    Eleicao eleicao;

    public int getCandidatoId() {
        return candidatoId;
    }

    public void setCandidatoId(int candidatoId) {
        this.candidatoId = candidatoId;
    }

    public String getCandidatoNome() {
        return candidatoNome;
    }

    public void setCandidatoNome(String candidatoNome) {
        this.candidatoNome = candidatoNome;
    }

    public Eleicao getEleicao() {
        return eleicao;
    }

    public void setEleicao(Eleicao eleicao) {
        this.eleicao = eleicao;
    }
}
