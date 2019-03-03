package Sistema;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ImprimirEmCSV {

	public void imprimirEstoqueItens(RepositorioItem rs) {
		int i;
		System.out.println("---------ITENS(QUANTIDADE EM ESTOQUE)----------");
		for (i = 0; i < rs.listaItem.size(); i++) {
			System.out.println("Nome: " + rs.getItem(i).getNome() + "\nQuantidade em estoque: "
					+ rs.getItem(i).getQtddEstoque() + "\n");
		}
	}

	public void imprimirValorMaisAlto(RepositorioItem rs) {
		int i;
		Item valorMaisAlto = new Item();
		valorMaisAlto.setValorUnitario(0.0);
		System.out.println("---------ITENS COM VALOR MAIS ALTO----------");
		for (i = 0; i < rs.listaItem.size(); i++) {
			if (rs.getItem(i).getValorUnitario() > valorMaisAlto.getValorUnitario())
				valorMaisAlto = rs.getItem(i);
		}
		System.out.println("" + valorMaisAlto.toString());
	}

	public void imprimirItemMaiorQuantidade(RepositorioItem rs) {
		int i;
		Item maiorEstoque = new Item();
		maiorEstoque.setQtddEstoque(0);
		System.out.println("---------ITENS COM MAIOR QUANTIDADE EM ESTOQUE----------");
		for (i = 0; i < rs.listaItem.size(); i++) {
			if (rs.getItem(i).getQtddEstoque() > maiorEstoque.getQtddEstoque())
				maiorEstoque = rs.getItem(i);
		}
		System.out.println("" + maiorEstoque.toString());
	}

	public void imprimirMaisNovoVelhoEstoque(RepositorioItem rs) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String data = dateFormat.format(date);

		int i;
		Item novo = new Item();
		Item velho = new Item();
		BuscaRepositorioPorData transforma = new BuscaRepositorioPorData();

		int dataNovoEmDias = transforma.tranformaDataEmInteiro(data);
		int dataVelhoEmDias = transforma.tranformaDataEmInteiro("01/01/1990");

		System.out.println("---------ITEN MAIS NOVO E MAIS VELHO----------");
		for (i = 0; i < rs.listaItem.size(); i++) {
			int dataCadastrada = transforma.tranformaDataEmInteiro(rs.listaItem.get(i).getDataCadastro());
			if (dataNovoEmDias >= dataCadastrada) {
				novo = rs.listaItem.get(i);
				dataNovoEmDias = transforma.tranformaDataEmInteiro(rs.listaItem.get(i).getDataCadastro());
			}
			if (dataVelhoEmDias <= dataCadastrada) {
				velho = rs.listaItem.get(i);
				dataVelhoEmDias = transforma.tranformaDataEmInteiro(rs.listaItem.get(i).getDataCadastro());
			}
		}
		System.out.println("\n---NOVO---");
		System.out.println("" + novo.toString());
		System.out.println("\n---VELHO---");
		System.out.println("" + velho.toString());
	}
	}


