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
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

public class TelaCortina extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JTextField fieldTel;
	private JTextField fieldEmail;
	private JTextField fieldLocal;
	private JTextField fieldResp;
	private JButton buttonEnviar;
	private JButton buttonCancelar;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Create the panel.
	 */
	public TelaCortina() {
		setBounds(100, 100, 665, 658);
		setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, "cell 0 0,grow");
		
		Label labelHeader = new Label("Solicitação de cortinas");
		labelHeader.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		labelHeader.setBackground(Color.WHITE);
		labelHeader.setAlignment(Label.CENTER);
		scrollPane.setColumnHeaderView(labelHeader);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new MigLayout("", "[grow]", "[][10px][][][][][10px][][10px][][10px][][][15px][][][][15px][][][15px][][][15px][][][80px][15px][][][20px][]"));
		
		 JLabel labelFoto = new JLabel();
		 labelFoto.setIcon(new ImageIcon("ProjetoTrabalhoFinalPOO\\src\\TelaPedidos4.png"));
		//lblNewLabel_3.setIcon(new ImageIcon());
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
		
		JLabel labelTextoServico = new JLabel("Solicitação de Mobiliário Novo");
		labelTextoServico.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(labelTextoServico, "cell 0 2");
		
		JLabel labelTextoEngenharia = new JLabel("Engenharia - Divisão de Arquitetura");
		labelTextoEngenharia.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(labelTextoEngenharia, "cell 0 3");
		
		JLabel labelTextoFunc = new JLabel(" Funcionários e Docentes.");
		labelTextoFunc.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(labelTextoFunc, "cell 0 4");
		
		JLabel labelAsterico = new JLabel("*");
		labelAsterico.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(labelAsterico, "cell 0 5");
		
		Label labelDados = new Label("Dados de Solicitação");
		labelDados.setForeground(Color.WHITE);
		labelDados.setFont(new Font("Arial Black", Font.BOLD, 16));
		labelDados.setBackground(new Color(51, 51, 102));
		labelDados.setAlignment(Label.CENTER);
		panel.add(labelDados, "cell 0 7,grow");
		
		JLabel Substituição = new JLabel("Substituição de cortina existente");
		Substituição.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(Substituição, "flowx,cell 0 9");
		
		JLabel labelAsterisco1 = new JLabel("*");
		labelAsterisco1.setForeground(Color.RED);
		labelAsterisco1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(labelAsterisco1, "cell 0 9");
		
		JRadioButton buttonSim = new JRadioButton("Sim");
		buttonGroup.add(buttonSim);
		buttonSim.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(buttonSim, "cell 0 11");
		
		JRadioButton buttonNo = new JRadioButton("Não");
		buttonGroup.add(buttonNo);
		buttonNo.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(buttonNo, "cell 0 12");
		
		JLabel Ramal_Telef = new JLabel("Ramal/Telefone");
		Ramal_Telef.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(Ramal_Telef, "flowx,cell 0 14");
		
		JLabel labelAsterisco2 = new JLabel("*");
		labelAsterisco2.setForeground(Color.RED);
		labelAsterisco2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(labelAsterisco2, "cell 0 14");
		
		JLabel labelApenasNumeros = new JLabel("Apenas números.");
		labelApenasNumeros.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(labelApenasNumeros, "cell 0 15");
		
		fieldTel = new JTextField();
		panel.add(fieldTel, "cell 0 16,growx");
		fieldTel.setColumns(10);
		
		JLabel email = new JLabel("Email");
		email.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(email, "flowx,cell 0 18");
		
		JLabel labelAstericos3 = new JLabel("*");
		labelAstericos3.setForeground(Color.RED);
		labelAstericos3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(labelAstericos3, "cell 0 18");
		
		fieldEmail = new JTextField();
		fieldEmail.setColumns(10);
		panel.add(fieldEmail, "cell 0 19,growx");
		
		JLabel local = new JLabel("Local (sala e prédio)");
		local.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(local, "flowx,cell 0 21");
		
		JLabel labelAsterisco4 = new JLabel("*");
		labelAsterisco4.setForeground(Color.RED);
		labelAsterisco4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(labelAsterisco4, "cell 0 21");
		
		fieldLocal = new JTextField();
		fieldLocal.setColumns(10);
		panel.add(fieldLocal, "cell 0 22,growx");
		
		JLabel justificativa = new JLabel("Justificativa");
		justificativa.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(justificativa, "flowx,cell 0 24");
		
		JTextArea areaJust = new JTextArea();
		areaJust.setFont(new Font("Arial", Font.PLAIN, 13));
		areaJust.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(areaJust, "cell 0 25 1 2,grow");
		
		JLabel responsavel = new JLabel("Responsável atribuído");
		responsavel.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(responsavel, "flowx,cell 0 28");
		
		JLabel labelAsterisco5 = new JLabel("*");
		labelAsterisco5.setForeground(Color.RED);
		labelAsterisco5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(labelAsterisco5, "cell 0 24");
		
		JLabel labelAsterisco6 = new JLabel("*");
		labelAsterisco6.setForeground(Color.RED);
		labelAsterisco6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(labelAsterisco6, "cell 0 28");
		
		fieldResp = new JTextField();
		fieldResp.setColumns(10);
		panel.add(fieldResp, "cell 0 29,growx");
		
		 buttonEnviar = new JButton("Enviar");
		buttonEnviar.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(buttonEnviar, "flowx,cell 0 31,alignx center,aligny center");
		
		 buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(buttonCancelar, "cell 0 31,alignx center,aligny center");
		
		buttonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 if(e.getActionCommand().equals("Cancelar"))
				 buttonGroup.clearSelection();
				 fieldEmail.setText("");
			 	 fieldLocal.setText("");
			 	 fieldResp.setText("");
			 	 fieldTel.setText("");
			 	 areaJust.setText("");
					;
			}});

	}

	public JTextField getFieldTel() {
		return fieldTel;
	}

	public void setFieldTel(JTextField fieldTel) {
		this.fieldTel = fieldTel;
	}

	public JTextField getFieldEmail() {
		return fieldEmail;
	}

	public void setFieldEmail(JTextField fieldEmail) {
		this.fieldEmail = fieldEmail;
	}

	public JTextField getFieldLocal() {
		return fieldLocal;
	}

	public void setFieldLocal(JTextField fieldLocal) {
		this.fieldLocal = fieldLocal;
	}

	public JTextField getFieldResp() {
		return fieldResp;
	}

	public void setFieldResp(JTextField fieldResp) {
		this.fieldResp = fieldResp;
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
