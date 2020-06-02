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

	// Exce��o N�O checada ou N�O verifica
	// Posso escolher se quero ou n�o tratar o erro
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}

	// Exce��o checada ou verificada
	// Eu sou obrigado a colocar na assinatura do metodo a Exception que pode ser lan�ada
	// Caso eu n�o for tratar o erro no m�todo eu sou obrigado a explicitar a mensagem
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
}
