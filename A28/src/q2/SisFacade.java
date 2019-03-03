package q2;

public class SisFacade {

	protected SistemaDeAudio audio;
	protected SistemaDeVideo video;

	public void inicializarSubsistemas() {
		video = new SistemaDeVideo();
		video.configurarCores();
		video.configurarResolucao();

		audio = new SistemaDeAudio();
		audio.configurarCanais();
		audio.configurarFrequencia();
		audio.configurarVolume();
	}

	public void reproduzirAudio(String arquivo) {
		audio.reproduzirAudio(arquivo);
	}

	public void renderizarImagem(String imagem) {
		video.renderizarImagem(imagem);
	}
}
