
public interface Colecao {

	public boolean inserir(Pessoa p);
	public boolean remover();
	public boolean remover(int posicaoCorrente);
	public void atualizar(int posicaoCorrente, Pessoa p);
	public boolean pesquisar (Pessoa p);
	public boolean colecaoVazia();
	public void imprimirDadosColecao();
	
}
