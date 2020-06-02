package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas {
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.obterConexao();
		String sql = "SELECT * FROM pessoas";
		List<Pessoa> pessoas = new ArrayList<>();
		
		Statement stmt = conexao.createStatement();
		ResultSet result = stmt.executeQuery(sql);
		
		while(result.next()) {
			int codigo = result.getInt("codigo");
			String nome = result.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		conexao.close();
		
		System.out.println("Lista de pessoas");
		
		pessoas.parallelStream().forEach(System.out::println);
	}
}
