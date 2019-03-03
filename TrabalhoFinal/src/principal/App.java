package principal;

import java.util.Arrays;
import java.util.Date;

public class App {

	public static void main(String[] args) {

		Cliente fisico = new PessoaFisica("cod1", "Agatha", "4002-8922", "Rua A, 1", "Ceará", "63700-000",
				"agatha@gmail.com", "12345678901");
		Cliente juridico = new PessoaJuridica("cod2", "Bhenares", "8765-0987", "Rua Legislativa, 90", "Goiás",
				"64900-000", "bhenares@gmail.com", "17291837465782", "Juridicos", "18976543678");
		Cliente estrangeiro = new PessoaEstrangeira("cod3", "Damiano", "098765-098765", "Wall Street, 5678",
				"Massachussets", "09876556-000", "damiano@gmail.com", "213243434334");

		Software windows = new Software("codS1", "Windows 10", "Microsoft", 145.89, 10, "2018", "Sistema Operacional",
				"PC Básico", "PC Top");
		Software windowssete = new Software("codS2", "Windows 7", "Microsoft", 100, 100, "2007", "Sistema Operacional",
				"PC Básico", "PC Top");
		Software photoshop = new Software("codS3", "PhotoShop", "Adobe", 70.50, 1000, "2009", "Editor de fotos",
				"Boa placa de vídeo", "SSD");

		Item sistema = new Item("cod1", windows.getPreco(), 0, 1, windows);
		Item sistemaa = new Item("cod2", windowssete.getPreco(), 0, 1, windowssete);
		Item editor = new Item("codG", photoshop.getPreco(), 0, 2, photoshop);

		FormaPagamento parcelado = new FormaPagamento(1, "Dividir o valor em ate 5x");
		FormaPagamento vista = new FormaPagamento(2, "Valor completo na hora da compra");

		Pedido primeiro = new Pedido("codP1", new Date(), new Date(), "Rua B, 90", 40, 
				Arrays.asList(sistemaa, sistema),
				parcelado, fisico);
		Pedido segundo = new Pedido("codP2", new Date(), new Date(2000-1900, 9, 10), "Rua Ibirapuera, 654", 900,
				Arrays.asList(editor,sistema), vista, estrangeiro);
		Pedido terceiro = new Pedido("codP3", new Date(), new Date(), "Rua Oito, 88", 900,
				Arrays.asList(editor,sistemaa), vista, juridico);
		
		PedidoBD bd = PedidoBD.getInstance();
		bd.adicionarPedido(primeiro);
		bd.adicionarPedido(segundo);
		bd.adicionarPedido(terceiro);

		for (IteradorPedidos it = bd.criarIterator(); !it.isDone(); it.proximoPedido()) {
			System.out.println(it.getPedido());
		}

	}

}
