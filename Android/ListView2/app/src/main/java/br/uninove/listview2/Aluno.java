package br.uninove.listview2;

import java.io.Serializable;

public class Aluno implements Serializable {

    private String ra;
    private String nome;
    private String curso;
    private String campus;

    public Aluno(String ra, String nome, String curso, String campus) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.campus = campus;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    @Override
    public String toString() {
        return nome;
    }

    public String getDados(){
        return "RA: " + ra +
                "\nNome: " + nome +
                "\nCurso: " + curso +
                "\nCampus: " + campus;
    }
}
