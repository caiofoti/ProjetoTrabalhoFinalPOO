package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

import dao.CortinaDAO;
import dao.EpisDAO;
import modelo.Cortina;
import modelo.EPIS;
import visao.JanelaPrincipal;

public class EpisControle implements ActionListener {
	private EPIS ep;
	private JanelaPrincipal jan;
	private EpisDAO epdao;

	public EpisControle(JanelaPrincipal j, EPIS e) {
		jan = j;
		ep = e;
		epdao = new EpisDAO();
		registraListeners();
	}

	public void registraListeners() {
		jan.getTe().getButtonEnviar().addActionListener(this);
		jan.getTe().getButtonCancelar().addActionListener(this);
		jan.getTe().getLuvaSegBor().addActionListener(this);
		jan.getTe().getLuvaSegPro().addActionListener(this);
		jan.getTe().getLuvaVaq().addActionListener(this);
		jan.getTe().getLuvaSegTemp().addActionListener(this);
		jan.getTe().getLuvaSegCong().addActionListener(this);
		jan.getTe().getMangaSeg().addActionListener(this);
		jan.getTe().getAventalTNT().addActionListener(this);
		jan.getTe().getCartQuimGA().addActionListener(this);
		jan.getTe().getCartQuimForm().addActionListener(this);
		jan.getTe().getRespSemiManu().addActionListener(this);
		jan.getTe().getRespPuri().addActionListener(this);
		jan.getTe().getMascTripla().addActionListener(this);
		jan.getTe().getRespSemiPPF2().addActionListener(this);
		jan.getTe().getProtAudTrad().addActionListener(this);
		jan.getTe().getProdAuri().addActionListener(this);
		jan.getTe().getSapatDesc().addActionListener(this);
		jan.getTe().getToucaDesc().addActionListener(this);
		jan.getTe().getOculosSegPoli().addActionListener(this);
		jan.getTe().getOculosSegAmp().addActionListener(this);
		jan.getTe().getEscudoProt().addActionListener(this);
		

		
	}
	
	public void enviarEPIS() {
		ep.setLuva1(jan.getTe().getLuvaSegBor().getText());
		ep.setLuva2(jan.getTe().getLuvaSegCong().getText());
		epdao.cadastraEPI(ep);
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Enviar")) {
			enviarEPIS();
		}
	}
}
