package fundamentos;

import java.util.Scanner;

public class CondicionalComposto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		String nome;

		System.out.println("Entre com a sua idade: ");
		idade = leia.nextInt();
		leia.nextLine();
		System.out.println("Entre com seu nome: ");
		nome = leia.nextLine();
		// precisa limpar o buffer, 3 linhas acima.
		System.out.printf("\nSeu nome: %s", nome); // %s - string
		System.out.printf("\nSua idade: %d", idade);

		if (idade >= 18) {

			System.out.println("\nParabéns, Você é maior de idade!");
		} else if (idade>1 && idade <18){ // senao composto

			System.out.println("\nVocê é menor de idade.");
		}
		else {//laço aninhado
			
			System.out.println("\nVocê entrou com uma idade inválida");
		}

	}

}
