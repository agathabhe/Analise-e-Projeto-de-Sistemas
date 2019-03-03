package q4;

import java.util.ArrayList;

public class AgregadorCanais {

	protected ArrayList<Canal> canais;

	public AgregadorCanais() {
		canais = new ArrayList<Canal>();
	}

	public int count() {
		return canais.size();
	}

	public IteradorCanais criarIterator() {
		return new IteradorCanais(canais);
	}
}
