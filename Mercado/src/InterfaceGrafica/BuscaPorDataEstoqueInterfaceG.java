package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Sistema.BuscaRepositorioPorData;
import Sistema.BuscaRepositorioPorNumero;
import Sistema.RepositorioItem;

public class BuscaPorDataEstoqueInterfaceG extends JFrame {

	private JPanel contentPane;
	private JTextField campoData1;
	private JTextField campoData2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscaPorDataEstoqueInterfaceG frame = new BuscaPorDataEstoqueInterfaceG();
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
	public BuscaPorDataEstoqueInterfaceG() {
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
		areaProduto.setBounds(230, 30, 194, 323);
		contentPane.add(areaProduto);

		JButton botaoConfirmar = new JButton("Confirmar");
		botaoConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					RepositorioItem rep = new RepositorioItem();
					rep.getListasObjetos();
					BuscaRepositorioPorData bDt = new BuscaRepositorioPorData();
					String data1 =  campoData1.getText();
					String data2 = campoData2.getText();
					areaProduto.setText(bDt.buscaPorData(data1, data2, rep));
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Produto não Encontrado!");
				}
				campoData1.setText("");
				campoData2.setText("");
			}
		});
		botaoConfirmar.setBounds(49, 415, 98, 23);
		contentPane.add(botaoConfirmar);

		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		botaoVoltar.setBounds(245, 415, 98, 23);
		contentPane.add(botaoVoltar);

		JLabel rotuloDataDe = new JLabel("De:");
		rotuloDataDe.setBounds(22, 71, 46, 14);
		contentPane.add(rotuloDataDe);

		JLabel rotuloData = new JLabel("Data");
		rotuloData.setBounds(92, 35, 81, 14);
		contentPane.add(rotuloData);

		JLabel rotuloDataAte = new JLabel("At\u00E9:");
		rotuloDataAte.setBounds(22, 115, 46, 14);
		contentPane.add(rotuloDataAte);

		
		campoData1 = new JTextField();
		campoData1.setBounds(71, 68, 86, 20);
		contentPane.add(campoData1);
		campoData1.setColumns(10);
		
		campoData2 = new JTextField();
		campoData2.setBounds(71, 112, 86, 20);
		contentPane.add(campoData2);
		campoData2.setColumns(10);
		
		JScrollPane barra = new JScrollPane(areaProduto);
		barra.setBounds(230, 30, 194, 323);
		contentPane.add(barra);
	}

}
