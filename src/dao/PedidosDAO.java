package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.Cortina;
import modelo.Incendio;
import modelo.Pedidos;

public class PedidosDAO {
	private String coluna1 = null, coluna2 = null, coluna3 = null, coluna4 = null, coluna5 = null, coluna6 = null,
			coluna7 = null, coluna8 = null;
	private Connection con;
	private String consulta;

	public PedidosDAO() {
	}

	public boolean consultaCortina(Pedidos p) {
		PreparedStatement prepS = null;

		ResultSet res;
		String sql;

		SQLConnection.abrirConexaoMySQL();
		con = SQLConnection.getConnection();

		sql = "Select * from cortinas where id like ?";

		try {
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

			consulta = "ID: " + coluna1 + "\nSubstituicao: " + coluna2 + "\nTelefone/Contato: " + coluna3 + "\nE-Mail: "
					+ coluna4 + "\nPredio/Sala: " + coluna5 + "\nJustificativa: " + coluna6 + "\nResponsavel: "
					+ coluna7;

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

		sql = "Select * from incendio where id like ?";

		try {
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
			}

			consulta = "ID: " + coluna1 + "\nIrregularidade: " + coluna2 + "\nSistema: " + coluna3 + "\nSala/Prédio: "
					+ coluna4 + "\nTelefone: " + coluna5 + "\nObservação: " + coluna6;

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

			sql = "DELETE FROM Cortinas WHERE id LIKE ?";

			try {
				prepS = con.prepareStatement(sql);
				prepS.setString(1, p.getID());
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

			sql = "DELETE FROM Incendio WHERE id LIKE ?";

			try {
				prepS = con.prepareStatement(sql);
				prepS.setString(1, p.getID());
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
