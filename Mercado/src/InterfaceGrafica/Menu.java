package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Sistema.BuscaRepositorioPorData;
import Sistema.ImprimirEmPDF;
import Sistema.RepositorioItem;
import Sistema.imprimirEmInterface;

import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.LineNumberInputStream;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.JLabel;
import java.awt.Color;

public class Menu extends JFrame {
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		getContentPane().setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuProdutos = new JMenu("Produtos");
		menuBar.add(menuProdutos);

		JMenuItem submenuCadastrar = new JMenuItem("Cadastrar");
		submenuCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cadastrar cadast = new Cadastrar();
				cadast.setVisible(true);
			}
		});
		menuProdutos.add(submenuCadastrar);

		JMenuItem submenuVender = new JMenuItem("Vender");
		submenuVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VenderInterfaceG vender = new VenderInterfaceG();
				vender.setVisible(true);

			}
		});
		menuProdutos.add(submenuVender);

		JMenuItem submenuTamanhoLista = new JMenuItem("Quantidade de Produtos Cadastrados");
		submenuTamanhoLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RepositorioItem rep = new RepositorioItem();
				JOptionPane.showMessageDialog(null, rep.getTamanhoLista() + " Produtos Cadastrados");
			}
		});
		menuProdutos.add(submenuTamanhoLista);

		JMenu menu = new JMenu("");
		menuBar.add(menu);

		JMenu mnBuscar = new JMenu("Buscar");
		menuBar.add(mnBuscar);

		JMenuItem submenuBuscarPorTexto = new JMenuItem("Buscar por nome");
		submenuBuscarPorTexto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BuscarTextoInterfaceG bus = new BuscarTextoInterfaceG();
				bus.setVisible(true);

			}
		});
		mnBuscar.add(submenuBuscarPorTexto);

		JMenuItem submenuBuscarPorCodigo = new JMenuItem("Buscar por C\u00F3digo");
		submenuBuscarPorCodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BuscarPorCodigoInterfaceG bus = new BuscarPorCodigoInterfaceG();
				bus.setVisible(true);
			}
		});
		mnBuscar.add(submenuBuscarPorCodigo);

		JMenuItem submenuBuscarPorQtddEstoque = new JMenuItem("Buscar por Estoque");
		submenuBuscarPorQtddEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscaPorQttdEstoqueInterfaceG bus = new BuscaPorQttdEstoqueInterfaceG();
				bus.setVisible(true);
			}
		});
		mnBuscar.add(submenuBuscarPorQtddEstoque);

		JMenuItem submenuBuscarPorData = new JMenuItem("Buscar por Data(Casdatro)");
		submenuBuscarPorData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscaPorDataEstoqueInterfaceG bus = new BuscaPorDataEstoqueInterfaceG();
				bus.setVisible(true);
			}
		});
		mnBuscar.add(submenuBuscarPorData);

		JMenu menuMostrar = new JMenu("Mostrar");
		menuBar.add(menuMostrar);

		JMenuItem subMenuDadosEstoque = new JMenuItem("Produtos(Estoque)");
		subMenuDadosEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProdutoEEstoqueInterfaceG pe = new ProdutoEEstoqueInterfaceG();
				pe.setVisible(true);
			}
		});
		menuMostrar.add(subMenuDadosEstoque);

		JMenuItem subMenuValorAlto = new JMenuItem("Produto com Valor Mais Alto");
		subMenuValorAlto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					RepositorioItem rep = new RepositorioItem();
					rep.getListasObjetos();
					imprimirEmInterface imp = new imprimirEmInterface();
					JOptionPane.showMessageDialog(null, imp.imprimirValorMaisAlto(rep));
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Nenhum Produto Cadastrado!");
				}
			}
		});
		menuMostrar.add(subMenuValorAlto);

		JMenuItem subMenuMaiorQtd = new JMenuItem("Produto em Maior Quantidade");
		subMenuMaiorQtd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				RepositorioItem rep = new RepositorioItem();
				rep.getListasObjetos();
				imprimirEmInterface imp = new imprimirEmInterface();
				if (imp.imprimirItemMaiorQuantidade(rep) == null)
					JOptionPane.showMessageDialog(null, "Nenhum Produto Cadastrado!");
				else
					JOptionPane.showMessageDialog(null, imp.imprimirItemMaiorQuantidade(rep));

			}
		});
		menuMostrar.add(subMenuMaiorQtd);

		JMenuItem subMenuProdutoNovoVelho = new JMenuItem("Produto mais Novo e mais Velho");
		subMenuProdutoNovoVelho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RepositorioItem rep = new RepositorioItem();
				rep.getListasObjetos();
				imprimirEmInterface imp = new imprimirEmInterface();
				JOptionPane.showMessageDialog(null, imp.imprimirMaisNovoVelhoEstoque(rep));
			}
		});
		menuMostrar.add(subMenuProdutoNovoVelho);

		JMenu menuGerarPdf = new JMenu("Gerar PDF");
		menuBar.add(menuGerarPdf);

		JMenuItem subMenuDadosEstoquePDF = new JMenuItem("Produtos(Estoque)");
		subMenuDadosEstoquePDF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Document document = new Document();
				ImprimirEmPDF imp = new ImprimirEmPDF();
				RepositorioItem rep = new RepositorioItem();
				String str = imp.imprimirEstoqueItens(rep);
				try {

					PdfWriter.getInstance(document,
							new FileOutputStream("C:\\Users\\alan-\\Desktop\\DadosEstoque.pdf"));
					document.open();
					// adicionando um parágrafo no documento
					document.add(new Paragraph("Produtos cadastrados e seus estoques\n"+str));
					JOptionPane.showMessageDialog(null, "Arquivo em PDF gerado com sucesso!");
					
				} catch (DocumentException de) {
					JOptionPane.showMessageDialog(null, "Erro ao gerar PDF!");
					//System.err.println(de.getMessage());
				} catch (IOException ioe) {
					JOptionPane.showMessageDialog(null, "Erro ao gerar PDF!");
					//System.err.println(ioe.getMessage());
				}
				try{
				document.close();
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Erro ao gerar PDF! Nenhum produto encontrado!");
				}
			}

		});
		menuGerarPdf.add(subMenuDadosEstoquePDF);

		JMenuItem subMenuValorAltoPDF = new JMenuItem("Produto com Valor Mais Alto");
		subMenuValorAltoPDF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Document document = new Document();
				ImprimirEmPDF imp = new ImprimirEmPDF();
				RepositorioItem rep = new RepositorioItem();
				String str = imp.imprimirValorMaisAlto(rep);
				try {

					PdfWriter.getInstance(document,new FileOutputStream("C:\\Users\\alan-\\Desktop\\ProdutoComValorMaisAlto.pdf"));
					document.open();
					// adicionando um parágrafo no documento
					document.add(new Paragraph("Produto com valor mais alto \n"+str));
					JOptionPane.showMessageDialog(null, "Arquivo em PDF gerado com sucesso!");
					
				} catch (DocumentException de) {
					JOptionPane.showMessageDialog(null, "Erro ao gerar PDF!");
					//System.err.println(de.getMessage());
				} catch (IOException ioe) {
					JOptionPane.showMessageDialog(null, "Erro ao gerar PDF!");
					//System.err.println(ioe.getMessage());
				}
				try{
				document.close();
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Erro ao gerar PDF! Nenhum produto encontrado!");
				}
			}
			
		});menuGerarPdf.add(subMenuValorAltoPDF);

	JMenuItem subMenuMaiorQtdPDF = new JMenuItem("Produto em Maior Quantidade");
	subMenuMaiorQtdPDF.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Document document = new Document();
			ImprimirEmPDF imp = new ImprimirEmPDF();
			RepositorioItem rep = new RepositorioItem();
			String str = imp.imprimirItemMaiorQuantidade(rep);
			try {

				PdfWriter.getInstance(document,new FileOutputStream("C:\\Users\\alan-\\Desktop\\ProdutoComMaiorEstoque.pdf"));
				document.open();
				// adicionando um parágrafo no documento
				document.add(new Paragraph("Produto com maior estoque\n"+str));
				JOptionPane.showMessageDialog(null, "Arquivo em PDF gerado com sucesso!");
				
			} catch (DocumentException de) {
				JOptionPane.showMessageDialog(null, "Erro ao gerar PDF!");
				//System.err.println(de.getMessage());
			} catch (IOException ioe) {
				JOptionPane.showMessageDialog(null, "Erro ao gerar PDF!");
				//System.err.println(ioe.getMessage());
			}
			try{
			document.close();
			}catch(Exception ex){
				JOptionPane.showMessageDialog(null, "Erro ao gerar PDF! Nenhum produto encontrado!");
			}
		}
	});menuGerarPdf.add(subMenuMaiorQtdPDF);

	JMenuItem subMenuProdutoNovoVelhoPDF = new JMenuItem(
			"Produto mais Novo e mais Velho");
	subMenuProdutoNovoVelhoPDF.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Document document = new Document();
			ImprimirEmPDF imp = new ImprimirEmPDF();
			RepositorioItem rep = new RepositorioItem();
			String str = imp.imprimirMaisNovoVelhoEstoque(rep);
			try {

				PdfWriter.getInstance(document,new FileOutputStream("C:\\Users\\alan-\\Desktop\\ProdutoMaisNovoEMaisVelho.pdf"));
				document.open();
				// adicionando um parágrafo no documento
				document.add(new Paragraph(str));
				JOptionPane.showMessageDialog(null, "Arquivo em PDF gerado com sucesso!");
				
			} catch (DocumentException de) {
				JOptionPane.showMessageDialog(null, "Erro ao gerar PDF!");
				//System.err.println(de.getMessage());
			} catch (IOException ioe) {
				JOptionPane.showMessageDialog(null, "Erro ao gerar PDF!");
				//System.err.println(ioe.getMessage());
			}
			try{
			document.close();
			}catch(Exception ex){
				JOptionPane.showMessageDialog(null, "Erro ao gerar PDF! Nenhum produto encontrado!");
			}
		}
	});menuGerarPdf.add(subMenuProdutoNovoVelhoPDF);
}

private class SwingAction extends AbstractAction {
	public SwingAction() {
		putValue(NAME, "SwingAction");
		putValue(SHORT_DESCRIPTION, "Some short description");
	}

	public void actionPerformed(ActionEvent e) {
	}
}	
}
