package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Cortina;
import modelo.Incendio;

public class IncendioDAO {

	private Connection con;

	public IncendioDAO() {
	}

	public boolean cadastraIncendio(Incendio inc) {
		PreparedStatement prep;
		String sql;
		int lin;

		con = SQLConnection.abrirConexaoMySQL();

		sql = "INSERT INTO Incendio VALUES(?,?,?,?,?,?)";

		try {
			prep = con.prepareStatement(sql);
			prep.setString(1, inc.geraID());
			prep.setString(2, inc.getIrreg());
			prep.setString(3, inc.getSist());
			prep.setString(4, inc.getLocal());
			prep.setString(5, inc.getFone());
			prep.setString(6, inc.getObs());
		
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
