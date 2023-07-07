package visao;

import javax.swing.JPanel;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class TelaInicial extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaInicial() {
		setBackground(new Color(53, 74, 149));
		setLayout(new MigLayout("", "[grow][grow][grow]", "[grow][grow][grow][grow]"));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaInicial.class.getResource("/figuras/Captura_de_tela_2023-07-06_214238-removebg-preview.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 56));
		add(lblNewLabel, "cell 1 1 1 2,alignx center,aligny center");

	}

}
