package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.IncendioDAO;
import modelo.Cortina;
import modelo.Incendio;
import modelo.Login;
import visao.JanelaPrincipal;

public class IncendioControle implements ActionListener {
	private JanelaPrincipal j;
	private Incendio inc;
	private IncendioDAO incdao;
	private Login log;
	private Cortina c;

	public IncendioControle(JanelaPrincipal j, Incendio inc, Login log, Cortina c) {
		this.j = j;
		this.inc = inc;
		this.log = log;
		this.c = c;
		incdao = new IncendioDAO();
		j.getT2().getButtonEnviar().addActionListener(this);
		j.getTa().getButtonAutenticar().addActionListener(this);
		j.getTa().getButtonCancelar().addActionListener(this);
		j.getTc().getButtonEnviar().addActionListener(this);
		j.getTc().getButtonCancelar().addActionListener(this);
		j.getItemSair().addActionListener(this);
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

		if (inc.validaIncendio().size() > 0) {

			System.out.println("Campos" + inc.validaIncendio()
					+ " estão em branco, preencha todos os campos para realizar o envio!");
		} else {

			if (incdao.enviaIncendio(inc)) {
				System.out.println("Envio feito com sucesso!");

			}

			else
				System.out.println("Erro");
		}
	}

	public void enviaCortina() {
		// ButtonModel subst = j.getTc().getButtonGroup().getSelection();
		String tel = j.getTc().getFieldTel().getText();
		String email = j.getTc().getFieldEmail().getText();
		String local = j.getTc().getFieldLocal().getText();
		String just = j.getTc().getFieldLocal().getText();
		String resp = j.getTc().getFieldResp().getText();

		c.setEmail(email);
		c.setJust(just);
		c.setLocal(local);
		c.setResp(resp);
		// c.setSub(subst);
		c.setTel(tel);

		if (c.validaCortina().size() > 0) {

			System.out.println(
					"Campos" + c.validaCortina() + " estão em branco, preencha todos os campos para realizar o envio!");
		} else {

			if (incdao.enviaCortina(c)) {
				System.out.println("Envio feito com sucesso!");

			}

			else
				System.out.println("Erro");
		}
	}

	public void consultaLogin() {
		// log.setUsuario(j.getTa().getFieldUsuario().getText());
		String usuario = j.getTa().getFieldUsuario().getText();
		log.setUsuario(usuario);
		@SuppressWarnings("deprecation")
		String senha = j.getTa().getFieldSenha().getText();
		log.setSenha(senha);

		if (log.validaLogin().size() > 0) {
			System.out.println(
					"Campos" + log.validaLogin() + " estão em branco, preencha todos os campos para autenticar!");
		} else {
			if (incdao.consultaLogin(log)) {
				System.out.println("Usuário encontrado!");
				j.getMenuEngenharia().setEnabled(true);
			} else {
				System.out.println("Usuário não encontrado!");
			}

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Envio"))
			enviaIncendio();
		else if (e.getActionCommand().equals("Autentica")) {
			consultaLogin();
		} else if (e.getActionCommand().equals("Enviar")) {
			enviaCortina();
		}
		// System.out.println("teste");
		else if (e.getActionCommand().equals("Sair")) {
			System.exit(0);
		}
	}
}
