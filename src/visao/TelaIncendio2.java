package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import java.awt.Label;
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

public class TelaIncendio2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public TelaIncendio2() {
		setBounds(100, 100, 665, 3000);
		setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, "cell 0 0,grow");
		
		Label label = new Label("ENGENHARIA - MANUNTENÇÃO E SISTEMA DE INCÊNDIO");
		label.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		label.setBackground(Color.WHITE);
		label.setAlignment(Label.CENTER);
		scrollPane.setColumnHeaderView(label);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new MigLayout("", "[636.00,grow]", "[][][][][][][][][][][][][][80px][][][][][][][][][][][][][][80px,grow][][]"));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Caio\\Downloads\\TelaPedidos4.jpg"));
		panel.add(lblNewLabel_3, "cell 0 0,grow");
		
		JLabel lblNewLabel_5 = new JLabel("Serviço:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_5, "cell 0 2");
		
		JLabel lblNewLabel_4 = new JLabel("Setor encarregado: ");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(lblNewLabel_4, "cell 0 3");
		
		JLabel lblNewLabel_2 = new JLabel("Quem pode solicitar:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_2, "cell 0 4");
		
		JLabel lblNewLabel_1 = new JLabel("Geralmente atende em:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(lblNewLabel_1, "cell 0 5");
		
		JLabel lblNewLabel_9 = new JLabel("<html>O prazo para atendimento será contado da data de disponibilização do formulário à empresa contratada de acordo com sua classificação: chamado urgente (2 horas em dias úteis ou 4 horas nos demais dias não úteis) chamado normal (48 horas em dias úteis ou 72 horas nos demais dias não úteis.</html>");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(lblNewLabel_9, "cell 0 6");
		
		JLabel lblNewLabel_9_1 = new JLabel("<html>Caso o preenchimento da ficha de atendimento seja realizado posterior ao horário máximo permitido acima, poderá ser aplicado o instrumento de medição de resultados previsto no anexo A do Termo de Referência (TR), bem como as sanções previstas no item 19 do TR.</html>");
		lblNewLabel_9_1.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(lblNewLabel_9_1, "cell 0 7");
		
		Label label_1 = new Label("Dados de Solicitação");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		label_1.setBackground(new Color(51, 51, 102));
		label_1.setAlignment(Label.CENTER);
		panel.add(label_1, "cell 0 9,grow");
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Descreva a irregularidade");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1, "flowx,cell 0 11");
		
		JLabel lblNewLabel = new JLabel("Inserir com o máximo de detalhes possível, qual a irregularidade identificada");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(lblNewLabel, "cell 0 12");
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Descri\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(textArea, "cell 0 13,grow");
		
		JLabel lblNewLabel_2_1_2_1_1_1 = new JLabel("*");
		lblNewLabel_2_1_2_1_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_2_1_1_1, "cell 0 11");
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Sistema");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1_1, "flowx,cell 0 15");
		
		JLabel lblNewLabel_2_1_2_1_1_1_1 = new JLabel("*");
		lblNewLabel_2_1_2_1_1_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_2_1_1_1_1, "cell 0 15");
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBox.setBackground(Color.WHITE);
		panel.add(comboBox, "cell 0 16,alignx left");
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Local");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1_1_1, "flowx,cell 0 18");
		
		JLabel lblNewLabel_2_1_2_1_1_1_1_1 = new JLabel("*");
		lblNewLabel_2_1_2_1_1_1_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_2_1_1_1_1_1, "cell 0 18");
		
		JLabel lblNewLabel_10 = new JLabel("Prédio/andar ou ponto de referência");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(lblNewLabel_10, "cell 0 19");
		
		textField = new JTextField();
		textField.setColumns(10);
		panel.add(textField, "cell 0 20,growx");
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Fone de contato");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1, "flowx,cell 0 22");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel.add(textField_1, "cell 0 23,growx");
		
		JLabel lblNewLabel_2_1_2_1_1_1_1_1_1 = new JLabel("*");
		lblNewLabel_2_1_2_1_1_1_1_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_2_1_1_1_1_1_1, "cell 0 22");
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("Observações");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1_1, "cell 0 25");
		
		JLabel lblNewLabel_10_1 = new JLabel("<html>Relatar se a irregularidade está causando danos ao patrimônio ou pode causar risco à comunidade, bem como inserir demais informações relevantes como, por exemplo, se haverá algum evento no local<html>");
		lblNewLabel_10_1.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(lblNewLabel_10_1, "cell 0 26");
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Obs", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(textArea_1, "cell 0 27,grow");
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnNewButton, "flowx,cell 0 29,alignx center,aligny center");
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnNewButton_1, "cell 0 29,alignx center,aligny center");

	}

}
