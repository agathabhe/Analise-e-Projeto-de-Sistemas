import java.util.Date;

public class App {

	public static void main(String[] args) {

		ColecaoPessoa pessoas = ColecaoPessoa.getInstance();

		try {
			PessoaFisica p1 = new PessoaFisica("12345678913");
			PessoaFisica pf2 = new PessoaFisica("098765423456");
			p1.setNome("Agatha");
			pf2.setNome("Igor");
			p1.setDataNascimento(new Date(1999 - 1900, 12 - 1, 19));
			pf2.setDataNascimento(new Date(1997 - 1900, 9 - 1, 8));
			//System.out.println(p1.getDataNascimento()+" "+p1.calcularIdade());
			PessoaJuridica p2 = new PessoaJuridica("123456789101230987");
			PessoaJuridica pj2 = new PessoaJuridica("098765432123456789");
			p2.setNome("Bhenares");
			pj2.setNome("Claudino");
			p2.setDataCriacao(new Date(1986 - 1900, 11 - 1, 30));
			pj2.setDataCriacao(new Date(1995 - 1900, 9 - 1, 7));
			//System.out.println(p2.getDataCriacao()+" "+p2.calcularIdade());

			pessoas.inserir(p1);
			pessoas.inserir(p2);
			pessoas.inserir(pf2);
			pessoas.inserir(pj2);
			pessoas.imprimirDadosColecao();
//			pessoas.atualizar(3, pf2);
//			pessoas.imprimirDadosColecao();
			pessoas.remover(2);
			pessoas.remover();
//			System.out.println(pessoas.colecaoVazia());
//			pessoas.imprimirDadosColecao();
//			System.out.println(pessoas.pesquisar(p1));

		} catch (DocumentoInvalidoException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}

	}
}
