package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;

public class TelaDeAutenticar extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField fieldUsuario;
	private JPasswordField fieldSenha;
	private JButton buttonAutenticar;
	private JButton buttonCancelar;
	private JLabel imagemPedidosInternos;
	private JLabel imagemLogin;

	/**
	 * Create the panel.
	 */
	public TelaDeAutenticar() {
		setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 665, 658);
		setLayout(new MigLayout("", "[3.00][374.00][333.00]", "[]"));
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		add(panel, "cell 1 0 2 1,grow");
		panel.setLayout(new MigLayout("", "[297.00][239.00,grow][][-37.00,grow]", "[][][][30px][][20.00][13.00][22.00][16.00][26.00][][][][][][][][][][]"));
		
		imagemLogin = new JLabel("");
		imagemLogin.setIcon(new ImageIcon(TelaDeAutenticar.class.getResource("/figuras/TelaLogin.jpg")));
		panel.add(imagemLogin, "cell 0 1 1 18");
		
		imagemPedidosInternos = new JLabel("");
		imagemPedidosInternos.setIcon(new ImageIcon(TelaDeAutenticar.class.getResource("/figuras/Icon_PedidosInternos.png")));
		panel.add(imagemPedidosInternos, "cell 1 2,alignx center");
		
		JLabel labelUsuario = new JLabel("Usuário");
		labelUsuario.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(labelUsuario, "cell 1 4,alignx center,aligny center");
		
		fieldUsuario = new JTextField();
		panel.add(fieldUsuario, "cell 1 5,growx");
		fieldUsuario.setColumns(10);
		
		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(labelSenha, "cell 1 6,alignx center");
		
		fieldSenha = new JPasswordField();
		panel.add(fieldSenha, "cell 1 7,growx");
		
		 buttonAutenticar = new JButton("Autentica");
		 buttonAutenticar.setFont(new Font("Arial", Font.BOLD, 11));
		 panel.add(buttonAutenticar, "flowx,cell 1 9,alignx center");
		
		 buttonCancelar = new JButton("Cancelar");
		 buttonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			fieldUsuario.setText(null);
			fieldSenha.setText(null);
			
			}
		});
		buttonCancelar.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(buttonCancelar, "cell 1 9,alignx center,aligny center");

	}

	
	// ########### GETTERS E SETTERS
	
	
	public JTextField getFieldUsuario() {
		return fieldUsuario;
	}

	public void setFieldUsuario(JTextField fieldUsuario) {
		this.fieldUsuario = fieldUsuario;
	}

	public JPasswordField getFieldSenha() {
		return fieldSenha;
	}

	public void setFieldSenha(JPasswordField fieldSenha) {
		this.fieldSenha = fieldSenha;
	}

	public JButton getButtonAutenticar() {
		return buttonAutenticar;
	}

	public void setButtonAutenticar(JButton buttonAutenticar) {
		this.buttonAutenticar = buttonAutenticar;
	}

	public JButton getButtonCancelar() {
		return buttonCancelar;
	}

	public void setButtonCancelar(JButton buttonCancelar) {
		this.buttonCancelar = buttonCancelar;
	}
	

}
