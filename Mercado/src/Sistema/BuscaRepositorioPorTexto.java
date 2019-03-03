package Sistema;

public class BuscaRepositorioPorTexto {

	public String buscaPorNome(String nome, RepositorioItem rs){
		int i;
		String str= "";
		Item buscado=null;
		for(i=0;i<rs.listaItem.size();i++){
			if(nome.equals(rs.listaItem.get(i).getNome()))
			buscado=rs.listaItem.get(i);
		}
		return str = ""+buscado.toString();
		/*System.out.println(""+buscado.toString());*/
	}
}
