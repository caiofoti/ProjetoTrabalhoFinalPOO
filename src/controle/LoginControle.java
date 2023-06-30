package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.LoginDAO;
import modelo.Login;
import visao.JanelaPrincipal;

public class LoginControle implements ActionListener {

	private Login log;
	private JanelaPrincipal jan;
	private LoginDAO ldao;


	public LoginControle(JanelaPrincipal j, Login l) {
		jan = j;
		log = l;
		ldao = new LoginDAO();
		registraListeners();
	}

	public void registraListeners() {
		jan.getTa().getButtonCancelar().addActionListener(this);
		jan.getItemSair().addActionListener(this);
		jan.getTa().getButtonAutenticar().addActionListener(this);
		jan.getItemSair().addActionListener(this);
	}

	public void autenticar() {
		if (!log.validaUsuario(jan.getTa().getFieldUsuario().getText())) {
			JOptionPane.showMessageDialog(jan.getContentPane(), "Informe 10 caracteres no máximo!");
		} else {
			log.setUsuario(jan.getTa().getFieldUsuario().getText());
			log.setSenha(String.valueOf(jan.getTa().getFieldSenha().getPassword()));

			if (ldao.autenticaUsuario(log)) {

				System.out.println("Usuario encontrado!");
				JOptionPane.showMessageDialog(jan.getContentPane(), "Usuário encontrado!");
				jan.getMenuEngenharia().setEnabled(true);
			} else {
				JOptionPane.showMessageDialog(jan.getContentPane(), "Falha na autenticação!");

			}
		}
	}

	public void sair() {

		int resp = JOptionPane.showConfirmDialog(jan.getContentPane(), "Realmente deseja sair?");
		if (resp == 0)
			jan.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Autentica")) {
			autenticar();
		}
		else if (e.getActionCommand().equals("Sair")) {
			sair();
		}
		
	}

}
