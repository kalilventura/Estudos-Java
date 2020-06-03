package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();

		Assento assento = new Assento("16C");
		Cliente cliente = new Cliente("Ana", assento);

		// Como estamos inserindo os objetos que tem dependencia entre sim
		// utilizando em uma transação, automaticamente o hibernate vai ver que tem
		// dependencia e insere primeiro o assento e depois o cliente
		dao.openTransaction()
		   .insert(assento)
		   .insert(cliente)
		   .closeTransaction()
		   .closeDAO();
	}

}
