package modelo;

import java.util.Random;

public class EPIS {
	private String usuario, ID, luva1, luva2, luva3, luva4, luva5, manga, avental, cartucho1, cartucho2, resp1, resp2, mascara,
	resp3, protetor1, protetor2, sapatilha, touca, oculos1, oculos2, escudo, matricula, telf, func, obs;
	

	public EPIS() {
	}

	public String geraID() {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(999999) + 1;
		ID = String.valueOf(numeroAleatorio);
		return String.valueOf(numeroAleatorio);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getFunc() {
		return func;
	}

	public void setFunc(String func) {
		this.func = func;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTelf() {
		return telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getLuva1() {
		return luva1;
	}

	public void setLuva1(String luva1) {
		this.luva1 = luva1;
	}

	public String getLuva2() {
		return luva2;
	}

	public void setLuva2(String luva2) {
		this.luva2 = luva2;
	}

	public String getLuva3() {
		return luva3;
	}

	public void setLuva3(String luva3) {
		this.luva3 = luva3;
	}

	public String getLuva4() {
		return luva4;
	}

	public void setLuva4(String luva4) {
		this.luva4 = luva4;
	}

	public String getLuva5() {
		return luva5;
	}

	public void setLuva5(String luva5) {
		this.luva5 = luva5;
	}

	public String getManga() {
		return manga;
	}

	public void setManga(String manga) {
		this.manga = manga;
	}

	public String getAvental() {
		return avental;
	}

	public void setAvental(String avental) {
		this.avental = avental;
	}

	public String getCartucho1() {
		return cartucho1;
	}

	public void setCartucho1(String cartucho1) {
		this.cartucho1 = cartucho1;
	}

	public String getCartucho2() {
		return cartucho2;
	}

	public void setCartucho2(String cartucho2) {
		this.cartucho2 = cartucho2;
	}

	public String getResp1() {
		return resp1;
	}

	public void setResp1(String resp1) {
		this.resp1 = resp1;
	}

	public String getResp2() {
		return resp2;
	}

	public void setResp2(String resp2) {
		this.resp2 = resp2;
	}

	public String getMascara() {
		return mascara;
	}

	public void setMascara(String mascara) {
		this.mascara = mascara;
	}

	public String getResp3() {
		return resp3;
	}

	public void setResp3(String resp3) {
		this.resp3 = resp3;
	}

	public String getProtetor1() {
		return protetor1;
	}

	public void setProtetor1(String protetor1) {
		this.protetor1 = protetor1;
	}

	public String getProtetor2() {
		return protetor2;
	}

	public void setProtetor2(String protetor2) {
		this.protetor2 = protetor2;
	}

	public String getSapatilha() {
		return sapatilha;
	}

	public void setSapatilha(String sapatilha) {
		this.sapatilha = sapatilha;
	}

	public String getTouca() {
		return touca;
	}

	public void setTouca(String touca) {
		this.touca = touca;
	}

	public String getOculos1() {
		return oculos1;
	}

	public void setOculos1(String oculos1) {
		this.oculos1 = oculos1;
	}

	public String getOculos2() {
		return oculos2;
	}

	public void setOculos2(String oculos2) {
		this.oculos2 = oculos2;
	}

	public String getEscudo() {
		return escudo;
	}

	public void setEscudo(String escudo) {
		this.escudo = escudo;
	}

}
