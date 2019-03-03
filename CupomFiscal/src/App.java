
public class App {

	public static void main(String[] args) {
		
		Impressora teste = Impressora.getInstance();
		CupomFiscal meucupom = new CupomFiscal.CupomFiscalBuilder("Amazon", "328399889007")
				.cpfConsumidor("98328372932")
				.cnpjConsumidor("88767787887888")
				.dinheiroRecebido(800)
				.build();
		
		CupomFiscal meucupom2 = new CupomFiscal.CupomFiscalBuilder("Microsoft", "098399889007")
				.cpfConsumidor("767775372932")
				.cnpjConsumidor("00767787887888")
				.dinheiroRecebido(900)
				.build();
		
		CupomFiscal meucupom3 = new CupomFiscal.CupomFiscalBuilder("Oracle", "558399889007")
				.cpfConsumidor("98328373332")
				.cnpjConsumidor("88767672887888")
				.dinheiroRecebido(70000)
				.build();
		
		Item item1 = new Item(1, "Sabonete", 2, 5);
		Item item2 = new Item(2, "Sabão", 3, 4);
		Item item3 = new Item(3, "Toalha", 10, 4);
		Item item4 = new Item(4, "Shampoo", 12, 3);
		Item item5 = new Item(5, "Creme", 13, 1);
		
		meucupom.getListaItem()[0] = item1;
		meucupom.getListaItem()[1] = item2;
		meucupom.getListaItem()[2] = item3;
		meucupom.getListaItem()[3] = item4;
		meucupom.getListaItem()[4] = item5;
		
		Item item6 = new Item(1, "notebook", 2000, 1);
		Item item7 = new Item(2, "Mouse", 300, 1);
		Item item8 = new Item(3, "Teclado", 1000, 1);
		Item item9 = new Item(4, "Placa de Vídeo",1500 , 1);
		Item item10 = new Item(5, "Celular", 500, 1);
		
		meucupom2.getListaItem()[0] = item6;
		meucupom2.getListaItem()[1] = item7;
		meucupom2.getListaItem()[2] = item8;
		meucupom2.getListaItem()[3] = item9;
		meucupom2.getListaItem()[4] = item10;
		
		Item item11 = new Item(1, "Eclipse Photon", 2000, 2);
		Item item12 = new Item(2, "Eclipse Mars 2", 100, 2);
		Item item13 = new Item(3, "Eclipse June", 200, 4);
		Item item14 = new Item(4, "Eclipse Indigo", 100, 3);
		Item item15 = new Item(5, "Eclipse Oxygen", 1003, 1);
		
		meucupom3.getListaItem()[0] = item11;
		meucupom3.getListaItem()[1] = item12;
		meucupom3.getListaItem()[2] = item13;
		meucupom3.getListaItem()[3] = item14;
		meucupom3.getListaItem()[4] = item15;
	
		CupomFiscal[] cupons = new CupomFiscal[3];
		
		cupons[0] = meucupom;
		cupons[1] = meucupom2;
		cupons[2] = meucupom3;
		
		teste.imprimirNota(meucupom);
		teste.imprimirNota(cupons);
		

	}

}
