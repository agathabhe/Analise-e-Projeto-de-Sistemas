package principal;

import java.util.Date;
import java.util.List;

public class Pedido {
	
	String codigo;
	Date dataPedido;
	Date dataPagamento;
	String endEntrega;
	double valorFrete;
	List<Item> itens;
	FormaPagamento formaPag;
	Cliente cliente;
	
	public Pedido() {
		
	}
	
	public Pedido(String codigo, Date dataPedido, Date dataPagamento, 
			String endEntrega, double valorFrete, List<Item> itens, FormaPagamento formaPag, Cliente cliente) {
		super();
		this.codigo = codigo;
		this.dataPedido = dataPedido;
		this.dataPagamento = dataPagamento;
		this.endEntrega = endEntrega;
		this.valorFrete = valorFrete;
		this.itens = itens;
		this.formaPag = formaPag;
		this.cliente = cliente;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public String getEndEntrega() {
		return endEntrega;
	}

	public void setEndEntrega(String endEntrega) {
		this.endEntrega = endEntrega;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public FormaPagamento getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(FormaPagamento formaPag) {
		this.formaPag = formaPag;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [codigo=" + codigo + ", dataPedido=" + dataPedido + ", dataPagamento=" + dataPagamento
				+ ", endEntrega=" + endEntrega + ", valorFrete=" + valorFrete + ", itens=" + itens + ", formaPag="
				+ formaPag + ", cliente=" + cliente + "]";
	}

	
	
		
	
}
