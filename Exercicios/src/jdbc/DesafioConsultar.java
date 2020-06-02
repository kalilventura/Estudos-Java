package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioConsultar {
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome da pessoa procurada: ");
		String nomePessoa = scanner.nextLine();

		scanner.close();

		Connection conexao = FabricaConexao.obterConexao();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		List<Pessoa> pessoas = new ArrayList<>();

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + nomePessoa + "%");

		ResultSet result = stmt.executeQuery();

		while (result.next()) {
			int codigo = result.getInt("codigo");
			String nome = result.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}

		conexao.close();

		System.out.println("Lista de pessoas");

		pessoas.parallelStream().forEach(System.out::println);
	}
}
