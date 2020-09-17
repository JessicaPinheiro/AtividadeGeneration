/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

package Atividades140820;

public class ProdutoEletronico {
		//atributo
		private String Tipodedeparelho ;
		private String Marca;
		private String Modelo;
	
		public ProdutoEletronico (String primeiro, String segundo, String terceiro)
		{
		//método 	
			Tipodedeparelho=primeiro;
			Marca=segundo;
			Modelo=terceiro;
		}
		
		public String getinformacoes()// Apresentar infrmações
		{
			String informacoes = "Tipo do aparelho eletronco: " + Tipodedeparelho + "\nMarca do aparelho: " + Marca + "\nModelo do apralho: " + Modelo;
			return informacoes;
		}

}
