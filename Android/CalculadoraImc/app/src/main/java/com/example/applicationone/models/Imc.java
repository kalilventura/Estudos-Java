package com.example.applicationone.models;

import java.util.Locale;

public class Imc {
    private double peso;
    private double altura;

    public Imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularImc(){
        double result = this.peso / (this.altura * this.altura);
        return Double.valueOf(String.format(Locale.US, "%.2f", result));
    }

    public boolean imcEhValido(){
        return this.peso != 0 && this.altura != 0;
    }
}
