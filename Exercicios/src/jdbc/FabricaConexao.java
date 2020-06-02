package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	public static Connection obterConexao() {
		try {
			
			final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
			final String user = "root";
			final String password = "root";

			System.out.println("Conexão efetuada com sucesso");

			return DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			System.out.println("Não foi possivel conectar ao banco de dados");
			throw new RuntimeException(e);
		}
	}
}
