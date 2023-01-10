package Logica2;

import java.util.Scanner;

public class ifCofreSenhaOperadorEeOu {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int a, b;

        System.out.println("Qual o primeiro numero? ");
        a = leia.nextInt();

        System.out.println("Qual o segundo numero?");
        b = leia.nextInt();

        if ((a==6 && b==2) || (a==8 && b==9)){

            System.out.println("Cofre aberto com sucesso");

        }else{
            System.out.println("Cofre não está aberto");
        }


    }
}

