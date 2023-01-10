package fundamentos;

import java.util.Scanner;

public class EntradaSaídaDeDados {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int a, b, soma;
		System.out.println("Digite um numero: ");
		a = ler.nextInt();
		System.out.println("Digita segundo número: ");
		b = ler.nextInt();

		soma = a + b;
		System.out.println("A soma é: " + soma);
	}

}
