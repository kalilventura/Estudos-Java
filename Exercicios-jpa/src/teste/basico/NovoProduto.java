package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {

		DAO<Produto> dao = new DAO<>(Produto.class);

		Produto caneta = new Produto("Caneta", 7.45);
		Produto notebook = new Produto("Notebook", 2987.78);
		Produto monitor = new Produto("Monitor 23", 789.98);

		dao.openTransaction().insert(caneta).closeTransaction();

		dao.atomicInsert(notebook);		

		dao.atomicInsert(monitor);
		
		System.out.println("Id da caneta: " + caneta.getId());
		System.out.println("Id do notebook: " + notebook.getId());
		System.out.println("Id do monitor: " + monitor.getId());

		dao.closeDAO();
	}

}
