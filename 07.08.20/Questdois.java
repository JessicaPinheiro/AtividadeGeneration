
/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em 
anos, meses e dias.*/


package Atividades;
import java.util.Scanner;

import java.util.StringJoiner;

public class Questdois {


	
	public static void main ( String args [])
	{
		Scanner ler = new Scanner(System.in);
		int a,m,d,soma,dt;
		System.out.println("Quantos dias de vida você tem? ");
		dt = ler.nextInt();
		a = dt/365;
		m = (dt%365)/30;
		d = (dt%365)%30;			
		System.out.println("Você tem : " + a + " anos " + m + " meses e " + d + " dias");
	}

}
