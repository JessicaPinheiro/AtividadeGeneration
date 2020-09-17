/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/

package Atividades100820;

import java.util.Scanner;

public class Questtres {
	
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int id; 
		String nome;
		System.out.printf("Entre com seu nome: ");
		nome = ler.nextLine();
		System.out.printf("Entre com sua idade: ");
		id = ler.nextInt();
		
		if (id>=10 && id<=14)
		{
		System.out.printf("Você esta na categoria Infantil.");
		}
		
		if (id>=15 && id<=17)
		{
		System.out.printf("Você esta na categoria  Juvenil.");	
		}
		
		if (id>=18 && id<=25)
		{
		System.out.printf("Você esta na categoria Adulta.");	
		}	
		else
		{
			System.out.printf("Você não esta em nenhuma categoria. ");
		}
	}	
}
