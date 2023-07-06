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
		cor.setJust(jan.getTc().getAreaJust().getText());
		cor.setLocal(jan.getTc().getFieldLocal().getText());
		cor.setTel(jan.getTc().getFieldTel().getText());
		cor.setResp(jan.getTc().getFieldResp().getText());

		if (jan.getTc().getButtonGroup().getSelection() == null) { // Verifica se o buttonGroup retorna NULL
			cor.setSub(""); // Se retorna NULL é setado como uma string vazia para utilizar método isEmpty() 
		} else {
			cor.setSub(jan.getTc().getButtonGroup().getSelection().getActionCommand()); //Se retorna seleção seta a String da classe cortina
		}

		if (cor.verficaCampo()) { // Se verificaCampo() retorna TRUE existem campos vazios!
			JOptionPane.showMessageDialog(jan.getContentPane(), "Preencha todos  campos obrigatórios!");
		} else if (cordao.cadastraCortina(cor)) {
			System.out.println("Solicitação enviada!");
			JOptionPane.showMessageDialog(jan.getContentPane(), "Solicitação enviada! ID do pedido: "+ cor.getID());
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
