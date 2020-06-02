package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	public static Connection obterConexao() {
		try {
			Properties prop = getProperties();
			
			final String url = prop.getProperty("banco.url");
			final String user = prop.getProperty("banco.usuario");
			final String password = prop.getProperty("banco.senha");

			System.out.println("Conex�o efetuada com sucesso");

			return DriverManager.getConnection(url, user, password);

		} catch (SQLException | IOException e) {
			System.out.println("N�o foi possivel conectar ao banco de dados");
			throw new RuntimeException(e);
		}
	}
	
	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		
		String path = "/conexao.properties";
		
		prop.load(FabricaConexao.class.getResourceAsStream(path));
		return prop;
	}
}
