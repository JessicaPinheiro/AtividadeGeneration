/*/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/




package Atividades140820;

public class Cliente {
	//atributo
	private String nome ;
	private String cidade;
	private String solicitacao;
	
	public Cliente (String primeiro, String segundo, String terceiro)
	{
	//m�todo 	
		nome=primeiro;
		cidade=segundo;
		solicitacao=terceiro;
	}
	
	public String getinformacoes()// 
	{
		String informacoes = "Nome:" + nome + "\nCidade: " + cidade + "\nSolicita��o: " + solicitacao;
		return informacoes;
	}
	

}
