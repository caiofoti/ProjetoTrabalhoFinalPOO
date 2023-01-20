package controle;

import modelo.Incendio;
import modelo.Login;
import visao.JanelaPrincipal;
import visao.TelaIncendio2;

public class App {
	public static void main(String[] args) {
		JanelaPrincipal jan = new JanelaPrincipal();
		jan.setVisible(true);
		Incendio inc = new Incendio();
		TelaIncendio2 ti2 = new TelaIncendio2();
		Login li = new Login();
		IncendioControle inccon = new IncendioControle(jan, inc, li);
	}
	

}
