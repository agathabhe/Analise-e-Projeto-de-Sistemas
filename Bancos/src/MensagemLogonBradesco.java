import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MensagemLogonBradesco extends MensagemLogon {

	@Override
	void mostrarTelaGrafica() {
		JButton botao = new JButton("Entrar");
		JPanel painel = new JPanel();
		JTextField tfLogin = new JTextField(10);
		JPasswordField pfSenha = new JPasswordField(10);
		JLabel lLogin = new JLabel("Login");
		JLabel lSenha = new JLabel("Senha");

		painel.add(lLogin);
		painel.add(tfLogin);
		painel.add(lSenha);;
		painel.add(pfSenha);
		painel.add(botao);

		JFrame janela = new JFrame("Banco Bradesco");
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();
		janela.setVisible(true);

	}

}
