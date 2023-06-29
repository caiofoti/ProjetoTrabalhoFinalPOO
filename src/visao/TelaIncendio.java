package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

public class TelaIncendio extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField fieldLocal;
	private JTextField fieldContato;
	private JButton buttonEnviar;
	private JButton buttonCancelar;
	private JTextArea obsArea;
	private JTextArea irregArea;
	private JComboBox<String> comboSist;
	/**
	 * Create the panel.
	 */
	public TelaIncendio() {
		setBounds(100, 100, 665, 658);
		setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, "cell 0 0,grow");
		
		Label labelHeader = new Label("ENGENHARIA - MANUNTENÇÃO E SISTEMA DE INCÊNDIO");
		labelHeader.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		labelHeader.setBackground(Color.WHITE);
		labelHeader.setAlignment(Label.CENTER);
		scrollPane.setColumnHeaderView(labelHeader);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new MigLayout("", "[636.00,grow]", "[][][][][][][][][][][][][][80px][][][][][][][][][][][][][][80px,grow][][]"));
		
		JLabel labelFoto = new JLabel("");
		labelFoto.setIcon(new ImageIcon("ProjetoTrabalhoFinalPOO\\src\\TelaPedidos4.png"));
		panel.add(labelFoto, "cell 0 0,grow");
		
		JLabel labelServico = new JLabel("Serviço:");
		labelServico.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(labelServico, "cell 0 2");
		
		JLabel labelSetorEncarregado = new JLabel("Setor encarregado: ");
		labelSetorEncarregado.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(labelSetorEncarregado, "cell 0 3");
		
		JLabel labelSolic = new JLabel("Quem pode solicitar:");
		labelSolic.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(labelSolic, "cell 0 4");
		
		JLabel labelAtende = new JLabel("Geralmente atende em:");
		labelAtende.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(labelAtende, "cell 0 5");
		
		JLabel labelTexto1 = new JLabel("<html>O prazo para atendimento será contado da data de disponibilização do formulário à empresa contratada de acordo com sua classificação: chamado urgente (2 horas em dias úteis ou 4 horas nos demais dias não úteis) chamado normal (48 horas em dias úteis ou 72 horas nos demais dias não úteis.</html>");
		labelTexto1.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(labelTexto1, "cell 0 6");
		
		JLabel labelTexto2 = new JLabel("<html>Caso o preenchimento da ficha de atendimento seja realizado posterior ao horário máximo permitido acima, poderá ser aplicado o instrumento de medição de resultados previsto no anexo A do Termo de Referência (TR), bem como as sanções previstas no item 19 do TR.</html>");
		labelTexto2.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(labelTexto2, "cell 0 7");
		
		Label labelDados = new Label("Dados de Solicitação");
		labelDados.setForeground(Color.WHITE);
		labelDados.setFont(new Font("Arial Black", Font.BOLD, 16));
		labelDados.setBackground(new Color(51, 51, 102));
		labelDados.setAlignment(Label.CENTER);
		panel.add(labelDados, "cell 0 9,grow");
		
		JLabel labelIrregularidade = new JLabel("Descreva a irregularidade");
		labelIrregularidade.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(labelIrregularidade, "flowx,cell 0 11");
		
		JLabel labelDetalhesIrregularidade = new JLabel("Inserir com o máximo de detalhes possível, qual a irregularidade identificada");
		labelDetalhesIrregularidade.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(labelDetalhesIrregularidade, "cell 0 12");
		
		irregArea = new JTextArea();
		irregArea.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Descri\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(irregArea, "cell 0 13,grow");
		
		JLabel labelAsterisco = new JLabel("*");
		labelAsterisco.setForeground(Color.RED);
		labelAsterisco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(labelAsterisco, "cell 0 11");
		
		JLabel LabelSist = new JLabel("Sistema");
		LabelSist.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(LabelSist, "flowx,cell 0 15");
		
		JLabel labelAsterisco1 = new JLabel("*");
		labelAsterisco1.setForeground(Color.RED);
		labelAsterisco1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(labelAsterisco1, "cell 0 15");
		
		comboSist = new JComboBox<String>();
		comboSist.setForeground(Color.DARK_GRAY);
		comboSist.setFont(new Font("Arial", Font.PLAIN, 11));
		comboSist.setBackground(Color.WHITE);
		panel.add(comboSist, "cell 0 16,alignx left");
		comboSist.addItem("");
		comboSist.addItem("MANUTENÇÃO DOS SISTEMAS DE INCÊNDIO");
		comboSist.addItem("Alarmes");
		comboSist.addItem("Componentes SPK");
		comboSist.addItem("Componente dos Hidrantes");
		comboSist.addItem("Iluminação de Emergência e Balizamento");
		comboSist.addItem("Portas Corta Fogo");
		comboSist.addItem("Sistema de pressurização da escada do P2");

		
		JLabel labelLocal = new JLabel("Local");
		labelLocal.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(labelLocal, "flowx,cell 0 18");
		
		JLabel labelAsterisco2 = new JLabel("*");
		labelAsterisco2.setForeground(Color.RED);
		labelAsterisco2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(labelAsterisco2, "cell 0 18");
		
		JLabel labelDetalhesLocal = new JLabel("Prédio/andar ou ponto de referência");
		labelDetalhesLocal.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(labelDetalhesLocal, "cell 0 19");
		
		fieldLocal = new JTextField();
		fieldLocal.setColumns(10);
		panel.add(fieldLocal, "cell 0 20,growx");
		
		JLabel labelFoneContato = new JLabel("Fone de contato");
		labelFoneContato.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(labelFoneContato, "flowx,cell 0 22");
		
		fieldContato = new JTextField();
		fieldContato.setColumns(10);
		panel.add(fieldContato, "cell 0 23,growx");
		
		JLabel labelAsterisco3 = new JLabel("*");
		labelAsterisco3.setForeground(Color.RED);
		labelAsterisco3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(labelAsterisco3, "cell 0 22");
		
		JLabel LabelObserv = new JLabel("Observações");
		LabelObserv.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(LabelObserv, "cell 0 25");
		
		JLabel LabelObservDetalhes = new JLabel("<html>Relatar se a irregularidade está causando danos ao patrimônio ou pode causar risco à comunidade, bem como inserir demais informações relevantes como, por exemplo, se haverá algum evento no local<html>");
		LabelObservDetalhes.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(LabelObservDetalhes, "cell 0 26");
		
		 obsArea = new JTextArea();
		obsArea.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Obs", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(obsArea, "cell 0 27,grow");
		
		 buttonEnviar = new JButton("Envio");
		buttonEnviar.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(buttonEnviar, "flowx,cell 0 29,alignx center,aligny center");
		
		 buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(buttonCancelar, "cell 0 29,alignx center,aligny center");
		buttonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 if(e.getActionCommand().equals("Cancelar"))
					fieldContato.setText(null);
					fieldLocal.setText(null);
					obsArea.setText(null);
					irregArea.setText(null);
					comboSist.setSelectedItem("");
			}});

			

	}
	
	public JTextField getFieldLocal() {
		return fieldLocal;
	}

	public void setFieldLocal(JTextField fieldLocal) {
		this.fieldLocal = fieldLocal;
	}

	public JTextField getFieldContato() {
		return fieldContato;
	}

	public void setFieldContato(JTextField fieldContato) {
		this.fieldContato = fieldContato;
	}

	public JButton getButtonEnviar() {
		return buttonEnviar;
	}

	public void setButtonEnviar(JButton buttonEnviar) {
		this.buttonEnviar = buttonEnviar;
	}

	public JButton getButtonCancelar() {
		return buttonCancelar;
	}

	public void setButtonCancelar(JButton buttonCancelar) {
		this.buttonCancelar = buttonCancelar;
	}

	public JTextArea getObsArea() {
		return obsArea;
	}

	public void setObsArea(JTextArea obsArea) {
		this.obsArea = obsArea;
	}

	public JTextArea getIrregArea() {
		return irregArea;
	}

	public void setIrregArea(JTextArea irregArea) {
		this.irregArea = irregArea;		
	}
	
	public JComboBox<String> getComboSist() {
		return comboSist;
	}

	public void setComboSist(JComboBox<String> comboSist) {
		this.comboSist = comboSist;
	}
	
	
	
	


}
