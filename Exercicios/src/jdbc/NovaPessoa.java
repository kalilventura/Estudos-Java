package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o nome: ");
		String nome = entrada.nextLine();

		entrada.close();
		
		Connection conexao = FabricaConexao.obterConexao();
		
		String sql = "INSERT INTO pessoas(nome) VALUES(?);";
		
		// Utilizando esse pois é mais seguro, caso tentar um SQL Injection ele não
		// vai conseguir
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso");
		
		conexao.close();
	}
}
