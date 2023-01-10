package LetsCode;

import java.util.Arrays;

public class ArrayComString {
	public static void main(String[] args) {
		
		/*
		 * String[] frutas = new String[8];
		 * 
		 * futas[0] = "maça"; futas[1] = "uva"; futas[2] = "banana"; futas[3] = "manga";
		 * futas[4] = "cereja"; futas[5] = "maçã"; futas[6] = "melão"; futas[7] =
		 * "melancia";
		 */

		String[] frutas = { "maçã", "banana", "uva", "mexerica", "abacaxi", "melão" };// nem precisa definir o tamanho
//		for(int i=0; i < frutas.length; i++) {// não precisa de laço pra imprimir, só um exemplo
		// System.out.println(frutas[i]);
//		}
		// se quiser imprimir sem o laço:
		System.out.println(Arrays.toString(frutas));

	}

}
