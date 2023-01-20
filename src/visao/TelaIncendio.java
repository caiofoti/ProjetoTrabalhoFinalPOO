package visao;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;
import java.awt.Label;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class TelaIncendio extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIncendio frame = new TelaIncendio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaIncendio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 658);
		getContentPane().setLayout(new MigLayout("", "[grow]", "[grow][grow]"));
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, "cell 0 0,grow");
		
		Label label = new Label("ENGENHARIA - MANUNTENÇÃO E SISTEMA DE INCÊNDIO");
		label.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		label.setBackground(Color.WHITE);
		label.setAlignment(Label.CENTER);
		scrollPane.setColumnHeaderView(label);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new MigLayout("", "[-7.00][609.00,grow]", "[][20px][][][][24.00][][][20px][][20px][][][grow][][47.00][][][20px][][5px][][5px][][20px][][][20px][][][80px][20px][]"));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Caio\\Downloads\\TelaPedidos4.jpg"));
		panel.add(lblNewLabel_3, "cell 0 0 2 1");
		
		JLabel lblNewLabel_1 = new JLabel("Geralmente atende em:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(lblNewLabel_1, "cell 1 5");
		
		JLabel lblNewLabel_2 = new JLabel("Quem pode solicitar:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_2, "cell 1 4");
		
		JLabel lblNewLabel_4 = new JLabel("Setor encarregado: ");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(lblNewLabel_4, "cell 1 3");
		
		JLabel lblNewLabel_5 = new JLabel("Serviço:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_5, "cell 1 2");
		
		JLabel lblNewLabel_6 = new JLabel("Manutenção de sistemas de incêndio");
		panel.add(lblNewLabel_6, "cell 1 2");
		
		JLabel lblNewLabel_7 = new JLabel("CENG/DESEG");
		panel.add(lblNewLabel_7, "cell 1 3");
		
		JLabel lblNewLabel_8 = new JLabel("CENG, Prefeitura, Fiscais técnicos, Bombeiros e Brigadistas UFCSPA.");
		panel.add(lblNewLabel_8, "cell 1 4");
		
		JLabel lblNewLabel_9 = new JLabel("<html>O prazo para atendimento será contado da data de disponibilização do formulário à empresa contratada de acordo com sua classificação: chamado urgente (2 horas em dias úteis ou 4 horas nos demais dias não úteis) chamado normal (48 horas em dias úteis ou 72 horas nos demais dias não úteis.</html>");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(lblNewLabel_9, "flowy,cell 1 6");
		
		JLabel lblNewLabel_9_1 = new JLabel("<html>Caso o preenchimento da ficha de atendimento seja realizado posterior ao horário máximo permitido acima, poderá ser aplicado o instrumento de medição de resultados previsto no anexo A do Termo de Referência (TR), bem como as sanções previstas no item 19 do TR.</html>");
		lblNewLabel_9_1.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(lblNewLabel_9_1, "cell 1 7");
		
		Label label_1 = new Label("Dados de Solicitação");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		label_1.setBackground(new Color(51, 51, 102));
		label_1.setAlignment(Label.CENTER);
		panel.add(label_1, "cell 1 9,grow");
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Descreva a irregularidade");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1, "flowx,cell 1 11");
		
		JLabel lblNewLabel_2_1_2_1_1_1 = new JLabel("*");
		lblNewLabel_2_1_2_1_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_2_1_1_1, "cell 1 11");
		
		JLabel lblNewLabel = new JLabel("Inserir com o máximo de detalhes possível, qual a irregularidade identificada");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(lblNewLabel, "cell 1 12");
		
		JTextArea textArea = new JTextArea();
		panel.add(textArea, "cell 1 13 1 3,grow");
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Sistema");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1_1, "flowx,cell 1 16");
		
		JLabel lblNewLabel_2_1_2_1_1_1_1 = new JLabel("*");
		lblNewLabel_2_1_2_1_1_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_2_1_1_1_1, "cell 1 16");
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"UFCSPA", "", "<> ENGENHARIA", "", "MANUNTENÇÃO DOS SISTEMAS DE INCÊNDIO", "Alarmes", "Componentes do SPK", "Componentes dos Hidrantes", "Iluminação de Emergência e Balizamento", "Portas Corta Fogo", "Sistema de pressurização da escada do P2"}));
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBox.setBackground(Color.WHITE);
		panel.add(comboBox, "flowy,cell 1 17,alignx left,aligny center");
		comboBox.addItem("");
		comboBox.addItem("MANUNTENÇÃO DOS SISTEMAS DE INCÊNDIO");
		comboBox.addItem("Alarmes");
		comboBox.addItem("Componentes do SPK");
		comboBox.addItem("Componentes dos Hidrantes");
		comboBox.addItem("Iluminação de Emergência e Balizamento");
		comboBox.addItem("Portas Corta Fogo");
		comboBox.addItem("Sistema de pressurização da escada do P2");
		
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Local");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1_1_1, "flowx,cell 1 19");
		
		JLabel lblNewLabel_2_1_2_1_1_1_1_1 = new JLabel("*");
		lblNewLabel_2_1_2_1_1_1_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		panel.add(lblNewLabel_2_1_2_1_1_1_1_1, "cell 1 19");
		
		JLabel lblNewLabel_10 = new JLabel("Prédio/andar ou ponto de referência");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(lblNewLabel_10, "cell 1 21");
		
		textField = new JTextField();
		panel.add(textField, "cell 1 23,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Fone de contato");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1, "flowx,cell 1 25");
		
		JLabel lblNewLabel_2_1_2_1_1_1_1_1_1 = new JLabel("*");
		lblNewLabel_2_1_2_1_1_1_1_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		panel.add(lblNewLabel_2_1_2_1_1_1_1_1_1, "cell 1 25");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel.add(textField_1, "cell 1 26,growx");
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("Observações");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1_1, "flowx,cell 1 28");
		
		JLabel lblNewLabel_2_1_2_1_1_1_1_1_1_1 = new JLabel("*");
		lblNewLabel_2_1_2_1_1_1_1_1_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		panel.add(lblNewLabel_2_1_2_1_1_1_1_1_1_1, "cell 1 28");
		
		JLabel lblNewLabel_10_1 = new JLabel("<html>Relatar se a irregularidade está causando danos ao patrimônio ou pode causar risco à comunidade, bem como inserir demais informações relevantes como, por exemplo, se haverá algum evento no local<html>");
		lblNewLabel_10_1.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(lblNewLabel_10_1, "cell 1 29");
		
		JTextArea textArea_1 = new JTextArea();
		panel.add(textArea_1, "cell 1 30 3 1,grow");
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnNewButton, "flowx,cell 1 32,alignx center");
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnNewButton_1, "cell 1 32");
	}
}
