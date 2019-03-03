package Sistema;

import java.util.ArrayList;

public class RepositorioItem {
	public static ArrayList<Item> listaItem = new ArrayList<>();
	int posicao;

	public Item getItem(int indice) {
		int i;
		Item it= new Item();
		for (i = 0; i <= listaItem.size(); i++){
			if (i == indice)
			 it = listaItem.get(i);
			
		}
		return it ;

	}

	public boolean aumentarTamanhoDoConjunto(int n) {
		return true;

	}

	public boolean addItem(Item i) {
		listaItem.add(i);
        posicao++;
		return true;
	}

	public ArrayList<Item> getListasObjetos() {

		return listaItem;

	}

	public int getTamanhoLista() {
		return listaItem.size();

	}

}
