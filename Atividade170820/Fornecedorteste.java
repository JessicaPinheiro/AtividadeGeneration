package Atividade170820;

public class Fornecedorteste  {
	
	public static void main (String args[])
	{
		Fornecedor f1= new Fornecedor("Joana", "Av. Irere,292", "(11)999214314", 5000, 2500, 0);
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Endereço: " + f1.getEndereço());
		System.out.println("Numero de telefone: " + f1.getTelefone());
		System.out.println("Valor disponivel para credito: " + f1.getValorCredito());
		System.out.println("Valor da divida: " + f1.getValorDivida());
		System.out.println("Valor do saldo: " + f1.getObterSaldo());
		
		
	}
}
