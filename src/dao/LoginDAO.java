package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Login;

public class LoginDAO {
	
	private Connection con;
	
	public LoginDAO()
	{
		
	}
	
	public boolean autenticaUsuario(Login l)
	{
		PreparedStatement prep;
		ResultSet res;
		String sql;
		
		con=SQLConnection.abrirConexaoMySQL();
		
		sql="SELECT * FROM login WHERE usuario LIKE ? AND senha LIKE ?";
		
		try {
			prep=con.prepareStatement(sql);
			prep.setString(1, l.getUsuario());
			prep.setString(2, l.getSenha());
			
			res=prep.executeQuery();
			
			if(res.next())
			{
				SQLConnection.fecharConexao();
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SQLConnection.fecharConexao();
		return false;	
	}

}
