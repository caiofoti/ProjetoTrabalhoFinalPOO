package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Login;
import modelo.Pedidos;

public class PedidosDAO {
	private String coluna1 = null, coluna2 = null, coluna3 = null, coluna4 = null, coluna5 = null, coluna6 = null,
			coluna7 = null, coluna8 = null, coluna9 = null, coluna10 = null, coluna11 = null, coluna12 = null,
			coluna13 = null, coluna14 = null, coluna15 = null, coluna16 = null, coluna17 = null, coluna18 = null,
			coluna19 = null, coluna20 = null, coluna21 = null, coluna22 = null, coluna23 = null, coluna24 = null,
			coluna25 = null, coluna26 = null;

	private Connection con;
	private String consulta;
	private Login l;

	public PedidosDAO() {
	}

	public boolean consultaCortina(Pedidos p) {
		PreparedStatement prepS = null;
		ResultSet res;
		String sql;
		SQLConnection.abrirConexaoMySQL();
		con = SQLConnection.getConnection();
		sql = "SELECT * FROM cortinas WHERE id LIKE ?";

		try {
			coluna2 = null;
			prepS = con.prepareStatement(sql);
			prepS.setString(1, p.getID());
			res = prepS.executeQuery();

			while (res.next()) {
				coluna1 = res.getString(1);
				coluna2 = res.getString(2);
				coluna3 = res.getString(3);
				coluna4 = res.getString(4);
				coluna5 = res.getString(5);
				coluna6 = res.getString(6);
				coluna7 = res.getString(7);
				coluna8 = res.getString(8);
			}
			
			if (coluna2 == null) 
				return false;
			

			consulta = "ID Usuário: " + coluna1 + "\nSubstituicao: " + coluna3 + "\nTelefone/Contato: " + coluna4
					+ "\nE-Mail: " + coluna5 + "\nPredio/Sala: " + coluna6 + "\nJustificativa: " + coluna7
					+ "\nResponsavel: " + coluna8;

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			SQLConnection.fecharConexao();
			return false;
		}

		SQLConnection.fecharConexao();
		return true;
	}

	public boolean consultaIncendio(Pedidos p) {
		PreparedStatement prepS = null;

		ResultSet res;
		String sql;

		SQLConnection.abrirConexaoMySQL();
		con = SQLConnection.getConnection();

		sql = "SELECT * FROM incendio WHERE id LIKE ?";

		try {
			coluna2 = null;
			prepS = con.prepareStatement(sql);
			prepS.setString(1, p.getID());
			res = prepS.executeQuery();

			while (res.next()) {
				coluna1 = res.getString(1);
				coluna2 = res.getString(2);
				coluna3 = res.getString(3);
				coluna4 = res.getString(4);
				coluna5 = res.getString(5);
				coluna6 = res.getString(6);
				coluna7 = res.getString(7);
			}
			
			
			if (coluna2 == null) 
				return false;

			consulta = "ID Usuário: " + coluna1 + "\nIrregularidade: " + coluna3 + "\nSistema: " + coluna4
					+ "\nSala/Prédio: " + coluna5 + "\nTelefone: " + coluna6 + "\nObservação: " + coluna7;

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			SQLConnection.fecharConexao();
			return false;
		}

		SQLConnection.fecharConexao();
		return true;
	}

	public boolean removeCortina(Pedidos p) {
		{
			PreparedStatement prepS = null;
			String sql;
			int res;
			SQLConnection.abrirConexaoMySQL();
			con = SQLConnection.getConnection();

			sql = "DELETE FROM Cortinas WHERE id LIKE ? AND usuario LIKE ?";

			try {
				prepS = con.prepareStatement(sql);
				prepS.setString(1, p.getID());
				prepS.setString(2, p.getUsuario());
				res = prepS.executeUpdate();

				if (res == 1) {
					SQLConnection.fecharConexao();
					return true;
				}

				else {
					return false;
				}

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				SQLConnection.fecharConexao();
				return false;
			}

		}
	}

	public boolean removeIncendio(Pedidos p) {
		{
			PreparedStatement prepS = null;
			String sql;
			int res;
			SQLConnection.abrirConexaoMySQL();
			con = SQLConnection.getConnection();

			sql = "DELETE FROM Incendio WHERE id LIKE ? AND usuario LIKE ?";

			try {
				prepS = con.prepareStatement(sql);
				prepS.setString(1, p.getID());
				prepS.setString(2, p.getUsuario());
				res = prepS.executeUpdate();

				if (res == 1) {
					SQLConnection.fecharConexao();
					return true;
				}

				else {
					return false;
				}

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				SQLConnection.fecharConexao();
				return false;
			}

		}
	}

	public boolean consultaEpi(Pedidos p) {
		PreparedStatement prepS = null;

		ResultSet res;
		String sql;

		SQLConnection.abrirConexaoMySQL();
		con = SQLConnection.getConnection();

		sql = "Select * from epis where id like ?";

		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, p.getID());
			res = prepS.executeQuery();
			coluna2 = null;
			
			
			while (res.next()) {
				coluna1 = res.getString(1);
				coluna2 = res.getString(2);
				coluna3 = res.getString(3);
				coluna4 = res.getString(4);
				coluna5 = res.getString(5);
				coluna6 = res.getString(6);
				coluna7 = res.getString(7);
				coluna8 = res.getString(8);
				coluna9 = res.getString(9);
				coluna10 = res.getString(10);
				coluna11 = res.getString(11);
				coluna12 = res.getString(12);
				coluna13 = res.getString(13);
				coluna14 = res.getString(14);
				coluna15 = res.getString(15);
				coluna16 = res.getString(16);
				coluna17 = res.getString(17);
				coluna18 = res.getString(18);
				coluna19 = res.getString(19);
				coluna20 = res.getString(20);
				coluna21 = res.getString(21);
				coluna22 = res.getString(22);
				coluna23 = res.getString(23);
				coluna24 = res.getString(24);
				coluna25 = res.getString(25);
				coluna26 = res.getString(26);
			}
			
			if (coluna2 == null) 
				return false;
			

			consulta = "ID Usuário: " + coluna1 + "\n" + coluna3 + "\n" + coluna4 + "\n" + coluna5 + "\n" + coluna6
					+ "\n" + coluna7 + "\n" + coluna8 + "\n" + coluna9 + "\n" + coluna10 + "\n" + coluna11 + "\n"
					+ coluna12 + "\n" + coluna13 + "\n" + coluna14 + "\n" + coluna15 + "\n" + coluna16 + "\n" + coluna17
					+ "\n" + coluna18 + "\n" + coluna19 + "\n" + coluna20 + "\n" + coluna21 + "\n" + coluna22 + "\n"
					+ coluna23 + "\n" + coluna24 + "\n" + coluna25;

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			SQLConnection.fecharConexao();
			return false;
		}

		SQLConnection.fecharConexao();
		return true;
	}

	public boolean removeEPIS(Pedidos p) {
		PreparedStatement prepS = null;
		String sql;
		int res;
		SQLConnection.abrirConexaoMySQL();
		con = SQLConnection.getConnection();

		sql = "DELETE FROM epis WHERE id LIKE ? AND usuario LIKE ?";

		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, p.getID());
			prepS.setString(2, p.getUsuario());
			res = prepS.executeUpdate();

			if (res == 1) {
				SQLConnection.fecharConexao();
				return true;
			}

			else {
				return false;
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			SQLConnection.fecharConexao();
			return false;
		}

	}

	// ##### CRIA GETTERS E SETTERS

	public String getColuna1() {
		return coluna1;
	}

	public void setColuna1(String coluna1) {
		this.coluna1 = coluna1;
	}

	public String getColuna2() {
		return coluna2;
	}

	public void setColuna2(String coluna2) {
		this.coluna2 = coluna2;
	}

	public String getColuna3() {
		return coluna3;
	}

	public void setColuna3(String coluna3) {
		this.coluna3 = coluna3;
	}

	public String getColuna4() {
		return coluna4;
	}

	public void setColuna4(String coluna4) {
		this.coluna4 = coluna4;
	}

	public String getColuna5() {
		return coluna5;
	}

	public void setColuna5(String coluna5) {
		this.coluna5 = coluna5;
	}

	public String getColuna6() {
		return coluna6;
	}

	public void setColuna6(String coluna6) {
		this.coluna6 = coluna6;
	}

	public String getColuna7() {
		return coluna7;
	}

	public void setColuna7(String coluna7) {
		this.coluna7 = coluna7;
	}

	public String getColuna8() {
		return coluna8;
	}

	public void setColuna8(String coluna8) {
		this.coluna8 = coluna8;
	}

	public String getColuna9() {
		return coluna9;
	}

	public void setColuna9(String coluna9) {
		this.coluna9 = coluna9;
	}

	public String getColuna10() {
		return coluna10;
	}

	public void setColuna10(String coluna10) {
		this.coluna10 = coluna10;
	}

	public String getColuna11() {
		return coluna11;
	}

	public void setColuna11(String coluna11) {
		this.coluna11 = coluna11;
	}

	public String getColuna12() {
		return coluna12;
	}

	public void setColuna12(String coluna12) {
		this.coluna12 = coluna12;
	}

	public String getColuna13() {
		return coluna13;
	}

	public void setColuna13(String coluna13) {
		this.coluna13 = coluna13;
	}

	public String getColuna14() {
		return coluna14;
	}

	public void setColuna14(String coluna14) {
		this.coluna14 = coluna14;
	}

	public String getColuna15() {
		return coluna15;
	}

	public void setColuna15(String coluna15) {
		this.coluna15 = coluna15;
	}

	public String getColuna16() {
		return coluna16;
	}

	public void setColuna16(String coluna16) {
		this.coluna16 = coluna16;
	}

	public String getColuna17() {
		return coluna17;
	}

	public void setColuna17(String coluna17) {
		this.coluna17 = coluna17;
	}

	public String getColuna18() {
		return coluna18;
	}

	public void setColuna18(String coluna18) {
		this.coluna18 = coluna18;
	}

	public String getColuna19() {
		return coluna19;
	}

	public void setColuna19(String coluna19) {
		this.coluna19 = coluna19;
	}

	public String getColuna20() {
		return coluna20;
	}

	public void setColuna20(String coluna20) {
		this.coluna20 = coluna20;
	}

	public String getColuna21() {
		return coluna21;
	}

	public void setColuna21(String coluna21) {
		this.coluna21 = coluna21;
	}

	public String getColuna22() {
		return coluna22;
	}

	public void setColuna22(String coluna22) {
		this.coluna22 = coluna22;
	}

	public String getColuna23() {
		return coluna23;
	}

	public void setColuna23(String coluna23) {
		this.coluna23 = coluna23;
	}

	public String getColuna24() {
		return coluna24;
	}

	public void setColuna24(String coluna24) {
		this.coluna24 = coluna24;
	}

	public String getColuna25() {
		return coluna25;
	}

	public void setColuna25(String coluna25) {
		this.coluna25 = coluna25;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public String getConsulta() {
		return consulta;
	}

	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}

}
