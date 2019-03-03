package principal;
public class Item {

	String codigo;
	double preco;
	double desconto;
	int qntSoftware;
	Software software;
	
	public Item () {
		
	}	
	
	public Item(String codigo, double preco, double desconto, int qntSoftware, Software software) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.desconto = desconto;
		this.qntSoftware = qntSoftware;
		this.software = software; 
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public int getQntSoftware() {
		return qntSoftware;
	}

	public void setQntSoftware(int qntSoftware) {
		this.qntSoftware = qntSoftware;
	}

	public Software getSoftware() {
		return software;
	}

	public void setSoftware(Software software) {
		this.software = software;
	}

	@Override
	public String toString() {
		return "Item [codigo=" + codigo + ", preco=" + preco + ", desconto=" + desconto + ", qntSoftware=" + qntSoftware
				+ ", software=" + software + "]";
	}
	
	
	
	
}
