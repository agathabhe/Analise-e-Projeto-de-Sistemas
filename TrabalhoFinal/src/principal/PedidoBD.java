package principal;

import java.util.ArrayList;
import java.util.List;

public class PedidoBD {
	
	List<Pedido> pedidos;
	
	private static PedidoBD uniqueInstance;
	 
    public PedidoBD() {
    	pedidos = new ArrayList<Pedido>();
    }
	
	public static PedidoBD getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new PedidoBDProxy();
 
        return uniqueInstance;
    }
	
	void adicionarPedido(Pedido p) {
		pedidos.add(p);
	}
	
	public IteradorPedidos criarIterator() {
		return new IteradorPedidos(pedidos);
	}
}
