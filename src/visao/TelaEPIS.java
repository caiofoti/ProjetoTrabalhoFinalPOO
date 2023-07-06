package visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.UIManager;

public class TelaEPIS extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField fieldTel;
	private JButton buttonEnviar;
	private JButton buttonCancelar;
	private JTextArea areaJust;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JCheckBox luvaSegBor;
	private JCheckBox luvaSegPro;
	private JCheckBox luvaVaq;

	/**
	 * Create the panel.
	 */
	public TelaEPIS() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBounds(100, 100, 665, 658);
		setLayout(new MigLayout("", "[grow]", "[grow]"));

		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, "cell 0 0,grow");

		Label labelHeader = new Label("ENGENHARIA - EPI's");
		labelHeader.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		labelHeader.setBackground(Color.WHITE);
		labelHeader.setAlignment(Label.CENTER);
		scrollPane.setColumnHeaderView(labelHeader);

		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new MigLayout("", "[grow]", "[][10px][][][][][10px][][10px][][10px][][][][][][][][][][][][][][][][][][][][][15px][][][][][][15px][][][][80px][15px][][][20px][]"));

		JLabel labelFoto = new JLabel();
		labelFoto.setIcon(new ImageIcon("ProjetoTrabalhoFinalPOO\\src\\TelaPedidos4.png"));
		panel.add(labelFoto, "cell 0 0");

		JLabel labelServiços = new JLabel("Serviço:");
		labelServiços.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(labelServiços, "flowx,cell 0 2");

		JLabel labelSetor = new JLabel("Setor encarregado: ");
		labelSetor.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(labelSetor, "flowx,cell 0 3");

		JLabel labelSolic = new JLabel("Quem pode solicitar:");
		labelSolic.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(labelSolic, "flowx,cell 0 4");

		JLabel labelAtende = new JLabel("Geralmente atende em:");
		labelAtende.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(labelAtende, "flowx,cell 0 5");

		JLabel labelTextoServico = new JLabel("Solicitação de EPI");
		labelTextoServico.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(labelTextoServico, "cell 0 2");

		JLabel labelTextoEngenharia = new JLabel("Engenharia - Divisão de Arquitetura");
		labelTextoEngenharia.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(labelTextoEngenharia, "cell 0 3");

		JLabel labelAsterico = new JLabel("Até 2 dias");
		labelAsterico.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(labelAsterico, "cell 0 5");

		Label labelDados = new Label("Selecione o EPI");
		labelDados.setForeground(Color.WHITE);
		labelDados.setFont(new Font("Arial Black", Font.BOLD, 16));
		labelDados.setBackground(new Color(51, 51, 102));
		labelDados.setAlignment(Label.CENTER);
		panel.add(labelDados, "cell 0 7,grow");

		JLabel Substituição = new JLabel("Lista EPI's");
		Substituição.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(Substituição, "flowx,cell 0 9");

		JLabel labelAsterisco1 = new JLabel("*");
		labelAsterisco1.setForeground(Color.RED);
		labelAsterisco1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(labelAsterisco1, "cell 0 9");
		
		
// ### DECLARAÇÕES
		
		 luvaSegBor = new JCheckBox("Luvas de segurança confeccionada em borracha nitrílica");
		panel.add(luvaSegBor, "cell 0 10");
		 luvaSegPro = new JCheckBox("Luvas de segurança para procedimentos não cirúrgicos");
		panel.add(luvaSegPro, "cell 0 11");
		 luvaVaq = new JCheckBox("Luvas de vaqueta - Raspas de couro (item em falta)");
		panel.add(luvaVaq, "cell 0 12");
		JCheckBox luvaSegTemp = new JCheckBox("Luvas de segurança para alta temperatura (pedido de reposição do EPI somente mediante a devolução do EPI usado)");
		panel.add(luvaSegTemp, "cell 0 13");
		JCheckBox luvaSegCong = new JCheckBox("Luvas de segurança para peças ou produtos congelados");
		panel.add(luvaSegCong, "cell 0 14");
		JCheckBox mangaSeg = new JCheckBox("Manga de segurança");
		panel.add(mangaSeg, "cell 0 15");
		JCheckBox aventalTNT = new JCheckBox("Avental confeccionado em TNT");
		panel.add(aventalTNT, "cell 0 16");
		JCheckBox cartQuimGA = new JCheckBox("Cartucho Químico GA/VO, com baioneta");
		panel.add(cartQuimGA, "cell 0 17");
		JCheckBox cartQuimForm = new JCheckBox("Cartucho Químico Formaldeído, com baioneta");
		panel.add(cartQuimForm, "cell 0 18");
		JCheckBox respSemiManu = new JCheckBox("Respirador Semi facial com manutenção");
		panel.add(respSemiManu, "cell 0 19");
		JCheckBox respPuri = new JCheckBox("Respirador purificador de ar tipo peça facial inteira");
		panel.add(respPuri, "cell 0 20");
		JCheckBox mascTripla = new JCheckBox("Máscara cirúrgica de tripla camada");
		panel.add(mascTripla, "cell 0 21");
		JCheckBox respSemiPPF2 = new JCheckBox("Respirador semi-facial PPF2 (Máscara PFF2)");
		panel.add(respSemiPPF2, "cell 0 22");
		JCheckBox protAudTrad = new JCheckBox("Protetor Auditivo Tradicional, tipo Concha, dobrável");
		panel.add(protAudTrad, "cell 0 23");
		JCheckBox prodAuri = new JCheckBox("Protetor Auricular de Silicone tipo plug");
		panel.add(prodAuri, "cell 0 24");
		JCheckBox sapatDesc = new JCheckBox("Sapatilha descartável (Propé)");
		panel.add(sapatDesc, "cell 0 25");
		JCheckBox toucaDesc = new JCheckBox("Touca descartável branca");
		panel.add(toucaDesc, "cell 0 26");
		JCheckBox oculosSegPoli = new JCheckBox("Óculos de Segurança em policarbonato");
		panel.add(oculosSegPoli, "cell 0 27");
		JCheckBox oculosSegAmp = new JCheckBox("Óculos de Segurança ampla visão");
		panel.add(oculosSegAmp, "cell 0 28");
		JCheckBox escudoProt = new JCheckBox("Escudo de proteção facial");
		panel.add(escudoProt, "cell 0 29");

		Label labelDados_1 = new Label("Contato");
		labelDados_1.setForeground(Color.WHITE);
		labelDados_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		labelDados_1.setBackground(new Color(51, 51, 102));
		labelDados_1.setAlignment(Label.CENTER);
		panel.add(labelDados_1, "cell 0 31,growx");

		JLabel Ramal_Telef_1 = new JLabel("Matricula do Requesitante");
		Ramal_Telef_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(Ramal_Telef_1, "flowx,cell 0 32");

		textField = new JTextField();
		textField.setColumns(10);
		panel.add(textField, "cell 0 33,growx");

		JLabel Ramal_Telef_1_1 = new JLabel("Função");
		Ramal_Telef_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(Ramal_Telef_1_1, "flowx,cell 0 34");

		JComboBox comboBox = new JComboBox();
		panel.add(comboBox, "cell 0 35,growx");

		JLabel labelOutros = new JLabel("Outros");
		labelOutros.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(labelOutros, "flowx,cell 0 36");

		JCheckBox checkBoxOutros = new JCheckBox("Outros");
		panel.add(checkBoxOutros, "cell 0 37");

		JTextArea textAreaOutros = new JTextArea();
		textAreaOutros.setLineWrap(true);
		JScrollPane scrollPane_1 = new JScrollPane(textAreaOutros);
		scrollPane_1.setPreferredSize(new Dimension(300, 100));
		scrollPane_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(scrollPane_1, "cell 0 38");

		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "cell 0 39,grow");
		panel_1.setLayout(new MigLayout("", "[grow][grow]", "[]"));

		buttonEnviar = new JButton("Enviar");
		panel_1.add(buttonEnviar, "cell 0 0,grow");

		buttonCancelar = new JButton("Cancelar");
		panel_1.add(buttonCancelar, "cell 1 0,grow");
	}
	
	// ########### GETTERS E SETTERS
	

	public JTextArea getAreaJust() {
		return areaJust;
	}

	public void setAreaJust(JTextArea areaJust) {
		this.areaJust = areaJust;
	}
		
	
	public JTextField getFieldTel() {
		return fieldTel;
	}

	public void setFieldTel(JTextField fieldTel) {
		this.fieldTel = fieldTel;
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

	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}


	
	}
