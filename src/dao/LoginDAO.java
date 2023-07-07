package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Login;

public class LoginDAO {

	private Connection con;
	private String coluna1, coluna2;

	public LoginDAO() {

	}

	public boolean autenticaUsuario(Login l) {
		PreparedStatement prep;
		ResultSet res;
		String sql;

		con = SQLConnection.abrirConexaoMySQL();

		sql = "SELECT * FROM login WHERE usuario LIKE ? AND senha LIKE ?";

		try {
			prep = con.prepareStatement(sql);
			prep.setString(1, l.getUsuario());
			prep.setString(2, l.getSenha());

			res = prep.executeQuery();

			if (res.next()) {
				coluna1 = res.getString(1);
				coluna2 = res.getString(2);
			}

			if (coluna1 == null) {
				return false;
			}

			l.setUsuario(coluna1);
			l.setSenha(coluna2);
			coluna1 = null;
			coluna2 = null;

			SQLConnection.fecharConexao();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SQLConnection.fecharConexao();
		return false;
	}

	public String getColuna1() {
		return coluna1;
	}

	public void setColuna1(String coluna1) {
		this.coluna1 = coluna1;
	}

}
