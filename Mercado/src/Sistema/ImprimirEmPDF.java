package Sistema;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ImprimirEmPDF {

	public String imprimirEstoqueItens(RepositorioItem rs) {
		int i;
		String str = "";
		/*System.out.println("---------ITENS(QUANTIDADE EM ESTOQUE)----------");*/
		for (i = 0; i < rs.listaItem.size(); i++) {
			str += "Nome: " + rs.getItem(i).getNome() + "\nQuantidade em estoque: "
					+ rs.getItem(i).getQtddEstoque() + "\n\n";
		}
		return str;
	}

	public String imprimirValorMaisAlto(RepositorioItem rs) {
		int i;
		String str = "";
		Item valorMaisAlto = new Item();
		valorMaisAlto.setValorUnitario(0.0);
		for (i = 0; i < rs.listaItem.size(); i++) {
			if (rs.getItem(i).getValorUnitario() > valorMaisAlto.getValorUnitario())
				valorMaisAlto = rs.getItem(i);
		}
		str +=""+ valorMaisAlto.toString();
		return str;
	}

	public String imprimirItemMaiorQuantidade(RepositorioItem rs) {
		int i;
		String str = null;
		Item maiorEstoque = new Item();
		maiorEstoque.setQtddEstoque(0);
	/*	System.out.println("---------ITENS COM MAIOR QUANTIDADE EM ESTOQUE----------");*/
		for (i = 0; i < rs.listaItem.size(); i++) {
			if (rs.getItem(i).getQtddEstoque() > maiorEstoque.getQtddEstoque())
				maiorEstoque = rs.getItem(i);
		}
		str =""+ maiorEstoque.toString();
		return str;
	}

	public String imprimirMaisNovoVelhoEstoque(RepositorioItem rs) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String data = dateFormat.format(date);

		int i;
		String str = "";
		Item novo = new Item();
		Item velho = new Item();
		BuscaRepositorioPorData transforma = new BuscaRepositorioPorData();

		int dataNovoEmDias = transforma.tranformaDataEmInteiro(data);
		int dataVelhoEmDias = transforma.tranformaDataEmInteiro("01/01/1990");

	/*	System.out.println("---------ITEN MAIS NOVO E MAIS VELHO----------");*/
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
		str +="\nPRODUTO MAIS VELHO\n";
		str +="" + novo.toString();
		str +="\nPRODUTO MAIS NOVO\n";
		str +="" + velho.toString();
		
		return str;
	}

}
