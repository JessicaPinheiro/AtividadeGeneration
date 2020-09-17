/*Escrever um programa que receba vários números inteiros no teclado. E no final
 *  imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
 *  (DO...WHILE)*/


package Atividade110820;

import java.util.Scanner;

public class Questseis {
	
	public static void main (String argrs[])
	{
	
		Scanner ler = new Scanner(System.in);
		int n, med, ttm = 0, print=0, media; 
		
		do
		{
			System.out.println("Entre com um numero :");
			n= ler.nextInt();
			
			if (n%3==0)
			{
				ttm =  ttm + n;
				print++;
			}
			
		}while(n!=0);
		
		print = print-1;
		media= ttm/print;
		System.out.println("\n A media dos numero multiplos de 03 digitado foi: " + media);
	}

}
