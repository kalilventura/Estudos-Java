package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		DAO<Aluno> dao = new DAO<>();
		Aluno aluno = new Aluno(123L, "João");
		AlunoBolsista alunoBolsista = new AlunoBolsista(345L, "Maria", 1000);
		
		dao.atomicInsert(aluno);
		dao.atomicInsert(alunoBolsista);
	}

}
