import javax.swing.JOptionPane;

public class MensagemLogoutItau extends MensagemLogout{

	public MensagemLogoutItau(String logo, String mensagem) {
		super(logo, mensagem);
		// TODO Auto-generated constructor stub
	}

	@Override
	void mostrarTelaGrafica() {
		JOptionPane.showMessageDialog(null, logo+": "+mensagem);
	}


}
