package Sistema;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.*;
public class App {
	
	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String data= dateFormat.format(date);	
		
		
		ItemVendido it = new ItemVendido(001, "sabao", 1.80, "01/01/1991", 10, 2);
		ItemVendido it1 = new ItemVendido(002, "limao", 0.80, data, 50, 2);
		ItemVendido it2 = new ItemVendido(003, "Biscoito", 4.80, "30/07/2016", 300, 2);

		RepositorioItem rs = new RepositorioItem();
		rs.addItem(it);
		rs.addItem(it1);
		rs.addItem(it2);
		System.out.println("\n"+rs.getListasObjetos());
		ArrayList<ItemVendido> listaItem = new ArrayList<>();

		CupomFiscal cf = new CupomFiscal("046.000.000-36", 12.00, listaItem);
		cf.listaItem.add(it);
		cf.listaItem.add(it1);
		GeradorCupom gc = new GeradorCupom();
		System.out.println(""+gc.imprimirNota(cf));
		BuscaRepositorioPorTexto bt = new BuscaRepositorioPorTexto();
		
		
		try{
			System.out.println("--------BUSCA POR TEXTO--------");
			bt.buscaPorNome("sabao",rs);
			bt.buscaPorNome("lima",rs);
		}catch(Exception e){
			System.out.println("Erro: Produto n�o Cadastrado: "+e);
		}
		System.out.println("--------BUSCA POR NUMERO--------");
		BuscaRepositorioPorNumero bn= new BuscaRepositorioPorNumero();
		System.out.println("\n---CODIGO---");
		bn.buscaPorCodigo(002,rs);
		System.out.println("\n---QTTD EM ESTOQUE---");
		bn.buscaPorQuantidadeEstoque(10, 50, rs);
		
		System.out.println("--------BUSCA POR DATA--------");
		BuscaRepositorioPorData bdt = new BuscaRepositorioPorData();
		bdt.buscaPorData("01/01/1991", "01/08/2016", rs);
		
		imprimirEmInterface imp = new imprimirEmInterface();
		imp.imprimirEstoqueItens(rs);
		imp.imprimirValorMaisAlto(rs);
		imp.imprimirItemMaiorQuantidade(rs);
		imp.imprimirMaisNovoVelhoEstoque(rs);
	}
}

