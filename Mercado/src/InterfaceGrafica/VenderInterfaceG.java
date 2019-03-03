package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itextpdf.text.pdf.richmedia.CuePoint;

import Sistema.CupomFiscal;
import Sistema.DinheiroRecebidoMenorException;
import Sistema.GeradorCupom;
import Sistema.Item;
import Sistema.ItemVendido;
import Sistema.RepositorioItem;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;

public class VenderInterfaceG extends JFrame {

	private JPanel contentPane;
	private JTextField campoCpf_cnpj;
	private JTextField campoCodigo;
	CupomFiscal cf = new CupomFiscal();
	private JTextField campoValorPago;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VenderInterfaceG frame = new VenderInterfaceG();
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
	public VenderInterfaceG() /* throws DinheiroRecebidoMenorException */ {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton botaoConfirmarCompra = new JButton("Confirmar");
		botaoConfirmarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CupomFiscal cf = new CupomFiscal();

				/*
				 * String cpf_cnpj = campoCpf_cnpj.getText(); if
				 * (cpf_cnpj.length() < 14) {
				 * JOptionPane.showMessageDialog(null,
				 * "Digite o CPNJ ou CPF conforme o solicitado!"); } else if
				 * (cpf_cnpj.length() == 14) { cf.cpfConsumidor = cpf_cnpj; }
				 * else if (cpf_cnpj.length() > 14 && cpf_cnpj.length() < 18) {
				 * JOptionPane.showMessageDialog(null,
				 * "Digite o CPNJ ou CPF conforme o solicitado!"); } else if
				 * (cpf_cnpj.length() == 18) { cf.cnpjConsumidor = cpf_cnpj; }
				 * else { JOptionPane.showMessageDialog(null,
				 * "Digite o CPNJ ou CPF conforme o solicitado!"); }
				 */

				JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");

			}
		});
		botaoConfirmarCompra.setBounds(72, 407, 100, 23);
		contentPane.add(botaoConfirmarCompra);

		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		botaoVoltar.setBounds(227, 407, 100, 23);
		contentPane.add(botaoVoltar);

		campoCpf_cnpj = new JTextField();
		campoCpf_cnpj.setBounds(72, 24, 192, 20);
		contentPane.add(campoCpf_cnpj);
		campoCpf_cnpj.setColumns(10);

		JLabel rotuloCpfCnpj = new JLabel("CNPJ/CPF:");
		rotuloCpfCnpj.setBounds(10, 24, 64, 14);
		contentPane.add(rotuloCpfCnpj);

		JLabel rotuloCliente = new JLabel("Cliente");
		rotuloCliente.setBounds(115, 0, 46, 14);
		contentPane.add(rotuloCliente);

		JTextArea txtrObsDigiteincluindo = new JTextArea();
		txtrObsDigiteincluindo.setText(
				"OBS: Digite o CPF com \r\n14 digitos ou CNPJ com 18 digitos\r\n(incluindo pontos, barra e  h\u00EDfen)");
		txtrObsDigiteincluindo.setBounds(10, 338, 414, 58);
		contentPane.add(txtrObsDigiteincluindo);

		JLabel rotuloProdutos = new JLabel("Produtos");
		rotuloProdutos.setBounds(115, 55, 57, 14);
		contentPane.add(rotuloProdutos);

		campoCodigo = new JTextField();
		campoCodigo.setBounds(52, 97, 37, 20);
		contentPane.add(campoCodigo);
		campoCodigo.setColumns(10);

		JLabel rotuloCodigo = new JLabel("C\u00F3digo:");
		rotuloCodigo.setBounds(10, 100, 46, 14);
		contentPane.add(rotuloCodigo);

		JTextArea areaCupom = new JTextArea();
		areaCupom.setWrapStyleWord(true);
		areaCupom.setBounds(280, 22, 290, 302);
		contentPane.add(areaCupom);

		JLabel rotuloPagamento = new JLabel("Pagamento");
		rotuloPagamento.setBounds(115, 174, 74, 14);
		contentPane.add(rotuloPagamento);

		JLabel rotuloValorPago = new JLabel("Valor Pago R$:");
		rotuloValorPago.setBounds(10, 225, 93, 14);
		contentPane.add(rotuloValorPago);

		campoValorPago = new JTextField();
		campoValorPago.setBounds(99, 222, 86, 20);
		contentPane.add(campoValorPago);
		campoValorPago.setColumns(10);

		JSpinner spinnerQuantidade = new JSpinner();
		spinnerQuantidade.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerQuantidade.setBounds(127, 97, 45, 20);
		contentPane.add(spinnerQuantidade);

		JLabel rotuloQuantidade = new JLabel("Qtd:");
		rotuloQuantidade.setBounds(99, 100, 29, 14);
		contentPane.add(rotuloQuantidade);

		JButton botaoInserirPorCodigo = new JButton("Inserir");
		botaoInserirPorCodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int codigoRecebido = Integer.parseInt(campoCodigo.getText());
				RepositorioItem rep = new RepositorioItem();

				for (int i = 0; i < rep.getListasObjetos().size(); i++) {
					if (codigoRecebido == rep.getListasObjetos().get(i).getCodigo()) {
						// Item itemVe = new ItemVendido();
						Item itemVe = rep.getListasObjetos().get(i) instanceof Item
								? new ItemVendido(rep.getListasObjetos().get(i)) : rep.getListasObjetos().get(i);

						int qtdVendida = Integer.parseInt(spinnerQuantidade.getValue().toString());
						((ItemVendido) itemVe).setQtddVendida(qtdVendida);

						cf.listaItem.add((ItemVendido) itemVe);
					}
				}
				
				/*
				try {
					double valorPago = Double.parseDouble(campoValorPago.getText());
					cf.dinheiroRecebido = valorPago;
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Informe o valo a ser pago!");

				}
				*/
				String cpf_cnpj = campoCpf_cnpj.getText();
				if (cpf_cnpj.length() < 14) {
					JOptionPane.showMessageDialog(null, "Digite o CPNJ ou CPF conforme o solicitado!");
				} else if (cpf_cnpj.length() == 14) {
					cf.cpfConsumidor = cpf_cnpj;
				} else if (cpf_cnpj.length() > 14 && cpf_cnpj.length() < 18) {
					JOptionPane.showMessageDialog(null, "Digite o CPNJ ou CPF conforme o solicitado!");
				} else if (cpf_cnpj.length() == 18) {
					cf.cnpjConsumidor = cpf_cnpj;
				} else {
					JOptionPane.showMessageDialog(null, "Digite o CPNJ ou CPF conforme o solicitado!");
				}
				areaCupom.setText(new GeradorCupom().imprimirNota(cf));

				
				
				/*
				 * try { areaCupom.setText(new GeradorCupom().imprimirNota(cf));
				 * } catch (DinheiroRecebidoMenorException e) {
				 * JOptionPane.showMessageDialog(null,
				 * "Valor Recebido Inferior ao Total!\nInforme um valor valido!"
				 * ); }
				 */
				campoCodigo.setText("");
			}
		});
		botaoInserirPorCodigo.setBounds(175, 96, 89, 23);
		contentPane.add(botaoInserirPorCodigo);

		JButton botaoPagar = new JButton("Pagar");
		botaoPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String cpf_cnpj = campoCpf_cnpj.getText();
				if (cpf_cnpj.length() < 14) {
					JOptionPane.showMessageDialog(null, "Digite o CPNJ ou CPF conforme o solicitado!");
				} else if (cpf_cnpj.length() == 14) {
					cf.cpfConsumidor = cpf_cnpj;
				} else if (cpf_cnpj.length() > 14 && cpf_cnpj.length() < 18) {
					JOptionPane.showMessageDialog(null, "Digite o CPNJ ou CPF conforme o solicitado!");
				} else if (cpf_cnpj.length() == 18) {
					cf.cnpjConsumidor = cpf_cnpj;
				} else {
					JOptionPane.showMessageDialog(null, "Digite o CPNJ ou CPF conforme o solicitado!");
				}
				try {
					double valorPago = Double.parseDouble(campoValorPago.getText());
					cf.dinheiroRecebido = valorPago;
					areaCupom.setText(new GeradorCupom().imprimirNotaFinal(cf));
				} catch (DinheiroRecebidoMenorException e) {
					JOptionPane.showMessageDialog(null, "Valor Recebido Inferior ao Total!\nInforme um valor valido!");
				}
				
			}
		});
		botaoPagar.setBounds(96, 267, 89, 23);
		contentPane.add(botaoPagar);
		
		JScrollPane scrollPane = new JScrollPane(areaCupom);
		scrollPane.setBounds(280, 22, 290, 302);
		contentPane.add(scrollPane);

	}
}
