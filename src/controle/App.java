package controle;

import dao.LoginDAO;
import modelo.Cortina;
import modelo.EPIS;
import modelo.Incendio;
import modelo.Login;
import modelo.Pedidos;
import visao.JanelaPrincipal;
import visao.TelaDeAutenticar;
import visao.TelaIncendio;

public class App {
	public static void main(String[] args) {
		EPIS ep = new EPIS();
		Pedidos p = new Pedidos();
		JanelaPrincipal jan = new JanelaPrincipal();
		jan.setVisible(true);
		Incendio inc = new Incendio();
		TelaIncendio ti2 = new TelaIncendio();
		Login li = new Login();
		Cortina co = new Cortina();
		TelaDeAutenticar ta = new TelaDeAutenticar();
		LoginDAO logindao = new LoginDAO();
		LoginControle logcon = new LoginControle(jan, li);
		CortinaControle corcon = new CortinaControle(jan, co, li);
		IncendioControle inccon = new IncendioControle(jan, inc, li);
		PedidoControle pedcon = new PedidoControle(jan, p, inc);
		EpisControle epcon = new EpisControle(jan, ep);
	}

}
