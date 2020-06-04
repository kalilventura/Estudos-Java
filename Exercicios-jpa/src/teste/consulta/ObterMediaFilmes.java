package teste.consulta;

import infra.DAO;
import modelo.consulta.NotaFilme;
import modelo.muitosparamuitos.Filme;

public class ObterMediaFilmes {

	public static void main(String[] args) {
		DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
		NotaFilme nota = dao.findOne("obterMediaGeralDosFilmes");
		
		System.out.println(nota.getMedia());
		
		dao.closeDAO();
	}

}
