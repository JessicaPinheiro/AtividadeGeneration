/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.*/


package Atividades;

import java.util.Scanner;

public class Questcinc {

	public static void main ( String args [])
	{
		Scanner ler = new Scanner(System.in);
		float n1,n2,n3,med;
		System.out.println("Entre com a n1: ");
		n1 = ler.nextInt();
		System.out.println("Entre com a n2: ");
		n2 = ler.nextInt();
		System.out.println("Entre com a n3: ");
		n3 = ler.nextInt();
		med= (n1*2+n2*3+n3*5)/10;
		System.out.println("\nOla! \n" + "Sua media ponderada final foi: " + med);
	}
}
