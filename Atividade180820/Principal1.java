package Atividade180820;

public class Principal1 {
	
	 public static void maim (String args[]) {
		 Cavalo cavalo = new Cavalo();
		 Cachorro cachorro = new Cachorro();
		 Preguica preguica = new Preguica(); 
		 
		 cavalo.setNome("Pocotó");
		 cavalo.setIdade(05);
		 cavalo.setSom("Bruuu");
		 cavalo.setCorrer(50);
		 
		 cachorro.setNome("Xolo");
		 cachorro.setIdade(18);
		 cachorro.setSom("Auuuuuu");
		 cachorro.setCorrer(15);
		 
		 preguica.setNome("Jessinha");
		 preguica.setIdade(22);
		 preguica.setSom("Zzzzz");
		 preguica.setSubirEmArvore("não sobe em arvores, pois ela esta com preguiça");
		 
		 
		 System.out.println("O cavalo "+ cavalo.getNome()+ " tem " + cavalo.getIdade() + " anos " + " e corre em uma velocidade  de " + cavalo.getCorrer()+ "km/h");
		 System.out.println("O cachorro"+ cachorro.getNome()+ " tem " + cachorro.getIdade() + " anos " + " e corre em uma velocidade  de " + cachorro.getCorrer()+ "km/h");
		 System.out.println("A preguiça "+ preguica.getNome()+ " tem " + preguica.getIdade() + " anos " + preguica.getSubirEmArvore()+ ".");
	 
	 }

}
