package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
	public static void main(String[] args) throws SQLException {

		String sql = "SELECT codigo, nome FROM pessoas WHERE codigo = ?;";
		String sqlUpdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?;";

		Scanner scanner = new Scanner(System.in);

		Connection connection = FabricaConexao.obterConexao();

		System.out.print("Digite o código da pessoa que deseja alterar: ");
		int codigo = scanner.nextInt();

		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, codigo);

		ResultSet result = stmt.executeQuery();
		Pessoa pessoa = null;

		if (result.next()) {
			int c = result.getInt("codigo");
			String nome = result.getString("nome");
			pessoa = new Pessoa(c, nome);
		}

		stmt.close();

		if (pessoa == null) {
			System.out.println("Não há pessoas cadastradas com esse id");
			scanner.close();
			return;
		}

		System.out.println(pessoa.toString() + "\n\n");
		scanner.nextLine();

		System.out.print("Digite o nome para alterar: ");
		String novoNome = scanner.nextLine();

		pessoa.setNome(novoNome);
		System.out.print("\nRegistro atualizado: " + pessoa.toString() +"\n");

		stmt = connection.prepareStatement(sqlUpdate);
		stmt.setString(1, pessoa.getNome());
		stmt.setInt(2, pessoa.getCodigo());

		stmt.execute();

		System.out.println("Registro atualizado com sucesso");

		scanner.close();
		connection.close();
	}
}
