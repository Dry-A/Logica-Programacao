package LetsCode;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class ManipulandoData {

	public static void main(String[] args) {

		// olá, {nome}. Hoje é {dia-da-semana}. Bom dia
		// Iso 8601 - padrão mundial do horário

		String nome = "Josué";

		LocalDate hoje = LocalDate.now(); // representa data e não a Hora

		Locale brasil = new Locale("pt", "BR");

		// System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,
		// brasil));
		// para traduzir usa-se no dayofweek textstyle.full e importa java.util.Locale

		String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

		String saudacao;

		LocalDateTime agora = LocalDateTime.now();// infora que horas são no momento

		if (agora.getHour() >= 0 && agora.getHour() < 12) {
			saudacao = "Bom dia!";
		} else if (agora.getHour() >= 12 && agora.getHour() < 18) {
			saudacao = "Boa tarde";
		} else if (agora.getHour() >= 18 && agora.getHour() < 24) {
			saudacao = "Boa Noite";
		} else {
			saudacao = "Olá!";
		}

		System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
		// printf = define formato e valores. %s refere-se a String e depois vc marca o
		// que é cada %s - e %n faz a quebra de linha
	}

}
