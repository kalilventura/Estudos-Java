package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedido {

	public static void main(String[] args) {
		DAO<Pedido> dao = new DAO<>(Pedido.class);

		var pedido = dao.getById(1L);

		for (ItemPedido item : pedido.getItens()) {
			System.out.println(item.getProduto().getNome()+" qtde "+ item.getQuantidade());
		}

		dao.closeDAO();
	}

}
