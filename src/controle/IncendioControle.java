package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.IncendioDAO;
import modelo.Incendio;
import visao.JanelaPrincipal;
import visao.TelaIncendio2;


public class IncendioControle implements ActionListener{
	private JanelaPrincipal j;
	private Incendio inc;
	private IncendioDAO incdao;
	private TelaIncendio2 telainc2;
	
	
	public IncendioControle(TelaIncendio2 telainc2, Incendio inc) {
		this.telainc2 = telainc2;
		this.inc = inc;
		incdao = new IncendioDAO();
		telainc2.getButtonEnviar().addActionListener(this);
	}
	
	public void enviaIncendio() {
		String irreg = telainc2.getIrregArea().getText();
		String sist = telainc2.getComboSist().getSelectedItem().toString();
		String local = telainc2.getFieldLocal().getText();
		String fone = telainc2.getFieldContato().getText();
		String obs = telainc2.getObsArea().getText();
		
		inc.setIrreg(irreg);
		inc.setSist(sist);
		inc.setFone(fone);
		inc.setLocal(local);
		inc.setObs(obs);
		
		incdao.enviaIncendio(inc);
		System.out.println("Envio feito com sucesso!");
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Enviar"))
			enviaIncendio();
}
}