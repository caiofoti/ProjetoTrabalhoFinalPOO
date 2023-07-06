package visao;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Label;
import java.awt.Color;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;

public class TelaPedidosInternos extends JPanel {
	private JTextField fieldID;
	private JButton buttonConsultar;
	private JButton buttonRemover;
	private JTextArea areaConsulta;

	/**
	 * Create the panel.
	 */
	public TelaPedidosInternos() {
		setLayout(new MigLayout("", "[638.00px,grow][638.00px,grow][][638.00px][2px]", "[][30px][20px][][][grow][]"));
		
		JLabel ImagemPedidosInternos = new JLabel("");
		ImagemPedidosInternos.setIcon(new ImageIcon(TelaPedidosInternos.class.getResource("/figuras/TelaPedidos4.png")));
		add(ImagemPedidosInternos, "cell 0 0 4 1,alignx center");
		
		Label labelHeader = new Label("ENGENHARIA - PEDIDOS INTERNOS");
		labelHeader.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		labelHeader.setBackground(Color.WHITE);
		labelHeader.setAlignment(Label.CENTER);
		add(labelHeader, "cell 0 1 4 1,alignx center,aligny top");
		
		JLabel labelPedido = new JLabel("Digite o ID do pedido:");
		add(labelPedido, "flowx,cell 0 3 2 1");
		
		fieldID = new JTextField();
		add(fieldID, "cell 0 3,alignx left,aligny center");
		fieldID.setColumns(20);
		
		JLabel labelConsulta = new JLabel("Consulta:");
		add(labelConsulta, "cell 0 4 2 1");
		
		buttonConsultar = new JButton("Consultar");
		add(buttonConsultar, "flowx,cell 3 3,alignx left,aligny center");
		
		buttonRemover = new JButton("Remover");
		add(buttonRemover, "cell 3 3 2 1,alignx right");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPane, "cell 0 5 4 1,grow");
		
		areaConsulta = new JTextArea();
		areaConsulta.setLineWrap(true);
		areaConsulta.setWrapStyleWord(true);
		scrollPane.setViewportView(areaConsulta);

	}

	// ########### GETTERS E SETTERS
	
	public JTextField getFieldID() {
		return fieldID;
	}

	public void setFieldID(JTextField fieldID) {
		this.fieldID = fieldID;
	}

	public JButton getButtonConsultar() {
		return buttonConsultar;
	}

	public void setButtonConsultar(JButton buttonConsultar) {
		this.buttonConsultar = buttonConsultar;
	}

	public JButton getButtonRemover() {
		return buttonRemover;
	}

	public void setButtonRemover(JButton buttonRemover) {
		this.buttonRemover = buttonRemover;
	}

	public JTextArea getAreaConsulta() {
		return areaConsulta;
	}

	public void setAreaConsulta(JTextArea areaConsulta) {
		this.areaConsulta = areaConsulta;
	}
	
	

}
