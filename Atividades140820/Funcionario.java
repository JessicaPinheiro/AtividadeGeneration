/*4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/


package Atividades140820;

public class Funcionario {

	//atributo
	private String Nome;
	private String Setor;
	private String folga;

	public Funcionario (String primeiro, String segundo, String terceiro)
	{
	//método 	
		Nome=primeiro;
		Setor=segundo;
		folga=terceiro;
	}
	
	public String getinformacoes()// Apresentar infrmações
	{
		String informacoes = "Nome do funcionario: " + Nome + "\nSetor de trabalho: " + Setor + "\nDia da folga: " + folga;
		return informacoes;
	}

}
