package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Sistema.RepositorioItem;
import Sistema.imprimirEmInterface;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProdutoEEstoqueInterfaceG extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProdutoEEstoqueInterfaceG frame = new ProdutoEEstoqueInterfaceG();
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
	public ProdutoEEstoqueInterfaceG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea areaProduto = new JTextArea();
		areaProduto.setEditable(false);
		areaProduto.setBounds(22, 36, 402, 299);
		contentPane.add(areaProduto);
		
		JLabel rotuloProdutos = new JLabel("Produtos");
		rotuloProdutos.setBounds(180, 11, 64, 14);
		contentPane.add(rotuloProdutos);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			dispose();
			}
		});
		botaoVoltar.setBounds(180, 401, 89, 23);
		contentPane.add(botaoVoltar);
		
		JScrollPane scrollPane = new JScrollPane(areaProduto);
		scrollPane.setBounds(22, 58, 402, 322);
		contentPane.add(scrollPane);
		
		RepositorioItem rep = new RepositorioItem();
		imprimirEmInterface imp = new imprimirEmInterface();
		areaProduto.setText(imp.imprimirEstoqueItens(rep));
		
		
	}
}
