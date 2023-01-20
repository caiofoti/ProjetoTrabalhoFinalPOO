package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.IncendioDAO;
import modelo.Incendio;
import modelo.Login;
import visao.JanelaPrincipal;
import visao.TelaIncendio2;


public class IncendioControle implements ActionListener{
	private JanelaPrincipal j;
	private Incendio inc;
	private IncendioDAO incdao;
	private Login log;
	
	
	public IncendioControle(JanelaPrincipal j, Incendio inc, Login log) {
		this.j = j;
		this.inc = inc;
		this.log = log;
		incdao = new IncendioDAO();
		j.getT2().getButtonEnviar().addActionListener(this);
		j.getTa().getButtonAutenticar().addActionListener(this);
		j.getTa().getButtonCancelar().addActionListener(this);
	}
	
	public void enviaIncendio() {
		String irreg = j.getT2().getIrregArea().getText();
		String sist = j.getT2().getComboSist().getSelectedItem().toString();
		String local = j.getT2().getFieldLocal().getText();
		String fone = j.getT2().getFieldContato().getText();
		String obs = j.getT2().getObsArea().getText();
		
		inc.setIrreg(irreg);
		inc.setSist(sist);
		inc.setFone(fone);
		inc.setLocal(local);
		inc.setObs(obs);
		
		if (incdao.enviaIncendio(inc)) {
			System.out.println("Envio feito com sucesso!");
			
		}
		
		else 
			System.out.println("Erro");	
	}
	
	public void consultaLogin() {
		//log.setUsuario(j.getTa().getFieldUsuario().getText());
		String usuario = j.getTa().getFieldUsuario().getText();
		log.setUsuario(usuario);
		@SuppressWarnings("deprecation")
		String senha = j.getTa().getFieldSenha().getText();
		log.setSenha(senha);
		
		if(incdao.consultaLogin(log))
		{
			System.out.println("Usuário encontrado!");
			j.getMenuEngenharia().setEnabled(true);
		}
		else
		{
			System.out.println("Usuário não encontrado!");
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Envio"))
			enviaIncendio();
		else if (e.getActionCommand().equals("Autentica"))
			consultaLogin();
}
}