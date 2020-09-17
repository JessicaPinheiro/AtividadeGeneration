/*4. Implemente a classe Administrador como subclasse da classe pessoa. Um determinado administrador tem 
 * como atributos da classe Pessoa e tamb�m os atributos pr�prios como ajudaDeCusto (ajudas referentes a 
 * viagens, estadias).*/

package Atividade170820;

public class Administrador extends Pessoa {
	private float ajudaDeCusto; 
	
	
	
	
	public Administrador (String nome, String endere�o, String telefone, float ajudaDeCusto)
	{
		super(nome, endere�o,telefone);
		this.ajudaDeCusto = ajudaDeCusto;
		
	}




	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}




	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}


}
