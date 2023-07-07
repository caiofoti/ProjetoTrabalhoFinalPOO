package modelo;

import java.util.Random;

public class Cortina {
	private String sub;
	private String tel;
	private String email;
	private String local;
	private String just;
	private String resp;
	private String ID;
	private String usuario;

	public Cortina(String sub, String tel, String email, String local, String just, String resp, String usuario) {
		super();
		this.sub = sub;
		this.tel = tel;
		this.email = email;
		this.local = local;
		this.just = just;
		this.resp = resp;
		this.usuario = usuario;
	}

	public String geraID() {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(999999) + 1;
		ID = String.valueOf(numeroAleatorio);
		return String.valueOf(numeroAleatorio);
	}

	public boolean verficaCampo() {
		if (getEmail().isEmpty() == true)
			return true;
		if (getJust().isEmpty() == true)
			return true;
		if (getLocal().isEmpty() == true)
			return true;
		if (getTel().isEmpty() == true)
			return true;
		if (getResp().isEmpty() == true)
			return true;
		if (getSub().isEmpty() == true)
			return true;
		return false;
	}

	public Cortina() {
		// TODO Auto-generated constructor stub
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getJust() {
		return just;
	}

	public void setJust(String just) {
		this.just = just;
	}

	public String getResp() {
		return resp;
	}

	public void setResp(String resp) {
		this.resp = resp;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
