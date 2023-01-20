package controle;

import modelo.Incendio;
import visao.JanelaPrincipal;
import visao.TelaIncendio2;

public class App {
	public static void main(String[] args) {
		JanelaPrincipal jan = new JanelaPrincipal();
		jan.setVisible(true);
		Incendio inc = new Incendio();
		TelaIncendio2 ti2 = new TelaIncendio2();
		IncendioControle inccon = new IncendioControle(ti2, inc);
	}
	

}
