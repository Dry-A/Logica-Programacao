package fundamentos;

public class laçoDeRepetiçãoFor {

	public static void main(String[] args) {

		int x, soma=0;

		for (x = 1; x <= 10; x++) {
			System.out.printf("\n %d", x); // para arredondar

			soma = soma + x;
			
		}
		
		System.out.printf("\nSoma total: %d", soma);
	}

}
