public class AbstracaoRefinada implements Abstracao {

	private OperacaoMatematica operacaoMatematica;

	public AbstracaoRefinada(OperacaoMatematica operacaoMatematica) {
		this.operacaoMatematica = operacaoMatematica;
	}

	@Override
	public void operacao(int a, int b) {
		operacaoMatematica.realizaOperacao(a, b);

	}

}