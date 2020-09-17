package Atividade170820;

public class Empregadoteste {
	
	
	public static void main (String args[])
	{
		Empregado ep1= new Empregado("Nailson", "Av. Irere,292", "(11)999214314", 5000, 2500, 15);
		System.out.println("Nome: " + ep1.getNome()+".");
		System.out.println("Endereço: " + ep1.getEndereço()+ ".");
		System.out.println("Numero de telefone: " + ep1.getTelefone()+".");
		System.out.println("Codigo do setor: " + ep1.getCodigoSetor()+".");
		System.out.println("Salario base: R$" + ep1.getSalarioBase()+".");
		System.out.println("Porcentagem do imposto: " + ep1.getImposto()+"%.");
		System.out.printf("Seu salario liquido será: : R$" + ep1.getCalcularSalario()+".");
		
		
	}
	

}
