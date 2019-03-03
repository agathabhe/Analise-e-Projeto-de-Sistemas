package principal;

public class PedidoBDProxy extends PedidoBD{
	
	public PedidoBDProxy() {
		super();
	}
	
	@Override
	void adicionarPedido(Pedido p) {
		if(p.getDataPagamento().equals(p.getDataPedido()))
		super.adicionarPedido(p);
		else
			System.out.println("O pagamento deve ser feito imediamente!");
	}
	
}
