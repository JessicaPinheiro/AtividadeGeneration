/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.*/

package Atividades140820;

public class ProdutoEletronico {
		//atributo
		private String Tipodedeparelho ;
		private String Marca;
		private String Modelo;
	
		public ProdutoEletronico (String primeiro, String segundo, String terceiro)
		{
		//m�todo 	
			Tipodedeparelho=primeiro;
			Marca=segundo;
			Modelo=terceiro;
		}
		
		public String getinformacoes()// Apresentar infrma��es
		{
			String informacoes = "Tipo do aparelho eletronco: " + Tipodedeparelho + "\nMarca do aparelho: " + Marca + "\nModelo do apralho: " + Modelo;
			return informacoes;
		}

}
