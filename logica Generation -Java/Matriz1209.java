package Arrays;

import java.util.Scanner;

public class Matriz1209 {

	/*
	 * Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela
	 * possui.
	 */

	public static void main(String[] args) {

		float[][] matriz = new float[3][3];
		int linha, coluna, cont10 = 0;

		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Digite o elemento M[%d][%d]: ", linha + 1, coluna + 1);
				matriz[linha][coluna] = leia.nextFloat();

			}
		}

		System.out.println("Os elementos da matriz maiores que 10 são:");
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if (matriz[linha][coluna] > 10) {
					cont10++;
					System.out.println(matriz[linha][coluna]);

				}
			}
		}

		System.out.println("A quantidade de números maior que 10 é de: " + cont10);

	}

}