package fundamentos;

import java.util.Scanner;

public class exerciciowhile {

	public static void main(String[] args) {

		int numeros, contPar = 0, contImpar = 0;

		Scanner ler = new Scanner(System.in);

		System.out.println("\nDigite um número: ");
		numeros = ler.nextInt();

		while (numeros != -99) {
			if (numeros % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
			System.out.println("\nEntre com um número: ");
			numeros = ler.nextInt();
		}
		System.out.println("\nVocê digitou " + contPar + " números pares!");
		System.out.println("\nE também digitou  " + contImpar + " números ímpares!");

	}

}
