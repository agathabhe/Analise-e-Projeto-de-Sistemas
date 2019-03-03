package q1;

public class Fiesta extends CarroPrototype {
		 
	    protected Fiesta(Fiesta fiesta) {
	        this.valorCompra = fiesta.getValorCompra();
	    }
	 
	    public Fiesta() {
	        valorCompra = 0.0;
	    }
	 
	    @Override
	    public String exibirInfo() {
	        return "Modelo: Fiesta\nMontadora: Ford\n" + "Valor: R$"
	                + getValorCompra();
	    }
	 
	    @Override
	    public CarroPrototype clonar() {
	        return new Fiesta(this);
	    }
}
