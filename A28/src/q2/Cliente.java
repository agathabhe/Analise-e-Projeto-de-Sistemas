package q2;

public class Cliente {
		
	public static void main(String[] args) {
		System.out.println("-------- Configurando subsistemas --------");
		SisFacade fachada = new SisFacade();
		fachada.inicializarSubsistemas();
		
		System.out.println("------- Utilizando subsistemas -------");
		fachada.renderizarImagem("imagem.png");
		fachada.reproduzirAudio("teste.mp3");
		
	}
}

