package visao;

import java.awt.EventQueue;

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
	private TelaIncendio2 p2;

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
				TelaDeAutenticação p1 = new TelaDeAutenticação();
				p1.setSize(665, 658);
				p1.setLocation(0, 0);
				
				content.removeAll();
				content.add(p1, BorderLayout.CENTER);
				content.revalidate();
			}
		});
		menuPrincipal.add(itemAutenticar);
		
		JMenuItem itemSair = new JMenuItem("Sair");
		menuPrincipal.add(itemSair);
		
		JMenu menuASCOM = new JMenu("ASCOM");
		menuBar.add(menuASCOM);
		
		JMenu mnNewMenu = new JMenu("Engenharia");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Solicitação de cortinas");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Manuntenção dos Sistemas de Incêndio");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaIncendio2 p2 = new TelaIncendio2();
				p2.setSize(665, 658);
				p2.setLocation(0, 0);
				
				content.removeAll();
				content.add(p2, BorderLayout.CENTER);
				content.revalidate();
			}
		});
		
		
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCortina p3 = new TelaCortina();
				p3.setSize(665, 658);
				p3.setLocation(0, 0);
				
				content.removeAll();
				content.add(p3, BorderLayout.CENTER);
				content.revalidate();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("PROPLAN");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("SEI");
		menuBar.add(mnNewMenu_2);
		content = new JPanel();
		content.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(content);
		content.setLayout(new CardLayout(0, 0));
	}

}
