package LetsCode;

public class MaiorOuMenorComArray {

	public static void main(String[] args) {

		int[] numeros = { 9, 1580, 12, 225, 22 };
		int maior = numeros[0];
		int menor = numeros[0];
		int media = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}

			media += numeros[i];
			// += somar e atribuir
		}
		System.out.println("maior: " + maior);
		System.out.println("menor: " + menor);
		System.out.println("Media: " + media / numeros.length);
	}
}
