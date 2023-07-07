package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Cortina;
import modelo.Login;

public class CortinaDAO {

	private Connection con;
	private Login l;
	private LoginDAO logdao;
	
	public CortinaDAO() {

	}

	public boolean cadastraCortina(Cortina cor) {
		PreparedStatement prep;
		String sql;
		int lin;

		con = SQLConnection.abrirConexaoMySQL();

		sql = "INSERT INTO Cortinas VALUES(?,?,?,?,?,?,?,?)";

		try {
			prep = con.prepareStatement(sql);
			prep.setString(1, cor.getUsuario());
			prep.setString(2, cor.geraID());
			prep.setString(3, cor.getSub());
			prep.setString(4, cor.getTel());
			prep.setString(5, cor.getEmail());
			prep.setString(6, cor.getLocal());
			prep.setString(7, cor.getJust());
			prep.setString(8, cor.getResp());

			lin = prep.executeUpdate();

			SQLConnection.fecharConexao();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SQLConnection.fecharConexao();
		return false;

	}
}
