package br.com.coder.app.financeiro;

import java.lang.reflect.Field;

import br.com.coder.app.calculo.Calculadora;

public class Teste {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		System.out.println(calculadora.soma(2, 3, 4));

		try {
			Field fieldId = Calculadora.class.getDeclaredFields()[0];
			fieldId.setAccessible(true);
			fieldId.set(calculadora, "foi alterado");
			
			// Exemplo utilizando reflection da calculadora
			System.out.println(fieldId.get(calculadora));
			
			fieldId.setAccessible(false);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
