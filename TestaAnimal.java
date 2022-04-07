package br.com.generation.exercicio.heranca;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro Cachorro01 = new Cachorro ("Koda", 5, "AU AU", "Correr");
		Preguica Preguica01 = new Preguica ("Pri", 2, "Z z z", "Subir árvore");
		Animal Filhote01 = new Cavalo ("Pocotó", 3, "Relincha", "Correr");
		
		
		
		System.out.println(Cachorro01.getNome());
		System.out.println(Filhote01.getIdade());
		System.out.println(Preguica01.getSom());
		
	}
	
	

}
