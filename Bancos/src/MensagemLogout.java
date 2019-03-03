
public abstract class MensagemLogout {
	
	String logo;
	String mensagem;
	
	public MensagemLogout(String logo, String mensagem) {
		super();
		this.logo = logo;
		this.mensagem = mensagem;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	abstract void mostrarTelaGrafica();
}
