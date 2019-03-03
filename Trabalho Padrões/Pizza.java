
public class Pizza {
	
	private String label;
	private double preco;
	  
	public Pizza(String label, double preco){
		this.label=label;
		this.preco=preco;
	}
	  
	public double getPreco(){
		return this.preco;
	}
	  
	public String getLabel(){
		return this.label;
	}
	
}
