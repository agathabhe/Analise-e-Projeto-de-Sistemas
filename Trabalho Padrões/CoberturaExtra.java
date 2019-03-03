
public class CoberturaExtra extends Extra{

	public UmaCoberturaExtra(String label, double preco, Pedido pedido) {
        super(label, preco, pedido);
	}	

	public Double getPreco() {
        return this.preco+pedido.getPreco();	
    }
	
}