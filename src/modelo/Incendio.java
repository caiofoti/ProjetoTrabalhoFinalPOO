package modelo;

import java.util.ArrayList;
import java.util.List;

public class Incendio {
	private String irreg;
	private String sist;
	private String local;
	private String fone;
	private String obs;

	public Incendio(String irreg, String sist, String local, String fone, String obs) {
		super();
		this.irreg = irreg;
		this.sist = sist;
		this.local = local;
		this.fone = fone;
		this.obs = obs;
	}
	
	public boolean verficaCampo() {
		if(getIrreg().isEmpty()==true)
			return true;
		if(getSist().isEmpty()==true)
			return true;
		if(getLocal().isEmpty()==true)
			return true;
		if(getFone().isEmpty()==true)
			return true;
		return false;
	}
	
	
	

	public Incendio() {

	}

	public String getIrreg() {
		return irreg;
	}

	public void setIrreg(String irreg) {
		this.irreg = irreg;
	}

	public String getSist() {
		return sist;
	}

	public void setSist(String sist) {
		this.sist = sist;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String toString() {
		return irreg + "#" + sist + "#" + local + "#" + fone + "#" + obs;
	}

	public List<String> validaIncendio() {
		ArrayList<String> listaInc = new ArrayList<String>();
		if (irreg.equals("")) {
			listaInc.add("Irregularidades");
		}

		if (sist.equals("")) {
			listaInc.add("Sistema");

		}
		if (local.equals("")) {
			listaInc.add("Local");

		}
		if (fone.equals("")) {
			listaInc.add("Fone para contato");

		}
		return listaInc;
	}
}
