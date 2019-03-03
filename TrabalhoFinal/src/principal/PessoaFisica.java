package principal;
public class PessoaFisica extends Cliente {
	
	String cpf;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String cpf) {
		super();
		this.cpf = cpf;
	}
	public PessoaFisica(String codigo, String nome, String telefone, String endereco, String estado, String cep,
			String email, String cpf) {
		super(codigo, nome, telefone,endereco, estado, cep, email);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
