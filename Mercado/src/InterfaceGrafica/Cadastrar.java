package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Sistema.Item;
import Sistema.RepositorioItem;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class Cadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField codItem;
	private JTextField nomeItem;
	private JLabel rotuloCodigo;
	private JTextField valorItem;
	private JTextField dataCadastroItem;
	private JTextField quantidadeEstoqueItem;
	private JLabel lblNewLabel;
	private JLabel lblData;
	private JLabel lblQuantidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar frame = new Cadastrar();
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
	public Cadastrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton botaoConfirmar = new JButton("Confirmar");
		botaoConfirmar.setBounds(105, 230, 103, 20);
		botaoConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				Item i = new Item();
				i.setCodigo(Integer.parseInt(codItem.getText()));
				i.setNome(nomeItem.getText());
				i.setValorUnitario(Double.parseDouble(valorItem.getText()));
				i.setDataCadastro(dataCadastroItem.getText());
				i.setQtddEstoque(Integer.parseInt(quantidadeEstoqueItem.getText()));
				RepositorioItem rep = new RepositorioItem();
				rep.addItem(i);
				JOptionPane.showMessageDialog(null, "Produto Cadastrado");
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Insira os Valores!");
				}
				codItem.setText("");
				nomeItem.setText("");
				valorItem.setText("");
				dataCadastroItem.setText("");
				quantidadeEstoqueItem.setText("");
			}
		});
		contentPane.add(botaoConfirmar);
		
		rotuloCodigo = new JLabel("C\u00F3digo:");
		rotuloCodigo.setBounds(10, 40, 46, 14);
		contentPane.add(rotuloCodigo);
		
		JLabel lblInsiraOsValores = new JLabel("Inserir");
		lblInsiraOsValores.setBounds(186, 0, 46, 14);
		contentPane.add(lblInsiraOsValores);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 71, 46, 14);
		contentPane.add(lblNome);
		
		codItem = new JTextField();
		codItem.setBounds(90, 37, 334, 20);
		contentPane.add(codItem);
		codItem.setColumns(10);
		
		nomeItem = new JTextField();
		nomeItem.setBounds(90, 68, 334, 20);
		contentPane.add(nomeItem);
		nomeItem.setColumns(10);
		
		valorItem = new JTextField();
		valorItem.setBounds(90, 99, 334, 20);
		contentPane.add(valorItem);
		valorItem.setColumns(10);
		
		dataCadastroItem = new JTextField();
		dataCadastroItem.setBounds(90, 130, 334, 20);
		contentPane.add(dataCadastroItem);
		dataCadastroItem.setColumns(10);
		
		quantidadeEstoqueItem = new JTextField();
		quantidadeEstoqueItem.setBounds(90, 161, 334, 20);
		contentPane.add(quantidadeEstoqueItem);
		quantidadeEstoqueItem.setColumns(10);
		
		lblNewLabel = new JLabel("Valor Unit\u00E1rio:");
		lblNewLabel.setBounds(10, 102, 80, 14);
		contentPane.add(lblNewLabel);
		
		lblData = new JLabel("Data:");
		lblData.setBounds(10, 133, 46, 14);
		contentPane.add(lblData);
		
		lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(10, 164, 71, 14);
		contentPane.add(lblQuantidade);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			dispose();
			}
		});
		botaoVoltar.setBounds(277, 229, 103, 23);
		contentPane.add(botaoVoltar);
		
		
		
		
	}
}
