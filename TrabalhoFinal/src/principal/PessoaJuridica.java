package principal;
public class PessoaJuridica extends Cliente {
	
	String cnpj;
	String nomeFantasia;
	String cpfResponsavel;
	
	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(String cnpj, String nomeFantasia, String cpfResponsavel) {
		super();
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.cpfResponsavel = cpfResponsavel;
	}

	public PessoaJuridica(String codigo, String nome, String telefone, String endereco, String estado, String cep,
			String email, String cnpj, String nomeFantasia, String cpfResponsavel) {
		super(codigo, nome, telefone,endereco, estado, cep, email);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.cpfResponsavel = cpfResponsavel;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCpfResponsavel() {
		return cpfResponsavel;
	}

	public void setCpfResponsavel(String cpfResponsavel) {
		this.cpfResponsavel = cpfResponsavel;
	}
	
	
}
