/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Gerson Risso
 */
public class Calculo {

    public static float calcArea(float lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("Medida inválida");
        } else {
            return lado * lado;
        }
    }

    public static float calcArea(float larg, float comp) {
        return larg * comp;
    }

    public static float calcArea2(float cubo) {
        if (cubo <= 0) {
            throw new IllegalArgumentException("Medida inválida");
        } else {
            return cubo * cubo * cubo;
        }
    }

    public static float calcArea2(float base, float altura) {

        return (base * altura) / 2;

    }

}
