/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/


package Atividade110820;

import java.util.Scanner;

public class Questtres 
{
	public static void main (String argrs[])
	{
		
	Scanner ler = new Scanner(System.in);
	int id, cont20=0, cont50=0; 
	
	System.out.println("Entre com sua idade: ");
	id= ler.nextInt();
	
	
		while (id>=-98)
		{
					
			if (id<21)
			{
				cont20= cont20+1;
			}
			
			if (id>50)
			{
				cont50= cont50+1;
			}
			System.out.println("Entre com sua idade: ");
			id= ler.nextInt();
		}
		System.out.println("O tatal de pessoas com menos de 21 anos foram: " + cont20);
		System.out.println("O tatal de pessoas com mais de 50 anos foram: " + cont50);
    }
}
