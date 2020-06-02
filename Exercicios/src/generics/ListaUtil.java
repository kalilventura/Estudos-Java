package generics;

import java.util.List;

public class ListaUtil {

	// Método não generico
	public static Object getUltimo(List<?> lista) {
		return lista.get(lista.size() - 1);
	}
	
	// Metodo Generic
	public static <T> T getUltimoGeneric(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
	
}
