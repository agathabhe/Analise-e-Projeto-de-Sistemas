import java.util.Calendar;

public class Impressora {

	private static Impressora singleton;
	
	private Impressora (){
		
	}
	
	static Impressora getInstance() {
		if (singleton == null)
			singleton = new Impressora();

		return singleton;
	}
	
	public void imprimirNota(CupomFiscal c) {
		double valorTotal = 0;
		Calendar data = Calendar.getInstance();
		String cupom = "";
		cupom += "\t" + c.getNomeLoja() + "\n";
		cupom += "\tCNPJ: " + c.getCnpj() + "\n";
		cupom += "\t" + data.get(Calendar.DAY_OF_MONTH) + "/" + (data.get(Calendar.MONTH) + 1) + "/"
				+ data.get(Calendar.YEAR) + " " + data.get(Calendar.HOUR_OF_DAY) + ":" + data.get(Calendar.MINUTE) + ":"
				+ data.get(Calendar.SECOND) + "\n";
		cupom += "----------------------------------------" + "\n";
		if (c.getCpfConsumidor() != null) {
			cupom += "CNPJ/CPF consumidor: " + c.getCpfConsumidor() + "\n";
		} else
			cupom += "CNPJ/CPF consumidor: " + c.getCnpjConsumidor() + "\n";
		cupom += "----------------------------------------" + "\n";
		cupom += "         CUPOM FISCAL" + "\n";
		cupom += "\nITEM" + "        CODIGO         DESCRIÇÂO" + "\n          QTDxUNITARIO        VALOR(R$)" + "\n";
		cupom += "========================================" + "\n";
		int i;
	
		for (i = 0; i < c.getListaItem().length; i++) {
			cupom += "" + (i + 1) + "                " + c.getListaItem()[i].getNome() + "\n                 " + ""
					+ c.getListaItem()[i].getQuantidade() + "x" + c.getListaItem()[i].getValorUnitario()
					+ "                           " + c.getListaItem()[i].calculoValorTotal() + "\n";
			valorTotal += c.getListaItem()[i].calculoValorTotal(); 
		}
		cupom += "TOTAL R$                                     " + valorTotal+ "\n";
		
		cupom += "----------------------------------------\n\n" + "\n";
		System.out.println(cupom);
	}
	public void imprimirNota(CupomFiscal c[]) {
		
		for(int i=0; i< c.length; i++) {
			
			imprimirNota(c[i]);
		}
		
	}
	
}
