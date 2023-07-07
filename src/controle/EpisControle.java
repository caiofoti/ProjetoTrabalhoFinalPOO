package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JOptionPane;

import dao.CortinaDAO;
import dao.EpisDAO;
import modelo.Cortina;
import modelo.EPIS;
import modelo.Login;
import visao.JanelaPrincipal;

public class EpisControle implements ActionListener {
	private EPIS ep;
	private JanelaPrincipal jan;
	private EpisDAO epdao;
	private Login l;

	public EpisControle(JanelaPrincipal j, EPIS e, Login log) {
		jan = j;
		ep = e;
		l = log;
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
		ep.setUsuario(l.getUsuario());
		ep.setLuva1(jan.getTe().getLuvaSegBor().getText());
		ep.setLuva2(jan.getTe().getLuvaSegPro().getText());
		ep.setLuva3(jan.getTe().getLuvaVaq().getText());
		ep.setLuva4(jan.getTe().getLuvaSegTemp().getText());
		ep.setLuva5(jan.getTe().getLuvaSegCong().getText());
		ep.setManga(jan.getTe().getMangaSeg().getText());
		ep.setAvental(jan.getTe().getAventalTNT().getText());
		ep.setCartucho1(jan.getTe().getCartQuimGA().getText());
		ep.setCartucho2(jan.getTe().getCartQuimForm().getText());
		ep.setResp1(jan.getTe().getRespSemiManu().getText());
		ep.setResp2(jan.getTe().getRespPuri().getText());
		ep.setMascara(jan.getTe().getMascTripla().getText());
		ep.setResp3(jan.getTe().getRespSemiPPF2().getText());
		ep.setProtetor1(jan.getTe().getProtAudTrad().getText());
		ep.setProtetor2(jan.getTe().getProdAuri().getText());
		ep.setSapatilha(jan.getTe().getSapatDesc().getText());
		ep.setTouca(jan.getTe().getToucaDesc().getText());
		ep.setOculos1(jan.getTe().getOculosSegPoli().getText());
		ep.setOculos2(jan.getTe().getOculosSegAmp().getText());
		ep.setEscudo(jan.getTe().getEscudoProt().getText());
		ep.setMatricula(jan.getTe().getFieldMatricula().getText());
		ep.setTelf(jan.getTe().getFieldTelf().getText());
		ep.setFunc(jan.getTe().getComboFunc().getSelectedItem().toString());
		ep.setObs(jan.getTe().getTextAreaObs().getText());
		if(epdao.cadastraEPI(ep)){
			JOptionPane.showMessageDialog(jan.getContentPane(), "Solicitação enviada!\nID do pedido: "+ ep.getID());
		}else{
			JOptionPane.showMessageDialog(jan.getContentPane(), "Erro ao enviar solicitação");
		};
	}
	
	public void limpaTela() {
		
		jan.getTe().getLuvaSegBor().setSelected(false);
		jan.getTe().getLuvaSegPro().setSelected(false);
		jan.getTe().getLuvaVaq().setSelected(false);
		jan.getTe().getLuvaSegTemp().setSelected(false);
		jan.getTe().getLuvaSegCong().setSelected(false);
		jan.getTe().getMangaSeg().setSelected(false);
		jan.getTe().getAventalTNT().setSelected(false);
		jan.getTe().getCartQuimGA().setSelected(false);
		jan.getTe().getCartQuimForm().setSelected(false);
		jan.getTe().getRespSemiManu().setSelected(false);
		jan.getTe().getRespPuri().setSelected(false);
		jan.getTe().getMascTripla().setSelected(false);
		jan.getTe().getRespSemiPPF2().setSelected(false);
		jan.getTe().getProtAudTrad().setSelected(false);
		jan.getTe().getProdAuri().setSelected(false);
		jan.getTe().getSapatDesc().setSelected(false);
		jan.getTe().getToucaDesc().setSelected(false);
		jan.getTe().getOculosSegPoli().setSelected(false);
		jan.getTe().getOculosSegAmp().setSelected(false);
		jan.getTe().getEscudoProt().setSelected(false);
		jan.getTe().getFieldMatricula().setText("");
		jan.getTe().getFieldTelf().setText("");
		jan.getTe().getComboFunc().setSelectedIndex(0);
		jan.getTe().getTextAreaObs().setText(null);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Enviar")) {
			enviarEPIS();
		}else if (e.getActionCommand().equals("Cancelar")) {
			limpaTela();
		}
	}
}
