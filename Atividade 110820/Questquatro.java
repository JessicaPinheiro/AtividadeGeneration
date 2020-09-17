/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas 
 * dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado:
 *  idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa 
 *  era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se 
 *  para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e 
 *  mostre: (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.
*/

package Atividade110820;

import java.util.Scanner;

public class Questquatro {
	
	public static void main (String argrs[])
	{
		
	Scanner ler = new Scanner(System.in);
	int id,sx,fp, x=1 , pcl=0, mner=0, hagre=0, outrcal=0, pcal40=0, pcal18=0; 

	while (x<=150)
	
	{
		System.out.println("Entre com sua idade: ");
		id= ler.nextInt();
		System.out.println("Qual o seu sexo? \nDigite... \n1-feminino  \n2-masculino \n3-Outros");
		sx= ler.nextInt();
		System.out.println("Entre com um fator psicologico.... \nDigite... \\n1- Calma(o) \\n2- Nervosa(o) \\n3- Agressiva(o");
		fp= ler.nextInt();
		
		if (fp==1)
		{
			pcl++;
		}
		if (sx==2 && fp==2)
		{
			mner++;
		}
		if (sx==2 && fp==3)
		{
			hagre++;
		}
		if (sx==3 && fp==1)
		{
			outrcal++;
		}
		if (id>=40 && fp==3)
		{
			pcal40++;
		}
		if (id<18 && fp==1)
		{
			pcal18++;
		}
		x++;
	}
	
	
	System.out.println("\nO número de pessoas calmas " + pcl);
	System.out.println("\nO número de mulheres nervosas " + mner);
	System.out.println("\nO número de homens agressivos " + hagre);
	System.out.println("\nO número de outros calmos " + outrcal);
	System.out.println("\nO número de pessoas nervosas com mais de 40 anos " + pcal40);
	System.out.println("\nO número de pessoas calmas com menos de 18 anos " + pcal18);
}
}

	
