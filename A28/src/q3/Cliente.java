package q3;


public class Cliente {

	public static void main(String[] args) {
		
		Pedido pizzaDaCasa = new Pizza("Pizza da Casa", 10);
		pizzaDaCasa = new CoberturaExtra("Pepperoni", 4, pizzaDaCasa);
		pizzaDaCasa = new CoberturaSemCusto("Pimenta", 2, pizzaDaCasa);
		System.out.println(pizzaDaCasa.getPreco());
		System.out.println(pizzaDaCasa.getLabel());

	}

}
