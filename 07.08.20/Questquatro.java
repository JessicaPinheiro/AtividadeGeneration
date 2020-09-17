package Atividades;

import java.util.Scanner; 
import java.util.StringJoiner;
import java.math.*;

public class Questquatro
{
	
	
	public static void main ( String args [])
	{
		Scanner ler = new Scanner(System.in);
		int a,b,c,r,s,d;
		System.out.println("Entre com um numero positivo e inteiro: ");
		a = ler.nextInt();
		System.out.println("Entre com um numero positivo e inteiro: ");
		b = ler.nextInt();
		System.out.println("Entre com um numero positivo e inteiro: ");
		c = ler.nextInt();
		r=(int) Math.pow(a+b, 2);
		s=(int) Math.pow(b+c, 2);
		d = (r+s)/2;
		System.out.println("O valor de D é: " + d );
	}

}