package principal;
public class Cliente {
	
	String codigo;
	String nome;
	String telefone;
	String endereco;
	String estado;
	String cep;
	String email;
	
	public Cliente () {
		
	}
	
	public Cliente(String codigo, String nome, String telefone, String endereco, String estado, String cep,
			String email){
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.estado = estado;
		this.cep = cep;
		this.email = email;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco
				+ ", estado=" + estado + ", cep=" + cep + ", email=" + email + "]";
	}
	
	
	
}
