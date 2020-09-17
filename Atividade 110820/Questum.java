/*Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos 
resto = 5. (FOR)*/


package Atividade110820;

import java.util.Scanner;

public class Questum 
{

	public static void main (String argrs[])
	{
		Scanner ler = new Scanner(System.in);
		int x;
		
		for (x=1000;x<=1999;x++)
		{
			if (x%11==5)
			{
				System.out.println(x);
			}
		}
	}
	
}
