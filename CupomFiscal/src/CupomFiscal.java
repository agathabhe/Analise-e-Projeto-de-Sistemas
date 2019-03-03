
public class CupomFiscal {

	private String nomeLoja;
	private String cnpj;
	private String cpfConsumidor;
	private String cnpjConsumidor;
	private double dinheiroRecebido;
	private Item[] listaItem;
	
	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCpfConsumidor() {
		return cpfConsumidor;
	}

	public void setCpfConsumidor(String cpfConsumidor) {
		this.cpfConsumidor = cpfConsumidor;
	}

	public String getCnpjConsumidor() {
		return cnpjConsumidor;
	}

	public void setCnpjConsumidor(String cnpjConsumidor) {
		this.cnpjConsumidor = cnpjConsumidor;
	}

	public double getDinheiroRecebido() {
		return dinheiroRecebido;
	}

	public void setDinheiroRecebido(double dinheiroRecebido) {
		this.dinheiroRecebido = dinheiroRecebido;
	}

	public Item[] getListaItem() {
		return listaItem;
	}

	public void setListaItem(Item[] listaItem) {
		this.listaItem = listaItem;
	}

	public CupomFiscal(CupomFiscalBuilder builder) {
		this.nomeLoja = builder.nomeLoja;
		this.cnpj = builder.cnpj;
		this.cpfConsumidor = builder.cpfConsumidor;
		this.cnpjConsumidor = builder.cnpjConsumidor;
		this.dinheiroRecebido = builder.dinheiroRecebido;
		this.listaItem = builder.listaItem;
	}

	public static class CupomFiscalBuilder {
		
		private String nomeLoja;
		private String cnpj;
		private String cpfConsumidor;
		private String cnpjConsumidor;
		private double dinheiroRecebido;
		private Item[] listaItem = new Item[5];
		
		public CupomFiscalBuilder(String nomeLoja, String cnpj){
            this.nomeLoja = nomeLoja;
            this.cnpj = cnpj;
        }
		
		public CupomFiscalBuilder cpfConsumidor(String cpfConsumidor){
            this.cpfConsumidor = cpfConsumidor;
            return this;
        }
		
		public CupomFiscalBuilder cnpjConsumidor(String cnpjConsumidor){
            this.cnpjConsumidor = cnpjConsumidor;
            return this;
        }
		
		public CupomFiscalBuilder dinheiroRecebido(double dinheiroRecebido){
            this.dinheiroRecebido = dinheiroRecebido;
            return this;
        }
		
		public CupomFiscalBuilder listaItem(Item [] listaItem){
            this.listaItem = listaItem;
            return this;
        }
		
		public CupomFiscal build(){
            return new CupomFiscal(this);
        }
		
	}	
	
	
	
}
