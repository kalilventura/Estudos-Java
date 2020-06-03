package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {
		DAO<Cliente> dao = new DAO<>(Cliente.class);

		Cliente cliente = dao.getById(1L);

		System.out.println(cliente.getAssento().getNome());
		dao.closeDAO();

		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.getById(1L);

		System.out.println(assento.getCliente().getNome());
		daoAssento.closeDAO();
	}

}
