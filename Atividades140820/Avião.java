/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/


package Atividades140820;

public class Avião {
	
		//atributos
		private String MarcaAeronave ;
		private String cor ;
		private double Velocidademax;
		
		
		public Avião (String primeiro, String segundo, double terceiro)
		{
		//método 	
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
