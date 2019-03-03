package Sistema;

public class BuscaRepositorioPorNumero {
	public String buscaPorQuantidadeEstoque(int qtdInicio, int qtdFim, RepositorioItem rs) {
		int i;
		String str = "";
		Item buscado = null;
		for (i = 0; i < rs.listaItem.size(); i++) {
			int qtdCadastrada = rs.listaItem.get(i).getQtddEstoque();
			if (qtdInicio <= qtdCadastrada && qtdCadastrada <= qtdFim) {
				buscado = rs.listaItem.get(i);
				str += "\n" + buscado.toString();
			}

		}
		return str;
	}

	public String buscaPorCodigo(int codigo, RepositorioItem rs) {
		int i;
		Item buscado = null;
		for (i = 0; i < rs.listaItem.size(); i++) {
			if (codigo == rs.listaItem.get(i).getCodigo())
				buscado = rs.listaItem.get(i);
		}
		String str = "";
		return str = "" + buscado.toString();
	}

}
