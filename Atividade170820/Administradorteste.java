package Atividade170820;

public class Administradorteste {

	public static void main (String args[])
	{
		Administrador adm= new Administrador ("Hilda", "Av. Irere,292", "(11)999214314", 750);
		System.out.println("Nome: " + adm.getNome()+".");
		System.out.println("Enderešo: " + adm.getEnderešo()+ ".");
		System.out.println("Numero de telefone: " + adm.getTelefone()+".");
		System.out.println("Valor da ajuda de custo: R$" + adm.getAjudaDeCusto()+".");

		
		
	}
	
	
}
