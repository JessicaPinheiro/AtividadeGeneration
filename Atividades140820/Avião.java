/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/


package Atividades140820;

public class Avi�o {
	
		//atributos
		private String MarcaAeronave ;
		private String cor ;
		private double Velocidademax;
		
		
		public Avi�o (String primeiro, String segundo, double terceiro)
		{
		//m�todo 	
			MarcaAeronave=primeiro;
			cor=segundo;
			Velocidademax=terceiro;
		}
		
		public String getrelatorio() 
		{
			String relatorio = "Marca da aeronave:" + MarcaAeronave + "\nCor da aeronave: " + cor + "\nVelocidade maxima atingida: " + Velocidademax;
			return relatorio;
		}
	
	
	

}
