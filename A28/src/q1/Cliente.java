package q1;

public class Cliente {
	
	public static void main(String[] args) {
	    Fiesta prototipoFiesta = new Fiesta();
	 
	    CarroPrototype fiestaNovo = prototipoFiesta.clonar();
	    fiestaNovo.setValorCompra(27900.0);
	    CarroPrototype fiestaUsado = prototipoFiesta.clonar();
	    fiestaUsado.setValorCompra(21000.0);
	 
	    System.out.println(fiestaNovo.exibirInfo());
	    System.out.println(fiestaUsado.exibirInfo());
	}
}
