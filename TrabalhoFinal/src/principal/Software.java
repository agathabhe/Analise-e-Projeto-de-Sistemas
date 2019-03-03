package principal;
public class Software {

	String codigo;
	String titulo;
	String desenvolvedora;
	double preco;
	int qtdEstoque;
	String anoEdicao;
	String genero;
	String requisitosMinimos;
	String requisitosIdeais;
	
	public Software() {
		
	}
	
	public Software(String codigo, String titulo, String desenvolvedora, double preco, int qtdEstoque, String anoEdicao,
			String genero, String requisitosMinimos, String requisitosIdeais) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.desenvolvedora = desenvolvedora;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
		this.anoEdicao = anoEdicao;
		this.genero = genero;
		this.requisitosMinimos = requisitosMinimos;
		this.requisitosIdeais = requisitosIdeais;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDesenvolvedora() {
		return desenvolvedora;
	}

	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public String getAnoEdicao() {
		return anoEdicao;
	}

	public void setAnoEdicao(String anoEdicao) {
		this.anoEdicao = anoEdicao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getRequisitosMinimos() {
		return requisitosMinimos;
	}

	public void setRequisitosMinimos(String requisitosMinimos) {
		this.requisitosMinimos = requisitosMinimos;
	}

	public String getRequisitosIdeais() {
		return requisitosIdeais;
	}

	public void setRequisitosIdeais(String requisitosIdeais) {
		this.requisitosIdeais = requisitosIdeais;
	}

	@Override
	public String toString() {
		return "Software [codigo=" + codigo + ", titulo=" + titulo + ", desenvolvedora=" + desenvolvedora + ", preco="
				+ preco + ", qtdEstoque=" + qtdEstoque + ", anoEdicao=" + anoEdicao + ", genero=" + genero
				+ ", requisitosMinimos=" + requisitosMinimos + ", requisitosIdeais=" + requisitosIdeais + "]";
	}
	
	
	
	
}
