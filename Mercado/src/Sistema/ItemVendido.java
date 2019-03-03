package Sistema;

import java.util.Date;

public class ItemVendido extends Item{
	private int qtddVendida;
	
	public ItemVendido(Item i){
        super(i.getCodigo(), i.getNome(), i.getValorUnitario(), i.getDataCadastro(), i.getQtddEstoque());
    }
	
	public ItemVendido(){
		
	}

	public ItemVendido(int codigo,String nome,double valorUnitario,String dataCadastro, int qtddEstoque, int qtddVendida){
		super(codigo,nome, valorUnitario, dataCadastro,qtddEstoque);
		this.qtddVendida= qtddVendida;
	}
	
	public double calculoValorTotal(ItemVendido itv){
		return  itv.getValorUnitario()* itv.qtddVendida;
	}

	public int getQtddVendida() {
		return qtddVendida;
	}

	public void setQtddVendida(int qtddVendida) {
		this.qtddVendida = qtddVendida;
	}
	
	
}
