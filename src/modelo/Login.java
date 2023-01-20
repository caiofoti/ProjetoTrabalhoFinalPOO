package modelo;

import java.util.ArrayList;
import java.util.List;

public class Login {

	private String usuario;
	private String senha;

	public Login(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}

	public Login() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return usuario + "#" + senha;
	}

	public List<String> validaLogin() {
		ArrayList<String> listaLog = new ArrayList<String>();
		if (usuario.equals("")) {
			listaLog.add("Usuário");
		}

		if (senha.equals("")) {
			listaLog.add("Senha");
		}

		return listaLog;
	}
}
