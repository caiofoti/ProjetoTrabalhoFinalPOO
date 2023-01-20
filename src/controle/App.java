package controle;

import modelo.Cortina;
import modelo.Incendio;
import modelo.Login;
import visao.JanelaPrincipal;
import visao.TelaIncendio;

public class App {
	public static void main(String[] args) {
		JanelaPrincipal jan = new JanelaPrincipal();
		jan.setVisible(true);
		Incendio inc = new Incendio();
		TelaIncendio ti2 = new TelaIncendio();
		Login li = new Login();
		Cortina co = new Cortina();
		TelaControle inccon = new TelaControle(jan, inc, li, co);
	}
	

}
