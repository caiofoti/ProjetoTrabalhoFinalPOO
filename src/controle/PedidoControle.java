package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JOptionPane;

import dao.PedidosDAO;
import modelo.Pedidos;
import visao.JanelaPrincipal;

public class PedidoControle implements ActionListener{
	private Pedidos ped;
	private JanelaPrincipal jan;
	private PedidosDAO peddao;
	
	
	public PedidoControle(JanelaPrincipal jan, Pedidos p)
	{
		this.jan=jan;
		this.ped=p;
		peddao = new PedidosDAO();
		registraListeners();
	}
	
	
	public void registraListeners() {
		jan.getTp().getButtonConsultar().addActionListener(this);
		jan.getTp().getButtonRemover().addActionListener(this);
	}

	public void consultaPedido() {
		ped.setID(jan.getTp().getFieldID().getText());
		
		peddao.consultaPedido(ped);
		
		jan.getTp().getAreaConsulta().append(peddao.getLinha());
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Consultar")) {
			consultaPedido();
		}
		
	}
	
}
