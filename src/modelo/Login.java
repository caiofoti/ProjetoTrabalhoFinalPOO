package modelo;

public class Login {
	
	private String usuario, senha;
	
	public Login()
	{
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean validaUsuario(String user)
	{
		if(user.length()>10)
		{
			return false;
		}
		
		else
		{
			return true;
		}
		
		
	}

}
