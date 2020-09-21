package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			String banco = System.getenv("tipoBanco");
			Connection c = DriverManager.getConnection(String.format("jdbc://%s://localhost/banco", banco), "root", "123456");

			return c;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
