/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a 
expressa apenas em dias.*/

package Atividades;

import java.util.Scanner; 
import java.util.StringJoiner;


public class Questum
{

	
		
		public static void main ( String args [])
		{
			Scanner ler = new Scanner(System.in);
			int a,m,d,soma;
			System.out.println("Quantos anos você tem? ");
			a = ler.nextInt();
			System.out.println("Quantos mês: ");
			m = ler.nextInt();
			System.out.println("E quandtos dias: ");
			d = ler.nextInt();
			a = a*365;
			m = m*30;
			soma = a+m+d;
			System.out.println("Sua idede em dias é: " + soma);
		}
}