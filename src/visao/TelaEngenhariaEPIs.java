package visao;

import javax.swing.JPanel;
import java.awt.Dimension;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import java.awt.Label;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;

public class TelaEngenhariaEPIs extends JPanel {

<<<<<<< HEAD
	/**
	 * 
	 */
=======

>>>>>>> 0d5f001a811c9b35adbe6304206181fcdf755a28
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public TelaEngenhariaEPIs() {
		setPreferredSize(new Dimension(665, 658));
		setLayout(new MigLayout("", "[665px]", "[658px]"));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPane, "cell 0 0,grow");
		
		Label label = new Label("ENGENHARIA - EPI`s");
		label.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		label.setBackground(Color.WHITE);
		label.setAlignment(Label.CENTER);
		scrollPane.setColumnHeaderView(label);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new MigLayout("", "[612.00,grow][][][]", "[][grow][][][][][][][][][][][][][][][][][][][][][13.00][][grow][][][][][grow][][][][][][][grow][][][][][]"));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("/ProjetoTrabalhoFinalPOO/TelaPedidos4.jpg"));
		panel.add(lblNewLabel_3, "cell 0 0");
		
		JPanel panel_2 = new JPanel();
		panel_2.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(panel_2, "cell 0 1 1 4,grow");
		panel_2.setLayout(new MigLayout("", "[46px][][46px]", "[21.00px][15.00][26.00][][22.00][19.00][]"));
		
		JLabel lblNewLabel_4 = new JLabel("Serviço:");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2.add(lblNewLabel_4, "flowx,cell 0 0,alignx left,aligny top");
		
		JLabel lblNewLabel_6 = new JLabel("Setor encarregado:");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2.add(lblNewLabel_6, "flowx,cell 0 1");
		
		JLabel lblNewLabel_8 = new JLabel("Quem pode solicitar:");
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2.add(lblNewLabel_8, "flowx,cell 0 2");
		
		JLabel lblNewLabel_16 = new JLabel("e Bolsistas de apoio técnico ao desenvolvimento institucional ou de apoio à pesquisa (via responsável direto).");
		panel_2.add(lblNewLabel_16, "cell 0 3");
		
		JLabel lblNewLabel_9 = new JLabel("Atenção");
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2.add(lblNewLabel_9, "flowx,cell 0 4");
		
		JLabel lblNewLabel_11 = new JLabel("Geralmente atende em:");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2.add(lblNewLabel_11, "flowx,cell 0 5");
		
		JLabel lblNewLabel_13 = new JLabel("Catálogo de EPI's");
		lblNewLabel_13.setForeground(new Color(0, 0, 102));
		lblNewLabel_13.setFont(new Font("Arial", Font.BOLD, 10));
		panel_2.add(lblNewLabel_13, "cell 0 6");
		
		JLabel lblNewLabel_5 = new JLabel("Solicitação de EPI");
		panel_2.add(lblNewLabel_5, "cell 0 0,alignx left,aligny top");
		
		JLabel lblNewLabel_7 = new JLabel("Engenharia");
		panel_2.add(lblNewLabel_7, "cell 0 1");
		
		JLabel lblNewLabel_10 = new JLabel("A solicitação do EPI é pessoal, não podendo ser delegada a outra pessoa");
		panel_2.add(lblNewLabel_10, "cell 0 4");
		
		JLabel lblNewLabel_12 = new JLabel("até 2 dias");
		panel_2.add(lblNewLabel_12, "cell 0 5");
		
		JLabel lblNewLabel_14 = new JLabel("Servidores Docentes/Servidores Técnicos-Administrativos");
		panel_2.add(lblNewLabel_14, "cell 0 2");
		
		JLabel lblNewLabel_15 = new JLabel("/ Estagiários da UFCSPA (vinculados ao DAP)");
		panel_2.add(lblNewLabel_15, "cell 0 2");
		
		Label label_1 = new Label("Selecione o EPI");
		label_1.setAlignment(Label.CENTER);
		label_1.setBackground(new Color(51, 51, 102));
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		panel.add(label_1, "cell 0 5,alignx center,grow");
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Lista de EPI´s");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1, "flowx,cell 0 6");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Luvas de segurança confeccionada em borracha nitrílica");
		chckbxNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 10));
		chckbxNewCheckBox.setForeground(new Color(0, 0, 0));
		chckbxNewCheckBox.setBackground(new Color(240, 240, 240));
		panel.add(chckbxNewCheckBox, "cell 0 7");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Luvas de segurança para procedimentos não cirúrgicos");
		chckbxNewCheckBox_1.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_1, "cell 0 8");
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Luvas de segurança, com dedos e polegar em raspa natural");
		chckbxNewCheckBox_2.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_2, "cell 0 9");
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Luvas de segurança para alta temperatura (pedido de reposição do EPI somente mediante a devolução do EPI usado)");
		chckbxNewCheckBox_3.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_3, "cell 0 10");
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox(" Luvas de segurança para peças ou produtos congelados");
		chckbxNewCheckBox_4.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_4, "cell 0 11");
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Manga de segurança");
		chckbxNewCheckBox_5.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_5, "cell 0 12");
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Avental confeccionado em TNT");
		chckbxNewCheckBox_6.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_6, "cell 0 13");
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Cartucho Químico GA/VO, com baioneta");
		chckbxNewCheckBox_7.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_7, "flowy,cell 0 14");
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Respirador Semi facial com manutenção");
		chckbxNewCheckBox_9.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_9, "cell 0 15");
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("Respirador purificador de ar tipo peça facial inteira");
		chckbxNewCheckBox_10.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_10, "flowy,cell 0 16");
		
		JCheckBox chckbxNewCheckBox_13 = new JCheckBox("Protetor Auditivo Tradicional, tipo Concha, dobrável");
		chckbxNewCheckBox_13.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_13, "cell 0 17");
		
		JCheckBox chckbxNewCheckBox_14 = new JCheckBox("Protetor Auricular de Silicone tipo plug");
		chckbxNewCheckBox_14.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_14, "cell 0 18");
		
		JCheckBox chckbxNewCheckBox_15 = new JCheckBox("Sapatilha descartável (Propé)");
		chckbxNewCheckBox_15.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_15, "flowy,cell 0 19");
		
		JCheckBox chckbxNewCheckBox_17 = new JCheckBox("Óculos de Segurança em policarbonato");
		chckbxNewCheckBox_17.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_17, "flowy,cell 0 20");
		
		Label label_1_1 = new Label("Contato\r\n");
		label_1_1.setForeground(Color.WHITE);
		label_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		label_1_1.setBackground(new Color(51, 51, 102));
		label_1_1.setAlignment(Label.CENTER);
		panel.add(label_1_1, "cell 0 21,alignx center,grow");
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Matrícula do requisitante");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1, "flowx,cell 0 23");
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(SystemColor.menu);
		panel.add(panel_1_2, "cell 0 24,grow");
		panel_1_2.setLayout(new MigLayout("", "[530px]", "[20px]"));
		
		textField = new JTextField();
		panel_1_2.add(textField, "cell 0 0,growx,aligny top");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Função");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1, "flowx,cell 0 25");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"----------", "Docentes", "Técnico de Laboratório", "Técnico Administrativo", "Bolsista", "Estagiários da UFCSPA(vinculados ao DAP)"}));
		panel.add(comboBox, "flowx,cell 0 26,alignx left");
		
		JLabel lblNewLabel_1_1 = new JLabel("Ramal/Telefone");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1, "flowx,cell 0 28");
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(SystemColor.menu);
		panel.add(panel_1_1, "cell 0 29,grow");
		panel_1_1.setLayout(new MigLayout("", "[530px]", "[20px]"));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_1_1.add(textField_1, "cell 0 0,growx,aligny top");
		
		JLabel lblNewLabel_1 = new JLabel("Observações\r\n");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1, "flowx,cell 0 31");
		
		JLabel lblNewLabel = new JLabel("Utilize somente para observação relacionada ao serviço!");
		lblNewLabel.setForeground(new Color(51, 51, 102));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(lblNewLabel, "cell 0 32");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.menu);
		panel.add(panel_1, "cell 0 33 1 7,grow");
		panel_1.setLayout(new MigLayout("", "[529px]", "[172px]"));
		
		JTextArea textArea = new JTextArea();
		textArea.setCaretColor(SystemColor.desktop);
		textArea.setBorder(new TitledBorder(new LineBorder(new Color(105, 105, 105), 3, true), "Obs", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.add(textArea, "cell 0 0,grow");
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setToolTipText("");
		btnEnviar.setForeground(new Color(0, 0, 0));
		btnEnviar.setBackground(new Color(240, 240, 240));
		btnEnviar.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(btnEnviar, "flowx,cell 0 40,alignx center,aligny center");
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(btnNewButton_1, "cell 0 40,alignx center");
		
		JLabel lblNewLabel_2_1_1 = new JLabel("*");
		lblNewLabel_2_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_1, "cell 0 31");
		
		JLabel lblNewLabel_2_1_2 = new JLabel("*");
		lblNewLabel_2_1_2.setForeground(Color.RED);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_2, "cell 0 28");
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("*");
		lblNewLabel_2_1_2_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_2_1, "cell 0 25");
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("*");
		lblNewLabel_2_1_2_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_2_1_1, "cell 0 23");
		
		JLabel lblNewLabel_2_1_2_1_1_1 = new JLabel("*");
		lblNewLabel_2_1_2_1_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_2_1_1_1, "cell 0 6");
		
		JLabel lblNewLabel_2 = new JLabel("");
		panel.add(lblNewLabel_2, "cell 0 26,growx");
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Cartucho Químico Formaldeído, com baioneta");
		chckbxNewCheckBox_8.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_8, "cell 0 14");
		
		JCheckBox chckbxNewCheckBox_11 = new JCheckBox("Máscara cirúrgica de tripla camada");
		chckbxNewCheckBox_11.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_11, "cell 0 16");
		
		JCheckBox chckbxNewCheckBox_12 = new JCheckBox("Respirador semi-facial PPF2 (Máscara PFF2)");
		chckbxNewCheckBox_12.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_12, "cell 0 16");
		
		JCheckBox chckbxNewCheckBox_16 = new JCheckBox("Touca descartável branca");
		chckbxNewCheckBox_16.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_16, "cell 0 19");
		
		JCheckBox chckbxNewCheckBox_18 = new JCheckBox("Óculos de Segurança ampla visão");
		chckbxNewCheckBox_18.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_18, "cell 0 20");
		
		JCheckBox chckbxNewCheckBox_19 = new JCheckBox("Escudo de proteção facial");
		chckbxNewCheckBox_19.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(chckbxNewCheckBox_19, "cell 0 20");

	}

}
