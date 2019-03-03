package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Sistema.BuscaRepositorioPorNumero;
import Sistema.RepositorioItem;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class BuscaPorQttdEstoqueInterfaceG extends JFrame {

	private JPanel contentPane;
	private JTextField campoQuantidade1;
	private JTextField campoQuantidade2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscaPorQttdEstoqueInterfaceG frame = new BuscaPorQttdEstoqueInterfaceG();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BuscaPorQttdEstoqueInterfaceG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel rotuloBuscar = new JLabel("Buscar");
		rotuloBuscar.setBounds(180, 0, 46, 14);
		contentPane.add(rotuloBuscar);
		
		JTextArea areaProduto = new JTextArea();
		areaProduto.setEditable(false);
		areaProduto.setBounds(232, 25, 194, 323);
		contentPane.add(areaProduto);
		
		
		JButton botaoConfirmar = new JButton("Confirmar");
		botaoConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					RepositorioItem rep = new RepositorioItem();
					rep.getListasObjetos();
					BuscaRepositorioPorNumero bEst = new BuscaRepositorioPorNumero();
					int qtd1= Integer.parseInt(campoQuantidade1.getText());	
					int qtd2= Integer.parseInt(campoQuantidade2.getText());
					areaProduto.setText(bEst.buscaPorQuantidadeEstoque(qtd1, qtd2, rep));
					}catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Produto não Encontrado!");
					}
				campoQuantidade1.setText("");
				campoQuantidade2.setText("");
			}
		});
		botaoConfirmar.setBounds(49, 415, 100, 23);
		contentPane.add(botaoConfirmar);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		botaoVoltar.setBounds(245, 415, 100, 23);
		contentPane.add(botaoVoltar);
		
		JLabel rotuloQuantidadeDe = new JLabel("De:");
		rotuloQuantidadeDe.setBounds(22, 71, 46, 14);
		contentPane.add(rotuloQuantidadeDe);
		
		campoQuantidade1 = new JTextField();
		campoQuantidade1.setBounds(78, 68, 86, 20);
		contentPane.add(campoQuantidade1);
		campoQuantidade1.setColumns(10);
		
		JLabel rotuloQuantidade = new JLabel("Quantidade");
		rotuloQuantidade.setBounds(57, 30, 81, 14);
		contentPane.add(rotuloQuantidade);
		
		JLabel rotuloQuantidadeAte = new JLabel("At\u00E9:");
		rotuloQuantidadeAte.setBounds(22, 115, 46, 14);
		contentPane.add(rotuloQuantidadeAte);
		
		campoQuantidade2 = new JTextField();
		campoQuantidade2.setBounds(78, 112, 86, 20);
		contentPane.add(campoQuantidade2);
		campoQuantidade2.setColumns(10);
		
		JScrollPane barra = new JScrollPane(areaProduto);
		barra.setBounds(230, 30, 194, 323);
		contentPane.add(barra);
	}
}
