package teste.basico;

import java.util.function.BinaryOperator;
import java.util.function.Function;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();

		BinaryOperator<Double> somarPreco = (total, precoAtual) -> total + precoAtual;
		Function<Produto, Double> obterPrecoProduto = produto -> produto.getPreco();		
		
		var produtos = dao.select(10, 0);

		for (Produto produto : produtos) {
			System.out.println("Id: " + produto.getId() + " Nome: " + produto.getNome() + " Preço: R$ "+produto.getPreco());
		}

		double precoTotal = produtos
				.stream()
				.map(obterPrecoProduto)
				.reduce(0.0, somarPreco)
				.doubleValue();
		
		System.out.println("Valor total R$: "+ precoTotal);
		
		dao.closeDAO();
	}

}
