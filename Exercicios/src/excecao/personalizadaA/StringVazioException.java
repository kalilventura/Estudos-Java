package excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVazioException extends IllegalArgumentException {
	String nomeAtributo;

	public StringVazioException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}

	@Override
	public String getMessage() {
		return String.format("O atributo '%s' está vazio", nomeAtributo);
	}

}
