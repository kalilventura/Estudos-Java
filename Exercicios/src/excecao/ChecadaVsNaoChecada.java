package excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {

		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim :)");
	}

	// Exceção NÃO checada ou NÃO verifica
	// Posso escolher se quero ou não tratar o erro
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}

	// Exceção checada ou verificada
	// Eu sou obrigado a colocar na assinatura do metodo a Exception que pode ser lançada
	// Caso eu não for tratar o erro no método eu sou obrigado a explicitar a mensagem
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
}
