/*2. Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe Fornecedor. 
 * Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos que caracterizam a 
 * classe Pessoa, os atributos valorCredito (correspondente ao cr�dito m�ximo atribu�do ao fornecedor) 
 * e valorDivida (montante da d�vida para com o fornecedor). Implemente na classe Fornecedor, para al�m 
 * dos usuais m�todos seletores e modificadores, um m�todo obterSaldo() que devolve a diferen�a entre os 
 * valores dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor, crie um 
 * programa de teste adequado que lhe permita verificar o funcionamento dos m�todos implementados na 
 * classe Fornecedor e os herdados da classe Pessoa.*/



package Atividade170820;


public class Fornecedor extends Pessoa{
	
	private float valorCredito;
	private float valorDivida;
	private float obterSaldo;
	
	

	// construtor
	public Fornecedor (String nome, String endere�o, String telefone,float valorCredito, float valorDivida,float obterSaldo)
	{
		super(nome,endere�o,telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.obterSaldo = valorCredito - valorDivida;
	}



	public float getValorCredito() {
		return valorCredito;
	}



	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}



	public float getValorDivida() {
		return valorDivida;
	}



	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}



	public float getObterSaldo() {
		return obterSaldo;
	}



	public void setObterSaldo(float obterSaldo) {
		this.obterSaldo = obterSaldo;
	}
	
	
}
