package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import java.awt.Label;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class TelaCortina extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public TelaCortina() {
		setBounds(100, 100, 665, 3000);
		setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, "cell 0 0,grow");
		
		Label label = new Label("Solicitação de cortinas");
		label.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		label.setBackground(Color.WHITE);
		label.setAlignment(Label.CENTER);
		scrollPane.setColumnHeaderView(label);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new MigLayout("", "[grow]", "[][10px][][][][][10px][][10px][][10px][][][15px][][][][15px][][][15px][][][15px][][][80px][15px][][][20px][]"));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Caio\\Downloads\\TelaPedidos4.jpg"));
		panel.add(lblNewLabel_3, "cell 0 0");
		
		JLabel lblNewLabel_5 = new JLabel("Serviço:");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(lblNewLabel_5, "flowx,cell 0 2");
		
		JLabel lblNewLabel_4 = new JLabel("Setor encarregado: ");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(lblNewLabel_4, "flowx,cell 0 3");
		
		JLabel lblNewLabel_2 = new JLabel("Quem pode solicitar:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(lblNewLabel_2, "flowx,cell 0 4");
		
		JLabel lblNewLabel_1 = new JLabel("Geralmente atende em:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(lblNewLabel_1, "flowx,cell 0 5");
		
		JLabel lblNewLabel_6 = new JLabel("Solicitação de Mobiliário Novo");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(lblNewLabel_6, "cell 0 2");
		
		JLabel lblNewLabel_6_1 = new JLabel("Engenharia - Divisão de Arquitetura");
		lblNewLabel_6_1.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(lblNewLabel_6_1, "cell 0 3");
		
		JLabel lblNewLabel_6_2 = new JLabel(" Funcionários e Docentes.");
		lblNewLabel_6_2.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(lblNewLabel_6_2, "cell 0 4");
		
		JLabel lblNewLabel_6_2_1 = new JLabel("*");
		lblNewLabel_6_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(lblNewLabel_6_2_1, "cell 0 5");
		
		Label label_1 = new Label("Dados de Solicitação");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		label_1.setBackground(new Color(51, 51, 102));
		label_1.setAlignment(Label.CENTER);
		panel.add(label_1, "cell 0 7,grow");
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Substituição de cortina existente");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1, "flowx,cell 0 9");
		
		JLabel lblNewLabel_2_1_2_1_1_1 = new JLabel("*");
		lblNewLabel_2_1_2_1_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_2_1_1_1, "cell 0 9");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Sim");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(rdbtnNewRadioButton, "cell 0 11");
		
		JRadioButton rdbtnNo = new JRadioButton("Não");
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(rdbtnNo, "cell 0 12");
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Ramal/Telefone");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1_1, "flowx,cell 0 14");
		
		JLabel lblNewLabel_2_1_2_1_1_1_1 = new JLabel("*");
		lblNewLabel_2_1_2_1_1_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_2_1_1_1_1, "cell 0 14");
		
		JLabel lblNewLabel_6_3 = new JLabel("Apenas números.");
		lblNewLabel_6_3.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(lblNewLabel_6_3, "cell 0 15");
		
		textField = new JTextField();
		panel.add(textField, "cell 0 16,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1_1_1, "flowx,cell 0 18");
		
		JLabel lblNewLabel_2_1_2_1_1_1_1_1 = new JLabel("*");
		lblNewLabel_2_1_2_1_1_1_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_2_1_1_1_1_1, "cell 0 18");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel.add(textField_1, "cell 0 19,growx");
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Local (sala e prédio)");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1, "flowx,cell 0 21");
		
		JLabel lblNewLabel_2_1_2_1_1_1_1_1_1 = new JLabel("*");
		lblNewLabel_2_1_2_1_1_1_1_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_2_1_1_1_1_1_1, "cell 0 21");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel.add(textField_2, "cell 0 22,growx");
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("Justificativa");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1_1, "flowx,cell 0 24");
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.PLAIN, 13));
		textArea.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(textArea, "cell 0 25 1 2,grow");
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1 = new JLabel("Responsável atribuído");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1, "flowx,cell 0 28");
		
		JLabel lblNewLabel_2_1_2_1_1_1_1_1_1_1 = new JLabel("*");
		lblNewLabel_2_1_2_1_1_1_1_1_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_2_1_1_1_1_1_1_1, "cell 0 24");
		
		JLabel lblNewLabel_2_1_2_1_1_1_1_1_1_2 = new JLabel("*");
		lblNewLabel_2_1_2_1_1_1_1_1_1_2.setForeground(Color.RED);
		lblNewLabel_2_1_2_1_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2_1_2_1_1_1_1_1_1_2, "cell 0 28");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel.add(textField_3, "cell 0 29,growx");
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnNewButton, "flowx,cell 0 31,alignx center,aligny center");
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnNewButton_1, "cell 0 31,alignx center,aligny center");

	}

}
