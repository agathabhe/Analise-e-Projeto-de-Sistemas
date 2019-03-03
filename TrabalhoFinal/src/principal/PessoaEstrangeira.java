package principal;
public class PessoaEstrangeira extends Cliente{
	
	String passaporte;
	
	public PessoaEstrangeira() {
		
	}

	public PessoaEstrangeira(String passaporte) {
		super();
		this.passaporte = passaporte;
	}
	
	public PessoaEstrangeira(String codigo, String nome, String telefone, String endereco, String estado, String cep,
			String email, String passaporte) {
		super(codigo, nome, telefone,endereco, estado, cep, email);
		this.passaporte = passaporte;
	} 
	
	public String getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}
	
	
}
