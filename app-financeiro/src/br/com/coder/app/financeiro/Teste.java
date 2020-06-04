package br.com.coder.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.coder.app.Calculadora;

public class Teste {

	public static void main(String[] args) {
		Calculadora calculadora = ServiceLoader.load(Calculadora.class).findFirst().get();
		
		System.out.println(calculadora.soma(2, 3, 4));

		try {
			Field fieldId = calculadora.getClass().getDeclaredFields()[0];
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
