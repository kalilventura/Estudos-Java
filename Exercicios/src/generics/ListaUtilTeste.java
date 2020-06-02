package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

		String ultimaLinguagem = (String) ListaUtil.getUltimo(langs);
		System.out.println(ultimaLinguagem);
		
		Integer ultimoNumero = (Integer) ListaUtil.getUltimo(nums);
		System.out.println(ultimoNumero);
		
		
		String ultimaLinguagem2 = ListaUtil.getUltimoGeneric(langs);
		System.out.println(ultimaLinguagem2);
		
		Integer ultimoNumero2 = ListaUtil.getUltimoGeneric(nums);
		System.out.println(ultimoNumero2);
		
	}
}
