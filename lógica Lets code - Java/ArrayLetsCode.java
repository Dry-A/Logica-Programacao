package LetsCode;

public class ArrayLetsCode {

	public static void main(String[] args) {
		// declarando array de inteiro de números de 1 a 5

		int[] numeros = new int[5]; // é assim que declara um array
		// o primeiro índice é o zero, o último é o 4.
		numeros[0] = 9;
		numeros[1] = 10;
		numeros[2] = 16;
		numeros[3] = 42;
		numeros[4] = 18;

		// Para imprimir os numeros do array usasse o laço for
		for (int i = 0; i < numeros.length; i++) {
			;
			System.out.println(numeros[i]);
		}
	}

}
