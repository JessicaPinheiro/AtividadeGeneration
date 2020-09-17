/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

package Atividade110820;

import java.util.Scanner;

public class Questdois {

	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n, x, cont=0, contt=0;
		
		
		
		for (x=0;x<5;x++)
		{
			System.out.println("Entre com um numero: ");
			n= ler.nextInt();
			
			if (n%2==0) 
			{
			cont = cont+1;
			}
			else 
			{
			contt  = contt+1;
			}
		}
		
		System.out.println("Foram digitados: "+ cont +"  numeros pares e "+ contt + " numeros impares");
		
	}
}
