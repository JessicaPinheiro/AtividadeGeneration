/*2- Faça um programa que entre com três números e coloque em ordem crescente.*/


package Atividades100820;

import java.util.Scanner;

public class Questdois {

	public static void main(String args [])
	{
		Scanner ler = new Scanner(System.in);
		
		int n1,n2,n3,maiorn=0;
		System.out.printf("Entre com n1: ");
		n1 = ler.nextInt();
		System.out.printf("Entre com n2: ");
		n2 = ler.nextInt();
		System.out.printf("Entre com n3: ");
		n3 = ler.nextInt();
		
		if (n1<=n2 && n2<=n3)
		{
			System.out.printf(n1+", " + n2 + ","+n3);
		}	
			
		else if (n1<=n3 && n3<=n2)
		{	
			System.out.printf(n1+"," + n3 + ","+n2);
		}
		
		else if (n2<=n1 && n1<=n3)
		{
			System.out.printf(n2+"," + n1 + ","+n3);
		}
		
		else if (n2<=n3 && n3<=n1)
		{
			System.out.printf(n2+"," + n3 + ","+n1);
		}
		
		else if (n3<=n1 && n1<=n2)
		{
			System.out.printf(n3 + "," + n1 + ","+n2);
		}
		
		else 
		{
			System.out.printf(n3+"," + n2 + ","+n3);
		}
	}
}
