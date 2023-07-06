package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Pedidos;

public class PedidosDAO {
	private String coluna1 = null, coluna2 = null, coluna3 = null,coluna4 = null,coluna5 = null,coluna6 = null,coluna7 = null,coluna8 = null,coluna9 = null,coluna10 = null,coluna11 = null,coluna12 = null;
	private Connection con;
	private String linha;

	public PedidosDAO() {
	}


	public boolean consultaPedido(Pedidos p) {
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
			
			 linha = "ID: " +coluna1+ "\nSubstituicao: " +coluna2+ "\nTelefone/Contato: " +coluna3+ "\nE-Mail: " +coluna4+ "\nPredio/Sala: " +coluna5+ "\nJustificativa: " +coluna6+ "\nResponsavel: " +coluna7;

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			SQLConnection.fecharConexao();
			return false;
		}

		SQLConnection.fecharConexao();
		return true;
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


	public Connection getCon() {
		return con;
	}


	public void setCon(Connection con) {
		this.con = con;
	}


	public String getLinha() {
		return linha;
	}


	public void setLinha(String linha) {
		this.linha = linha;
	}
	
	
}
