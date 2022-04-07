package br.com.generation.exercicio.heranca;

public class Cavalo extends Animal{
	
	private String som;
	private String ação;
	
	public Cavalo (String nome, int idade, String som, String ação)
	{
		super(nome, idade);
		this.som = som;
		this.ação = ação;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getAção() {
		return ação;
	}

	public void setAção(String ação) {
		this.ação = ação;
	}
	
	

}
