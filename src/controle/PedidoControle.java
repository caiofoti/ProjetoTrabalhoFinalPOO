package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JOptionPane;

import dao.IncendioDAO;
import dao.PedidosDAO;
import modelo.Incendio;
import modelo.Pedidos;
import visao.JanelaPrincipal;

public class PedidoControle implements ActionListener {
	private Pedidos ped;
	private JanelaPrincipal jan;
	private PedidosDAO peddao;
	private Incendio inc;
	private IncendioDAO incdao;

	public PedidoControle(JanelaPrincipal jan, Pedidos p, Incendio inc) {
		this.jan = jan;
		this.ped = p;
		this.inc = inc;
		peddao = new PedidosDAO();
		registraListeners();
	}

	public void registraListeners() {
		jan.getTp().getButtonConsultar().addActionListener(this);
		jan.getTp().getButtonRemover().addActionListener(this);
	}

	public void consultaPedido() {

		if (jan.getTp().getComboTipo().getSelectedItem().toString() == "Pedidos cortinas") {
			ped.setID(jan.getTp().getFieldID().getText());
			peddao.consultaCortina(ped);
			JOptionPane.showMessageDialog(jan.getContentPane(), "Pedido encontrado!");
			jan.getTp().getAreaConsulta().append(peddao.getConsulta());

		} else if (jan.getTp().getComboTipo().getSelectedItem().toString() == "Pedidos incêndio") {
			ped.setID(jan.getTp().getFieldID().getText());
			peddao.consultaIncendio(ped);
			JOptionPane.showMessageDialog(jan.getContentPane(), "Pedido encontrado!");
			jan.getTp().getAreaConsulta().append(peddao.getConsulta());
		}

	}

	public void removePedido() {
		if (jan.getTp().getComboTipo().getSelectedItem().toString() == "Pedidos cortinas") {
			ped.setID(jan.getTp().getFieldID().getText());
			peddao.removeCortina(ped);
			JOptionPane.showMessageDialog(jan.getContentPane(), "Pedido removido!");
		} else if (jan.getTp().getComboTipo().getSelectedItem().toString() == "Pedidos incêndio") {
			ped.setID(jan.getTp().getFieldID().getText());
			peddao.removeIncendio(ped);
			JOptionPane.showMessageDialog(jan.getContentPane(), "Pedido removido!");
		}
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
