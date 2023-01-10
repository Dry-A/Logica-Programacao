package Arrays;

public class Vetor1209 {
	/*
	 * 1. Faça um programa que possua um vetor denominado A que armazene 6 números
	 * inteiros. O programa deve executar os seguintes passos: 1. Atribua os
	 * seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 2. Armazene em uma
	 * variável inteira (simples) a soma entre os valores das posições A[0], A[1] e
	 * A[5] do vetor e mostre na tela esta soma. 3. Modifique o vetor na posição 4,
	 * atribuindo a esta posição o valor 100. 4. Mostre na tela cada valor do vetor
	 * A, um em cada linha.
	 */

	public static void main(String[] args) {

		int[] A = { 1, 0, 5, -2, -5, 7 };
		int[] B = new int[1];
		int x;

		System.out.println("a)Atribuindo os valores {1,0,5,-2,-5,7} à matriz A");
		B[0] = A[0] + A[1] + A[5];

		System.out.println("b)Somando os elementos A[0],A[1] e A[5], resultando na matriz B = " + B[0]);
		A[3] = 100;
		System.out.println("c)Atribuindo o valor 100 à A[3]");
		System.out.println("d)Imprimindo os valores do vetor A:\n");
		for (x = 0; x < 6; x++) {
			System.out.println("A[" + x + "]= " + A[x]);

		}
	}

}
