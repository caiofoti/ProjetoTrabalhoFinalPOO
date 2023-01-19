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

public class TelaDeAutenticação extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField fieldUsuario;
	private JPasswordField fieldSenha;

	/**
	 * Create the panel.
	 */
	public TelaDeAutenticação() {
		setBounds(100, 100, 665, 658);
		setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JPanel panel = new JPanel();
		add(panel, "cell 0 0,grow");
		panel.setLayout(new MigLayout("", "[20.00][585.00,grow][grow]", "[][][][86.00][][20.00][13.00][22.00][16.00][26.00][][][][][][][][][][]"));
		
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
		
		JButton btnAutenticar = new JButton("Autenticar");
		btnAutenticar.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(btnAutenticar, "flowx,cell 1 9,alignx center");
		
		JButton labelCancelar = new JButton("Cancelar");
		labelCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			fieldUsuario.setText(null);
			fieldSenha.setText(null);
			
			}
		});
		labelCancelar.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(labelCancelar, "cell 1 9,alignx center,aligny center");

	}

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

}
