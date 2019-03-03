import java.util.Date;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	private Date dataCriacao;
	
	public PessoaJuridica(String cnpj) throws DocumentoInvalidoException {
		super();
		this.cnpj = cnpj;
		if (!validarDocumento()) {
			throw new DocumentoInvalidoException();
		}

	}
	
	public String getCnpj() {
		return cnpj;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	@Override
	public String toString() {
		
		return "Nome: "+getNome()+"\nCNPJ: "+getCnpj()+"\nData de Criação: "+getDataCriacao();
		
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof PessoaJuridica){
			PessoaJuridica p = (PessoaJuridica)o;
			if(p.getCnpj().equals(this.cnpj)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean validarDocumento() {
		if (getCnpj().length() != 18) {
			return false;
		}
		return true;
	}

	@Override
	int calcularIdade() {
		Date data = new Date();
		int idade = (data.getYear()+1900)-(getDataCriacao().getYear()+1900);
		
		return idade;
	}
	
	

}
