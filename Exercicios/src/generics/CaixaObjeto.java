package generics;

// Classe sem generico
public class CaixaObjeto {
	private Object coisa;

	public Object abrir() {
		return coisa;
	}

	public void guardar(Object coisa) {
		this.coisa = coisa;
	}
	
}
