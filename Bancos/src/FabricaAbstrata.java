
public abstract class FabricaAbstrata {

	abstract MensagemLogon gerarMensagemLogon();
	abstract MensagemLogout gerarMensagemLogout();
	
	static final int CODIGO_ITAU = 184;
	static final int CODIGO_BRADESCO = 237;
	
	public static FabricaAbstrata configurarInstancia(int codigoBanco) {
		if(codigoBanco == CODIGO_BRADESCO) return new FabricaBradesco();
		else if(codigoBanco == CODIGO_ITAU) return new FabricaItau();
		return null;
	}
}
