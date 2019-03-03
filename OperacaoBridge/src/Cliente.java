
public class Cliente {
	public static void main(String[] args) {
		
		Abstracao abstracoes0 = new AbstracaoRefinada(new Multiplicacao());
		Abstracao abstracoes1 = new AbstracaoRefinada(new Adicao());
        
		Abstracao[] abstracoes = {abstracoes1, abstracoes0};
        
		for(Abstracao abstracao : abstracoes)
			abstracao.operacao(2,3);
		
    }
}