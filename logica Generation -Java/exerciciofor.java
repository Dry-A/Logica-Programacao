package fundamentos;

import java.util.Scanner;

public class exerciciofor {

	public static void main(String[] args) {

		float n1, n2, n3, media, somaMedia = 0, mg;
		int x;

		Scanner leia = new Scanner(System.in);

		for (x = 1; x <= 3; x++) {

			System.out.println("\nDigite a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nDigite a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nDigite a terceira nota: ");
			n3 = leia.nextFloat();

			media = (n1 + n2 + n3) / 3;
			System.out.printf("\nA Média Aritmética: %.2f", media);
			somaMedia += media;
		}

		mg = somaMedia / 3;
		System.out.printf("\nA Média geral: %.2f", mg);
	}
}