package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Sistema.BuscaRepositorioPorTexto;
import Sistema.RepositorioItem;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuscarTextoInterfaceG extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarTextoInterfaceG frame = new BuscarTextoInterfaceG();
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
	public BuscarTextoInterfaceG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		botaoVoltar.setBounds(301, 380, 103, 23);
		contentPane.add(botaoVoltar);

		JTextArea areaProduto = new JTextArea();
		areaProduto.setLineWrap(true);
		areaProduto.setBounds(265, 42, 264, 311);
		contentPane.add(areaProduto);
		areaProduto.setEditable(false);

		JLabel rotuloNome = new JLabel("Nome:");
		rotuloNome.setBounds(10, 55, 46, 14);
		contentPane.add(rotuloNome);

		JLabel rotuloBuscar = new JLabel("Buscar");
		rotuloBuscar.setBounds(231, 11, 46, 14);
		contentPane.add(rotuloBuscar);

		campoNome = new JTextField();
		campoNome.setBounds(65, 52, 168, 20);
		contentPane.add(campoNome);
		campoNome.setColumns(10);

		JButton botaoConfirmar = new JButton("Confirmar");
		botaoConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				RepositorioItem rep = new RepositorioItem();
				rep.getListasObjetos();
				BuscaRepositorioPorTexto btx = new BuscaRepositorioPorTexto();
					
				areaProduto.setText( btx.buscaPorNome(campoNome.getText(), rep));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Produto não Encontrado!");
				}
				campoNome.setText("");
				
			}
		});
		botaoConfirmar.setBounds(62, 380, 103, 23);
		contentPane.add(botaoConfirmar);

	}
}
