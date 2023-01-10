package Logica2;

import java.util.Scanner;

public class parImpar {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int x;

        System.out.println("Digite um numero:");
        x = leia.nextInt();

        if (x%2==0){
            System.out.println("Número par");

        }else{
            System.out.println("O número é ímpar");
        }


    }
}
