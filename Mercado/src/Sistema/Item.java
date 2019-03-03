package Sistema;

import java.util.Calendar;
import java.util.Date;

public class Item {
	private int codigo;
	private String nome;
	private double valorUnitario;
	private String dataCadastro;
	private int qtddEstoque;


	public Item(){
		
	}
	
	public Item(int codigo,String nome,double valorUnitario,String dataCadastro, int qtddEstoque){
		this.codigo=codigo;
		this.nome=nome;
		this.qtddEstoque= qtddEstoque;
		this.dataCadastro= dataCadastro;
		this.valorUnitario= valorUnitario;
	}
	public double calculoValorTotal(ItemVendido it){
		if(it instanceof ItemVendido)
		return  it.getValorUnitario()* ((ItemVendido) it).getQtddVendida();
		return 0;

	}
	
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQtddEstoque() {
		return qtddEstoque;
	}

	public void setQtddEstoque(int qtddEstoque) {
		this.qtddEstoque = qtddEstoque;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "Item \nCodigo:" + codigo + " \nNome:" + nome + " \nValorUnitario:" + valorUnitario + " \nData de Cadastro:"
				+ dataCadastro + " \nQuantidade em Estoque:" + qtddEstoque+"\n";
	}

	
}
