package carro;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> lista = new LinkedList<>();
               
        lista.add(new Carro("Corsa","GM",2015,2563.21F));
        lista.add(new Carro("Ferrari","Fiat",2018,25632.25F));
        lista.add(new Carro("Uno","Fiat",1998,0.01F));

        for (Carro carro : lista) {
            System.out.println("Carro: ");
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Marca: " + carro.getMarca());
            System.out.println("Ano: " + carro.getAno());
            System.out.println("Preço: " + carro.getPreco() + "\n\n");
        }

    }

}
