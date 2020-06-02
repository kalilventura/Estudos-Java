package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		final String user = "kalil";
		final String password = "kalil";
		
		Connection conexao = DriverManager.getConnection(url, user, password);
		
		System.out.println("Conexão efetuada com sucesso");
		conexao.close();
	}
}
