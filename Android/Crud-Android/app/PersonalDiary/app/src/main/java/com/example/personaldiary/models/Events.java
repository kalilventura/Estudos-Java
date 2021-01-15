package com.example.personaldiary.models;

import androidx.annotation.NonNull;
import java.io.Serializable;

/**
 * Dominio banco de dados
 */
public class Events implements Serializable {
    private String title;
    private String text;
    private int Id;

    public Events() {}

    public Events(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public Events(int id, String title, String text) {
        this.Id = id;
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @NonNull
    @Override
    public String toString() {
        return "ID: "+ Id +", Titulo: "+title+", Descrição: "+text;
    }
}
