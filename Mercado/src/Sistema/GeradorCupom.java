package Sistema;

import java.util.Calendar;

import java.util.Vector;

public class GeradorCupom {
	public String imprimirNota(CupomFiscal cf){
		Calendar data = Calendar.getInstance();
		String cupom = "";
		cupom += "\t" + cf.nomeLoja + "\n";
		cupom += "\tCNPJ: " + cf.cnpj + "\n";
		cupom += "\t" + data.get(Calendar.DAY_OF_MONTH) + "/" + (data.get(Calendar.MONTH) + 1) + "/"
				+ data.get(Calendar.YEAR) + " " + data.get(Calendar.HOUR_OF_DAY) + ":" + data.get(Calendar.MINUTE) + ":"
				+ data.get(Calendar.SECOND) + "\n";
		cupom += "----------------------------------------" + "\n";
		if (cf.cpfConsumidor != null) {
			cupom += "CNPJ/CPF consumidor: " + cf.cpfConsumidor + "\n";
		} else
			cupom += "CNPJ/CPF consumidor: " + cf.cnpjConsumidor + "\n";
		cupom += "----------------------------------------" + "\n";
		cupom += "         CUPOM FISCAL" + "\n";
		cupom += "\nITEM" + "        CODIGO         DESCRIÇÂO" + "\n          QTDxUNITARIO        VALOR(R$)" + "\n";
		cupom += "========================================" + "\n";
		int i;
		Item it = new ItemVendido();
		for (i = 0; i < cf.listaItem.size(); i++) {
			cupom += "" + (i + 1) + "                " + cf.listaItem.get(i).getNome() + "\n                 " + ""
					+ cf.listaItem.get(i).getQtddVendida() + "x" + cf.listaItem.get(i).getValorUnitario()
					+ "                           " + it.calculoValorTotal(cf.listaItem.get(i)) + "\n";
		}
		cupom += "TOTAL R$                                     " + cf.totalAPagar(cf.listaItem) + "\n";
		System.out.println(cf.totalPago);
		cupom += "----------------------------------------\n\n" + "\n";
		return cupom;
	}
	
	public String imprimirNotaFinal(CupomFiscal cf) throws DinheiroRecebidoMenorException {
		Calendar data = Calendar.getInstance();
		String cupom = "";
		cupom += "\t" + cf.nomeLoja + "\n";
		cupom += "\tCNPJ: " + cf.cnpj + "\n";
		cupom += "\t" + data.get(Calendar.DAY_OF_MONTH) + "/" + (data.get(Calendar.MONTH) + 1) + "/"
				+ data.get(Calendar.YEAR) + " " + data.get(Calendar.HOUR_OF_DAY) + ":" + data.get(Calendar.MINUTE) + ":"
				+ data.get(Calendar.SECOND) + "\n";
		cupom += "----------------------------------------" + "\n";
		if (cf.cpfConsumidor != null) {
			cupom += "CNPJ/CPF consumidor: " + cf.cpfConsumidor + "\n";
		} else
			cupom += "CNPJ/CPF consumidor: " + cf.cnpjConsumidor + "\n";
		cupom += "----------------------------------------" + "\n";
		cupom += "         CUPOM FISCAL" + "\n";
		cupom += "\nITEM" + "        CODIGO         DESCRIÇÂO" + "\n          QTDxUNITARIO        VALOR(R$)" + "\n";
		cupom += "========================================" + "\n";
		int i;
		Item it = new ItemVendido();
		for (i = 0; i < cf.listaItem.size(); i++) {
			cupom += "" + (i + 1) + "                " + cf.listaItem.get(i).getNome() + "\n                 " + ""
					+ cf.listaItem.get(i).getQtddVendida() + "x" + cf.listaItem.get(i).getValorUnitario()
					+ "                           " + it.calculoValorTotal(cf.listaItem.get(i)) + "\n";
		}
		cupom += "TOTAL R$                                     " + cf.totalAPagar(cf.listaItem) + "\n";
		cupom += "----------------------------------------" + "\n";
		cupom += "\nVALOR RECEBIDO R$                " + cf.dinheiroRecebido + "\n";
		cupom += "TROCO R$                                   " + cf.calculaTroco(cf.dinheiroRecebido) + "\n";
		cupom += "----------------------------------------\n\n" + "\n";

		return cupom;
	}

	public void imprimirNota(Vector<CupomFiscal> cf) throws DinheiroRecebidoMenorException {
		int i;
		for (i = 0; i < cf.size(); i++) {
			if (cf.get(i) != null)
				imprimirNota(cf.get(i));

		}
	}
}
