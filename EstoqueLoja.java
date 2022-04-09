package br.com.generation.exercicio.heranca;

import java.util.ArrayList;
import java.util.Collection;

//Para apresentar os dados.

public class EstoqueLoja {

	public void listar () {
		
		@SuppressWarnings("unchecked")
		Collection<String> nomeProduto = new ArrayList();
		nomeProduto.add("Bolacha");
		nomeProduto.add("Pipoca");
		nomeProduto.add("Pãozinho");
		
		
		if(nomeProduto.isEmpty()) {
			System.out.println("Lista Vazia...");
		}
		else 
		{
			System.out.println("=================================");
			System.out.println("==      Lista de Produtos      ==");
			System.out.println("=================================");
			System.out.println();
			for (String lista:nomeProduto){
			System.out.println(lista);
			}
		
		}
		
		

	}

}
