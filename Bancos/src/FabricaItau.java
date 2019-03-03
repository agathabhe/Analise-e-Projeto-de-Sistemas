
public class FabricaItau extends FabricaAbstrata {

	@Override
	MensagemLogon gerarMensagemLogon() {
		return new MensagemLogonItau();
	}

	@Override
	MensagemLogout gerarMensagemLogout() {
		// TODO Auto-generated method stub
		return new MensagemLogoutItau("ITAU", "Saindo");
	}
	
	
}
