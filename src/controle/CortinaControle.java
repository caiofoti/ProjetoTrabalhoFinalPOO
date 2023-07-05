package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.CortinaDAO;
import modelo.Cortina;
import visao.JanelaPrincipal;

public class CortinaControle implements ActionListener {

	private Cortina cor;
	private JanelaPrincipal jan;
	private CortinaDAO cordao;

	public CortinaControle(JanelaPrincipal j, Cortina cortina) {
		jan = j;
		cor = cortina;
		cordao = new CortinaDAO();
		registraListeners();
	}

	public void registraListeners() {
		jan.getTc().getButtonEnviar().addActionListener(this);
		jan.getTc().getButtonCancelar().addActionListener(this);
	}

	public void enviarCortina() {
		cor.setEmail(jan.getTc().getFieldEmail().getText());
		cor.setSub(jan.getTc().getButtonGroup().getSelection().getActionCommand());
		cor.setJust(jan.getTc().getAreaJust().getText());
		cor.setLocal(jan.getTc().getFieldLocal().getText());
		cor.setTel(jan.getTc().getFieldTel().getText());
		cor.setResp(jan.getTc().getFieldResp().getText());

		if (cordao.cadastraCortina(cor)) {
			System.out.println("Solicitação enviada!");
			JOptionPane.showMessageDialog(jan.getContentPane(), "Solicitação enviada!");
		} else {
			JOptionPane.showMessageDialog(jan.getContentPane(), "Falha ao enviar!");
		}

	}

	public void limpaTela() {
		jan.getTc().getFieldEmail().setText(null);
		jan.getTc().getFieldLocal().setText(null);
		jan.getTc().getFieldResp().setText(null);
		jan.getTc().getFieldTel().setText(null);
		jan.getTc().getButtonGroup().setSelected(null, false);
		jan.getTc().getAreaJust().setText(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Enviar")) {
			enviarCortina();
		}
	}

}
