package principal;

import java.util.List;


public class IteradorPedidos {

	List<Pedido> lista;
	int contador;

	protected IteradorPedidos(List<Pedido> lista) {
		this.lista = lista;
		contador = 0;
	}

	public void first() {
		contador = 0;
	}

	public void proximoPedido() {
		contador++;
	}

	public void voltarPedido() {
		contador--;
	}

	public boolean isDone() {
		return contador == lista.size();
	}

	private Pedido currentItem() {
		if (isDone()) {
			contador = lista.size() - 1;
		} else if (contador < 0) {
			contador = 0;
		}
		return lista.get(contador);
	}

	public String getPedido() {
		return currentItem().toString();
	}

	@Override
	public String toString() {
		return "IteradorPedidos [lista=" + lista + "]";
	}
	
	
}
