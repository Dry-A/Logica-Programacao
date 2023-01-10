package Logica2;

import java.util.Scanner;

public class condicionalMultaTransito {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double velocidade, multaLeve, multaMedia, multaGrave, multaGravissima;

        multaLeve = 50 * 1.1; //acrescentar 10%
        multaGrave = 90;
        multaMedia = 70;
        multaGravissima = 110;

        System.out.println("Qual velocidade você passou no radar ?");
        velocidade = leia.nextDouble();

        if (velocidade<= multaLeve){
            System.out.println("isento");
        } else if (velocidade <= multaMedia) {
            System.out.println("3 pontos na carteira");
        } else if (velocidade <= multaGrave) {
            System.out.println("4 pontos na carteira");
        } else if (velocidade <=multaGravissima) {
            System.out.println("7 pontos na carteira");
        }

        }

    }
