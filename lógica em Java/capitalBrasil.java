package Logica2;

import java.util.Objects;
import java.util.Scanner;

public class capitalBrasil {
    public static void main(String[] args) {

        Scanner leia  = new Scanner(System.in);

        String capital;

        System.out.println("Entre com o nome da capital do Brasil: ");
        capital = leia.next();

        if (Objects.equals(capital, "Brasília")){

            System.out.println("Parabéns!");
        }else{
            System.out.println("Errou!");
        }
    }

}
