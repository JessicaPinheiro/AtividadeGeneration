/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/


package Atividades100820;

import java.util.Scanner;
import java.math.*;

public class Questquatro 
{

	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		double n;
	 
		System.out.println("Entre com um numero: ");
		n = ler.nextInt();
	
		
		if (n%2==0)
		{
			n = Math.sqrt(n);
			System.out.println("O mumero digitado � par e sua respctiva reiz quasdrada �: " + n);
		}
		
		else 
		{
			n = Math.pow(n, 2);
			System.out.println(" O mumero digitado � impar o mesmo elevado a segunda motencia: " + n);
		}
		
		
	}
}
