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
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;

public class JanelaPrincipal extends JFrame {

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
	private TelaInicial ti = new TelaInicial();
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
		menuBar.setBackground(new Color(53, 74, 149));
		menuBar.setToolTipText("ASCOM");
		setJMenuBar(menuBar);

		JMenu menuPrincipal = new JMenu("Principal");
		menuPrincipal.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/home.png")));
		menuBar.add(menuPrincipal);

		JMenuItem itemAutenticar = new JMenuItem("Autenticar");
		itemAutenticar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(content, "tela-autenticar");
			}
		});
		itemAutenticar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/autenticar.png")));
		content = new JPanel();
		content.setBorder(new EmptyBorder(5, 5, 5, 5));
		card = new CardLayout();

		content.setLayout(card);
		content.add(ti, "tela-inicial");
		content.add(ta, "tela-autenticar");

		ta.getButtonAutenticar()
				.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/verificar (4).png")));
		ta.getButtonCancelar().setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/cruz.png")));
		ta.getButtonAutenticar().setText("Autenticar");
		t2.getButtonEnviar().setIcon(
				new ImageIcon(JanelaPrincipal.class.getResource("/figuras/parte-superior-do-aviao-de-papel.png")));
		t2.getButtonCancelar().setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/cruz.png")));
		content.add(t2, "tela-inc");
		tc.getButtonEnviar().setIcon(
				new ImageIcon(JanelaPrincipal.class.getResource("/figuras/parte-superior-do-aviao-de-papel.png")));
		tc.getButtonCancelar().setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/cruz.png")));
		content.add(tc, "tela-cort");
		te.getButtonEnviar().setIcon(
				new ImageIcon(JanelaPrincipal.class.getResource("/figuras/parte-superior-do-aviao-de-papel.png")));
		te.getButtonCancelar().setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/cruz.png")));
		content.add(te, "tela-epis");
		tp.getButtonRemover().setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/cruz.png")));
		tp.getButtonConsultar().setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/procurar.png")));
		content.add(tp, "tela-pedidos");

		menuPrincipal.add(itemAutenticar);

		itemSair = new JMenuItem("Sair");
		itemSair.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/sair.png")));
		menuPrincipal.add(itemSair);

		JMenu menuASCOM = new JMenu("ASCOM");
		menuASCOM.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/ascom.png")));
		menuASCOM.setEnabled(false);
		menuBar.add(menuASCOM);

		menuEngenharia = new JMenu("Engenharia");
		menuEngenharia.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/engenharia.png")));
		menuEngenharia.setEnabled(false);
		menuBar.add(menuEngenharia);

		JMenuItem itemCortinas = new JMenuItem("Solicitação de cortinas");
		itemCortinas.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/persianas.png")));
		itemCortinas.setSelectedIcon(null);

		itemCortinas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(content, "tela-cort");

			}
		});
		menuEngenharia.add(itemCortinas);

		JMenuItem itemIncendio = new JMenuItem("Manuntenção dos Sistemas de Incêndio");
		itemIncendio.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/chama.png")));
		itemIncendio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(content, "tela-inc");
			}
		});

		menuEngenharia.add(itemIncendio);

		JMenuItem itemEPIS = new JMenuItem("EPI's");
		itemEPIS.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/rosto-de-mascara.png")));
		itemEPIS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(content, "tela-epis");
			}
		});
		menuEngenharia.add(itemEPIS);

		JMenuItem itemPedidos = new JMenuItem("Pedidos Internos");
		itemPedidos.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/pedidos.png")));
		itemPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(content, "tela-pedidos");
			}
		});

		card.show(content, "tela-inicial");

		menuEngenharia.add(itemPedidos);

		JMenu menuProplan = new JMenu("PROPLAN");
		menuProplan.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/proplan.png")));
		menuProplan.setEnabled(false);
		menuBar.add(menuProplan);

		JMenu menuSEI = new JMenu("SEI");
		menuSEI.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/sei.png")));
		menuSEI.setEnabled(false);
		menuBar.add(menuSEI);

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
