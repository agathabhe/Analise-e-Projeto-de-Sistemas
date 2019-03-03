
public class ColecaoPessoa implements Colecao {

	private static ColecaoPessoa singleton;
	private Pessoa[] dados = new Pessoa[100];
	private int posicaoCorrente;

	
	private ColecaoPessoa() {
		
	}
	
	static ColecaoPessoa getInstance() {
		if (singleton == null)
			singleton = new ColecaoPessoa();

		return singleton;
	}

	@Override
	public boolean inserir(Pessoa p) {
		if (posicaoCorrente > 99) {
			return false;
		}
		dados[posicaoCorrente] = p;
		posicaoCorrente++;

		return true;
	}

	@Override
	public boolean remover(int posicaoCorrente) {
		for (int j = posicaoCorrente; j < this.posicaoCorrente - 1; j++) {
			dados[j] = dados[j + 1];
		}
			this.posicaoCorrente--;
			
		return true;
	}
	
	@Override
	public boolean remover() {
		return remover(posicaoCorrente - 1);
	}

	@Override
	public void atualizar(int posicaoCorrente, Pessoa p) {

		dados[posicaoCorrente] = p;

	}

	@Override
	public boolean pesquisar(Pessoa p) {

		for(int i=0; i<posicaoCorrente; i++) {
			if (p == dados[i]) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean colecaoVazia() {

		if (posicaoCorrente == 0) {
			return true;
		}

		return false;
	}

	@Override
	public void imprimirDadosColecao() {
		
		for(int i=0; i<posicaoCorrente; i++) {
			System.out.println(dados[i].toString());
		}

	}

}
