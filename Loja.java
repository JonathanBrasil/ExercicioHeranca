package br.com.generation.exercicio.heranca;

import java.util.Scanner;

//Essa é a minha Classe principal

public class Loja extends EstoqueLoja{

	public static void main(String[] args) {
		
		int opcao;
		Scanner leia = new Scanner(System.in);
		
		
		//TELINHA INICIAL
		
		System.out.println("=================================");
		System.out.println("==      Seja Bem Vinde!!!      ==");
		System.out.println("=================================");
		System.out.println();
		
		//DO: PARA REPITIR 
do {			
		System.out.println("O que deseja Fazer?");
		System.out.println();
		System.out.println("- Digite '1' para ver lista de produtos");
		System.out.println("- Digite '2' para adicionar  produto");
		System.out.println("- Digite '3' para editar produto");
		System.out.println("- Digite '4' para remover produto");
		System.out.println();
		System.out.println();
		System.out.println("ou digite '0' para encerrar...");
		opcao = leia.nextInt();
		
		
		//LISTA DE CONDICIONAIS
		
		if (opcao == 1) {
		//listar o estoque
		System.out.println();
		System.out.println();
		EstoqueLoja lista = new EstoqueLoja ();
		lista.listar();
				
		}
		
		if (opcao == 2) {
			//editar o estoque
				
				
			}
		
		if (opcao == 3) {
			//remover produto do estoque
				
				
			}
		
		if (opcao == 0) {
			//Encerrar o programa
			System.out.println();
			System.out.println("=================================");
			System.out.println("==       Volte Sempre!!!       ==");
			System.out.println("=================================");
			System.out.println();
			System.out.println("Encerrando.........");
				
			}
		
		else {
			System.out.println("***********************************");
			System.out.println();
			System.out.println("Por favor, digite uma opção válida!");
			System.out.println();
			System.out.println("***********************************");
			
		}
																					} while (opcao!=0);
		

		
		
leia.close();
	}
	

}
