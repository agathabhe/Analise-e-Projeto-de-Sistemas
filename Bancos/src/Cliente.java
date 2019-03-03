
public class Cliente {

	public static void main(String[] args) throws Exception{
	    
        int userKey = FabricaAbstrata.CODIGO_BRADESCO;
        FabricaAbstrata fbs = FabricaAbstrata.configurarInstancia(userKey);
        MensagemLogon msgLogon= fbs.gerarMensagemLogon();
        MensagemLogout msgLogout = fbs.gerarMensagemLogout();
        
        msgLogon.mostrarTelaGrafica();
        msgLogout.mostrarTelaGrafica();
        
        userKey = FabricaAbstrata.CODIGO_ITAU;
        fbs = FabricaAbstrata.configurarInstancia(userKey);
        msgLogon= fbs.gerarMensagemLogon();
        msgLogout = fbs.gerarMensagemLogout();
        
        msgLogon.mostrarTelaGrafica();
        msgLogout.mostrarTelaGrafica();
        
	}        
}
