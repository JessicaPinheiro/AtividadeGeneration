/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/


package Atividades140820;

public class Funcionario {

	//atributo
	private String Nome;
	private String Setor;
	private String folga;

	public Funcionario (String primeiro, String segundo, String terceiro)
	{
	//m�todo 	
		Nome=primeiro;
		Setor=segundo;
		folga=terceiro;
	}
	
	public String getinformacoes()// Apresentar infrma��es
	{
		String informacoes = "Nome do funcionario: " + Nome + "\nSetor de trabalho: " + Setor + "\nDia da folga: " + folga;
		return informacoes;
	}

}
