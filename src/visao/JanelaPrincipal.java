package visao;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel content;
	private TelaIncendio2 t2 = new TelaIncendio2();
	private TelaDeAutenticação ta = new TelaDeAutenticação();
	private JMenu menuEngenharia;
	private TelaCortina tc = new TelaCortina();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setTitle("Sistema de Pedidos Internos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 658);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("ASCOM");
		setJMenuBar(menuBar);
		
		JMenu menuPrincipal = new JMenu("Principal");
		menuBar.add(menuPrincipal);
		
		JMenuItem itemAutenticar = new JMenuItem("Autenticar");
		itemAutenticar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setSize(665, 658);
				ta.setLocation(0, 0);
				
				content.removeAll();
				content.add(ta, BorderLayout.CENTER);
				content.revalidate();
			}
		});
		menuPrincipal.add(itemAutenticar);
		
		JMenuItem itemSair = new JMenuItem("Sair");
		menuPrincipal.add(itemSair);
		
		JMenu menuASCOM = new JMenu("ASCOM");
		menuASCOM.setEnabled(false);
		menuBar.add(menuASCOM);
		
		menuEngenharia = new JMenu("Engenharia");
		menuEngenharia.setEnabled(false);
		menuBar.add(menuEngenharia);
		
		JMenuItem itemCortinas = new JMenuItem("Solicitação de cortinas");
		menuEngenharia.add(itemCortinas);
		
		JMenuItem itemIncendio = new JMenuItem("Manuntenção dos Sistemas de Incêndio");
		itemIncendio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2.setSize(665, 658);
				t2.setLocation(0, 0);
				
				content.removeAll();
				content.add(t2, BorderLayout.CENTER);
				content.revalidate();
			}
		});
		
		
		itemCortinas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tc.setSize(665, 658);
				tc.setLocation(0, 0);
				
				content.removeAll();
				content.add(tc, BorderLayout.CENTER);
				content.revalidate();
			}
		});
		menuEngenharia.add(itemIncendio);
		
		JMenu menuProplan = new JMenu("PROPLAN");
		menuProplan.setEnabled(false);
		menuBar.add(menuProplan);
		
		JMenu menuSEI = new JMenu("SEI");
		menuSEI.setEnabled(false);
		menuBar.add(menuSEI);
		content = new JPanel();
		content.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(content);
		content.setLayout(new CardLayout(0, 0));
	}

	public TelaIncendio2 getT2() {
		return t2;
	}

	public void setT2(TelaIncendio2 t2) {
		this.t2 = t2;
	}

	public TelaDeAutenticação getTa() {
		return ta;
	}

	public void setTa(TelaDeAutenticação ta) {
		this.ta = ta;
	}

	public JMenu getMenuEngenharia() {
		return menuEngenharia;
	}

	public void setMenuEngenharia(JMenu menuEngenharia) {
		this.menuEngenharia = menuEngenharia;
	}

	public TelaCortina getTc() {
		return tc;
	}

	public void setTc(TelaCortina tc) {
		this.tc = tc;
	}
	
	

}
