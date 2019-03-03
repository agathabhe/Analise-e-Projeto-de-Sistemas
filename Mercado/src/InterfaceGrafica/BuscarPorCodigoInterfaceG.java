package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Sistema.BuscaRepositorioPorNumero;
import Sistema.BuscaRepositorioPorTexto;
import Sistema.RepositorioItem;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuscarPorCodigoInterfaceG extends JFrame {

	private JPanel contentPane;
	private JTextField campoCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarPorCodigoInterfaceG frame = new BuscarPorCodigoInterfaceG();
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
	public BuscarPorCodigoInterfaceG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel rotuloBuscar = new JLabel("Buscar");
		rotuloBuscar.setBounds(187, 0, 46, 14);
		contentPane.add(rotuloBuscar);
		
		JLabel rotuloCodigo = new JLabel("C\u00F3digo:");
		rotuloCodigo.setBounds(22, 58, 46, 14);
		contentPane.add(rotuloCodigo);
		
		campoCodigo = new JTextField();
		campoCodigo.setBounds(78, 55, 86, 20);
		contentPane.add(campoCodigo);
		campoCodigo.setColumns(10);
		
		JTextArea areaProduto = new JTextArea();
		areaProduto.setEditable(false);
		areaProduto.setBounds(214, 26, 210, 312);
		contentPane.add(areaProduto);
		
		JButton botaoConfirmar = new JButton("Confirmar");
		botaoConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					RepositorioItem rep = new RepositorioItem();
					rep.getListasObjetos();
					BuscaRepositorioPorNumero bco = new BuscaRepositorioPorNumero();
					int codigo= Integer.parseInt(campoCodigo.getText());	
					areaProduto.setText(bco.buscaPorCodigo(codigo, rep));
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "Produto não Encontrado!");
					}
				campoCodigo.setText("");
			}
		});
		botaoConfirmar.setBounds(47, 415, 100, 23);
		contentPane.add(botaoConfirmar);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			dispose();
			}
		});
		botaoVoltar.setBounds(249, 415, 100, 23);
		contentPane.add(botaoVoltar);
	}
}
