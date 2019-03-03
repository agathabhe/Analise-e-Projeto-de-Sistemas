
public class FabricaBradesco extends FabricaAbstrata {

	@Override
	MensagemLogon gerarMensagemLogon() {

		return new MensagemLogonBradesco();
	}

	@Override
	MensagemLogout gerarMensagemLogout() {
		// TODO Auto-generated method stub
		return new MensagemLogoutBradesco("BRADESCO", "Saindo");
	}

}
