package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
	private static String status = "nao conectou...";
	private static Connection connection = null;

	public SQLConnection() {

	}

	public static Connection getConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		SQLConnection.connection = connection;
	}

	public static Connection abrirConexaoMySQL() {
		connection = null;
		try {

			String serverName = "localhost";
			String mydatabase = "meubanco";
			String url = "jdbc:mysql://" + serverName + ":3306/" + mydatabase;
			String username = "root";
			String password = "VIctor288632";
			connection = DriverManager.getConnection(url, username, password);

			if (connection != null) {
				status = ("STATUS--->Conectado com sucesso!");
			} else {
				status = ("STATUS--->Nao foi possivel realizar conexao");
			}

			return connection;

		} catch (SQLException e) {

			System.out.println("Nao foi possivel conectar ao Banco de Dados.");

			return null;
		}

	}

	public static void obterStatusConexao() {
		System.out.println(status);
	}

	public static boolean fecharConexao() {

		try {

			connection.close();

			return true;
		} catch (SQLException e) {
			return false;
		}

	}

	public static Connection ReiniciarConexao() {
		fecharConexao();
		return SQLConnection.abrirConexaoMySQL();
	}

}