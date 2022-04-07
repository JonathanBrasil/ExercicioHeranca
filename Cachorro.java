package br.com.generation.exercicio.heranca;

public class Cachorro extends Animal{
	
	private String som;
	private String a��o;
	
	public Cachorro (String nome, int idade, String som, String a��o)
	{
		super(nome, idade);
		this.som = som;
		this.a��o = a��o;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getA��o() {
		return a��o;
	}

	public void setA��o(String a��o) {
		this.a��o = a��o;
	}
	
	

}
