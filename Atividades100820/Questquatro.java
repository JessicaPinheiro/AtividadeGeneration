/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/


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
			System.out.println("O mumero digitado é par e sua respctiva reiz quasdrada é: " + n);
		}
		
		else 
		{
			n = Math.pow(n, 2);
			System.out.println(" O mumero digitado é impar o mesmo elevado a segunda motencia: " + n);
		}
		
		
	}
}
