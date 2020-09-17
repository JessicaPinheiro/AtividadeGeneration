/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/


package Atividades100820;

import java.util.*;

public class Questum 
{
	
	public static void main(String args [])
	{
		Scanner ler = new Scanner(System.in);
		
		int n1,n2,n3,maiorn=0;
		System.out.printf("Entre com n1 inteiro e positivo: ");
		n1 = ler.nextInt();
		System.out.printf("Entre com n2 inteiro e positivo: ");
		n2 = ler.nextInt();
		System.out.printf("Entre com n3 inteiro e positivo: ");
		n3 = ler.nextInt();
		
		if (n1<0 && n2<0 )
		{
		System.out.printf("\nVocê entrou com um numero incorreto");
		}
		else if (n3<0);
		{
		System.out.printf("\nVocê entrou com um numero incorreto");
		}	
		
		
		if (n1>n2 && n1>n3)
		{
		System.out.printf("\nO mairo numero é " + n1);
		}
		
		else if (n2>n1 && n2>n3)
		{
		System.out.printf("\nO mairo numero é " + n2);
		}
		
		else if (n3>n1 && n3>n2)
		{
		System.out.printf("\nO mairo numero é " + n3);
		}
		
		else if (n1<0 && n2<0 && n3<0)
		{
		System.out.printf("\nVocê entrou com um numero incorreto");
		}
		
		
		
	}
	
}
