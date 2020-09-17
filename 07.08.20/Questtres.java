
/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos
 *  e mostre-o expresso em horas, minutos e segundos. */


package Atividades;


import java.util.Scanner;

public class Questtres {

	public static void main ( String args [])
	{
		Scanner ler = new Scanner(System.in);
		int h,m,s,st;
		System.out.println("Quantos segundos durou o evento: ");
		st = ler.nextInt();
		h= st/3600;
		m= (st%3600)/60;
		s= m/60;
		System.out.println("O evento teve uma duração de: " + h + ":" + m +":" + s + ".");
	}

}