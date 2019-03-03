import javax.swing.JOptionPane;

public class MensagemLogoutBradesco extends MensagemLogout {

	public MensagemLogoutBradesco(String logo, String mensagem) {
		super(logo, mensagem);
		// TODO Auto-generated constructor stub
	}

	@Override
	void mostrarTelaGrafica() {
		JOptionPane.showMessageDialog(null, logo+": "+mensagem);
	}

}
