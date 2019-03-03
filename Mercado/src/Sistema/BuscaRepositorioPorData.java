package Sistema;

public class BuscaRepositorioPorData {

	public String buscaPorData(String dataInicio, String dataFim, RepositorioItem rs) {

		int dataInicioDias = tranformaDataEmInteiro(dataInicio);
		int dataFimDias = tranformaDataEmInteiro(dataFim);

		// System.out.println("Data Total: "+dataInicioDias);
		int i;
		Item buscado = null;
		String str = "";
		for (i = 0; i < rs.listaItem.size(); i++) {
			int dataCadastrada = tranformaDataEmInteiro(rs.listaItem.get(i).getDataCadastro());
			if (dataInicioDias <= dataCadastrada && dataCadastrada <= dataFimDias) {
				buscado = rs.listaItem.get(i);
				str += "\n" + buscado.toString();
			}
		}
		return str;
	}

	public int tranformaDataEmInteiro(String data) {
		String diastr[] = new String(data).split("/");
		String messtr[] = new String(data).split("/");
		String anostr[] = new String(data).split("/");
		int dia = Integer.parseInt(diastr[0]);
		int mes = Integer.parseInt(messtr[1]);
		int ano = Integer.parseInt(anostr[2]);

		int dataTotalDias = transformaDataDias(dia, mes, ano);
		return dataTotalDias;
	}

	public int transformaDataDias(int dia, int mes, int ano) {
		int totalDia = (dia + mes * 30 + ano * 365);
		return totalDia;
	} 

}
