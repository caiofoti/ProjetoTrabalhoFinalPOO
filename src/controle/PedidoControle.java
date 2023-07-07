package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import dao.IncendioDAO;
import dao.PedidosDAO;
import modelo.Incendio;
import modelo.Login;
import modelo.Pedidos;
import visao.JanelaPrincipal;

public class PedidoControle implements ActionListener {
	private Pedidos ped;
	private JanelaPrincipal jan;
	private PedidosDAO peddao;
	private Incendio inc;
	private IncendioDAO incdao;
	private Login l;
	private Icon certo = new ImageIcon(getClass().getResource("/figuras/comentar-alt-check.png"));
	private Icon falha = new ImageIcon(getClass().getResource("/figuras/exclamacao.png"));

	public PedidoControle(JanelaPrincipal jan, Pedidos p, Incendio inc, Login log) {
		this.jan = jan;
		this.ped = p;
		this.inc = inc;
		l = log;
		peddao = new PedidosDAO();
		registraListeners();
	}

	public void registraListeners() {
		jan.getTp().getButtonConsultar().addActionListener(this);
		jan.getTp().getButtonRemover().addActionListener(this);
	
	}

	public void consultaPedido() {

		if (jan.getTp().getComboTipo().getSelectedItem().toString() == "Pedidos cortinas") {
			ped.setUsuario(l.getUsuario());
			ped.setID(jan.getTp().getFieldID().getText());

			if (peddao.consultaCortina(ped)) {
				JOptionPane.showMessageDialog(jan.getContentPane(), "Pedido encontrado!", "Consultar pedidos",JOptionPane.INFORMATION_MESSAGE, certo);
				jan.getTp().getAreaConsulta().append(peddao.getConsulta());

			} else {
				JOptionPane.showMessageDialog(jan.getContentPane(), "Falha ao encontrar pedido!", "Consultar pedidos", JOptionPane.INFORMATION_MESSAGE, falha);
			}

		} else if (jan.getTp().getComboTipo().getSelectedItem().toString() == "Pedidos incêndio") {
		
			ped.setID(jan.getTp().getFieldID().getText());
			if (peddao.consultaIncendio(ped)) {
				JOptionPane.showMessageDialog(jan.getContentPane(), "Pedido encontrado!", "Consultar pedidos",JOptionPane.INFORMATION_MESSAGE, certo);
				jan.getTp().getAreaConsulta().append(peddao.getConsulta());
			} else {
				JOptionPane.showMessageDialog(jan.getContentPane(), "Falha ao encontrar pedido!", "Consultar pedidos", JOptionPane.INFORMATION_MESSAGE, falha);
			}

		} else if (jan.getTp().getComboTipo().getSelectedItem().toString() == "Pedidos EPIS") {
		
			ped.setID(jan.getTp().getFieldID().getText());

			if (peddao.consultaEpi(ped)) {
				JOptionPane.showMessageDialog(jan.getContentPane(), "Pedido encontrado!", "Consultar pedidos",JOptionPane.INFORMATION_MESSAGE, certo);
				jan.getTp().getAreaConsulta().append(peddao.getConsulta());
			} else {
				JOptionPane.showMessageDialog(jan.getContentPane(), "Falha ao encontrar pedido!", "Consultar pedidos", JOptionPane.INFORMATION_MESSAGE, falha);
			}

		}

	}

	public void removePedido() {

		if (jan.getTp().getComboTipo().getSelectedItem().toString() == "Pedidos cortinas") { 	// Verifica o item
																								// selecionado do
																								// JComboBox para
																								// realizar a remoção
			ped.setID(jan.getTp().getFieldID().getText());
			ped.setUsuario(l.getUsuario());

			if (peddao.removeCortina(ped)) { // Se a consulta retorna true o pedido é removido
				JOptionPane.showMessageDialog(jan.getContentPane(), "Pedido removido!", "Remover pedidos", JOptionPane.INFORMATION_MESSAGE, certo);
				limpaTela();
			} else { // Se a consulta retorna false o pedido não é removido pois pertence a outro
						// usuário
				JOptionPane.showMessageDialog(jan.getContentPane(),"Erro ao remover o pedido! \nID do pedido pertence a outro usuário.", "Remover pedidos", JOptionPane.ERROR_MESSAGE, falha);
			}

		} else if (jan.getTp().getComboTipo().getSelectedItem().toString() == "Pedidos incêndio") {
			ped.setID(jan.getTp().getFieldID().getText());
			ped.setUsuario(l.getUsuario());

			if (peddao.removeIncendio(ped)) {
				JOptionPane.showMessageDialog(jan.getContentPane(), "Pedido removido!", "Remover pedidos", JOptionPane.INFORMATION_MESSAGE, certo);
				limpaTela();
			} else {
				JOptionPane.showMessageDialog(jan.getContentPane(),"Erro ao remover o pedido! \nID do pedido pertence a outro usuário.", "Remover pedidos", JOptionPane.ERROR_MESSAGE, falha);
			}

		} else if (jan.getTp().getComboTipo().getSelectedItem().toString() == "Pedidos EPIS") {
			ped.setID(jan.getTp().getFieldID().getText());
			ped.setUsuario(l.getUsuario());

			if (peddao.removeEPIS(ped)) {
				JOptionPane.showMessageDialog(jan.getContentPane(), "Pedido removido!", "Remover pedidos", JOptionPane.INFORMATION_MESSAGE, certo);
				limpaTela();
			} else {
				JOptionPane.showMessageDialog(jan.getContentPane(),"Erro ao remover o pedido! \nID do pedido pertence a outro usuário.", "Remover pedidos", JOptionPane.ERROR_MESSAGE, falha);
			}

		}
	}
	
	
	
	
	
	public void limpaTela() {
		jan.getTp().getComboTipo().setSelectedIndex(0);
		jan.getTp().getFieldID().setText(null);
		jan.getTp().getAreaConsulta().setText(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Consultar")) {
			consultaPedido();
		} else if (e.getActionCommand().equals("Remover")) {
			removePedido();
		}

	}

}
