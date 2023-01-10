package LetsCode;

public class ifelseifletscode {

	public static void main(String[] args) {

		int nota = 100;
		String graduacao;

		if (nota >= 80) {
			graduacao = "A";
		} else if (nota < 80 && nota >= 70) {
			graduacao = "B";
		} else if (nota < 70 && nota >= 60) {
			graduacao = "C";
		} else if (nota < 60 && nota >= 50) {
			graduacao = "C";
		} else {
			graduacao = "";
		}
		// escolha caso
		switch (graduacao) {
		case "A":
		case "B":
			System.out.println("Aluno aprovado!");
			break;
		case "C":
			System.out.println("Não aprovado, sinto muito");
			break;
		default:
			System.out.println("Graduação Inválida!");
		}

	}

}
