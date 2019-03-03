package Sistema;

import java.util.ArrayList;

public class CupomFiscal {
	String nomeLoja;
	String cnpj;
	public String cpfConsumidor;
	public String cnpjConsumidor;
	public double dinheiroRecebido;
	double totalPago;
	double troco;
	public ArrayList<ItemVendido> listaItem = new ArrayList<>();
	private int qtdDeItensLista;

	public CupomFiscal() {
		this.nomeLoja= "Cosmos";
		this.cnpj= "01.001.001/0001-01";
	}

	public CupomFiscal(/* String cpfConsumidor, */ String cnpjConsumidor, double dinheiroRecebido,
			ArrayList<ItemVendido> listaItem) {
		this.nomeLoja = "COSMOS";
		this.cnpj = "01.111.111/0001-19";
		/* this.cpfConsumidor = cpfConsumidor; */
		this.cnpjConsumidor = cnpjConsumidor;
		this.dinheiroRecebido = dinheiroRecebido;
		this.listaItem = listaItem;

	}

	public CupomFiscal(/* String cnpjConsumidor, */
			double dinheiroRecebido, String cpfConsumidor, ArrayList<ItemVendido> listaItem) {
		this.nomeLoja = "COSMOS";
		this.cnpj = "01.111.111/0001-19";
		this.cpfConsumidor = cpfConsumidor;
		/* this.cnpjConsumidor = cnpjConsumidor; */
		this.dinheiroRecebido = dinheiroRecebido;
		this.listaItem = listaItem;

	}

	public double totalAPagar(ArrayList<ItemVendido> listaItem) {
		int i;
		Item iv = new Item();
		this.totalPago = 0;
		for (i = 0; i < listaItem.size(); i++)
			this.totalPago = iv.calculoValorTotal(listaItem.get(i)) + this.totalPago;

		return this.totalPago;
	}

	public double calculaTroco(double dinheiroRecebido) throws DinheiroRecebidoMenorException {
		if (this.dinheiroRecebido < this.totalPago)
			throw new DinheiroRecebidoMenorException("Valor invalido!");
		return this.troco = dinheiroRecebido - this.totalPago;

	}

	public int getQtdDeItensLista() {
		return qtdDeItensLista;
	}

	public void setQtdDeItensLista(int qtdDeItensLista) {
		this.qtdDeItensLista = qtdDeItensLista;
	}
}
