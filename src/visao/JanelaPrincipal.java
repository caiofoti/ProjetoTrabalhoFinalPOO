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
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class JanelaPrincipal extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel content;
	private TelaIncendio t2 = new TelaIncendio();
	private TelaDeAutenticar ta = new TelaDeAutenticar();
	private JMenu menuEngenharia;
	private TelaCortina tc = new TelaCortina();
	private JMenuItem itemSair;
	private CardLayout card;
	private TelaEPIS te = new TelaEPIS();
	private TelaPedidosInternos tp = new TelaPedidosInternos();

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
		
		content = new JPanel();
		content.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		card = new CardLayout();
		
		content.setLayout(card);
		
		content.add(ta, "tela1");
		content.add(t2, "tela-inc");
		content.add(tc, "tela-cort");
		content.add(te, "tela-epis");
		content.add(tp, "tela-pedidos");
		
		
		menuPrincipal.add(itemAutenticar);
		
		 itemSair = new JMenuItem("Sair");
		menuPrincipal.add(itemSair);
		
		JMenu menuASCOM = new JMenu("ASCOM");
		menuASCOM.setEnabled(false);
		menuBar.add(menuASCOM);
		
		menuEngenharia = new JMenu("Engenharia");
		menuBar.add(menuEngenharia);
		
		JMenuItem itemCortinas = new JMenuItem("Solicitação de cortinas");
		itemCortinas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(content, "tela-cort");
				
			}
		});
		menuEngenharia.add(itemCortinas);
		
		JMenuItem itemIncendio = new JMenuItem("Manuntenção dos Sistemas de Incêndio");
		itemIncendio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(content, "tela-inc");
			}
		});
		
	
		menuEngenharia.add(itemIncendio);
		
		JMenuItem itemEPIS = new JMenuItem("EPI's");
		itemEPIS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(content, "tela-epis");
			}
		});
		menuEngenharia.add(itemEPIS);
		
		JMenuItem itemPedidos = new JMenuItem("Pedidos Internos");
		itemPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(content, "tela-pedidos");
			}
		});
		menuEngenharia.add(itemPedidos);
		
		JMenu menuProplan = new JMenu("PROPLAN");
		menuProplan.setEnabled(false);
		menuBar.add(menuProplan);
		
		JMenu menuSEI = new JMenu("SEI");
		menuSEI.setEnabled(false);
		menuBar.add(menuSEI);
		
		
		
		
		
		
		JPanel panel = new JPanel();
		content.add(panel, "name_581334450997900");
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel labelSistemas = new JLabel("Sistema de Pedidos Internos");
		labelSistemas.setHorizontalAlignment(SwingConstants.CENTER);
		labelSistemas.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel.add(labelSistemas, "name_6323191062300");
		
		setContentPane(content);
	}
	
	
	// ########### GETTERS E SETTERS
	

	public TelaIncendio getT2() {
		return t2;
	}

	public void setT2(TelaIncendio t2) {
		this.t2 = t2;
	}

	public TelaDeAutenticar getTa() {
		return ta;
	}

	public void setTa(TelaDeAutenticar ta) {
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

	public JMenuItem getItemSair() {
		return itemSair;
	}

	public void setItemSair(JMenuItem itemSair) {
		this.itemSair = itemSair;
	}

	public TelaEPIS getTe() {
		return te;
	}

	public void setTe(TelaEPIS te) {
		this.te = te;
	}

	public TelaPedidosInternos getTp() {
		return tp;
	}

	public void setTp(TelaPedidosInternos tp) {
		this.tp = tp;
	}
	
	
	

}
