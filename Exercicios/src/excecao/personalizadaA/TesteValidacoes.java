package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		try {
			Aluno a = new Aluno("Ana", 7);
			Validar.aluno(a);
			
			Validar.aluno(null);
		} catch (StringVazioException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}
}
