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
public class Eleicao {

    private int idEleicao;
    private String nomeEleicao;
    private String descricaoEleicao;
    private Boolean votou = false; 

    public int getIdEleicao() {
        return idEleicao;
    }

    public void setIdEleicao(int idEleicao) {
        this.idEleicao = idEleicao;
    }

    public String getNomeEleicao() {
        return nomeEleicao;
    }

    public void setNomeEleicao(String nomeEleicao) {
        this.nomeEleicao = nomeEleicao;
    }

    public String getDescricaoEleicao() {
        return descricaoEleicao;
    }

    public void setDescricaoEleicao(String descricaoEleicao) {
        this.descricaoEleicao = descricaoEleicao;
    }

    public Boolean getVotou() {
        return votou;
    }

    public void setVotou(Boolean votou) {
        this.votou = votou;
    }
    
    
}
