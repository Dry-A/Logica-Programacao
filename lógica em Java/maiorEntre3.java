package Logica2;

import java.util.Scanner;

public class maiorEntre3 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int x, y, z;

        System.out.println("Entre com o primeiro numero");
        x = leia.nextInt();
        System.out.println("Entre com o segundo numero");
        y = leia.nextInt();
        System.out.println("Entre com o terceiro numero");
        z = leia.nextInt();

        if(x>y && x>z){
            System.out.println(x+" o primeiro numero digitado é o maior numero entre eles");
        } else if (y>x&&y<z) {
            System.out.println(y+" , o segundo numero digitado é o maior entre eles");

        }else{
            System.out.println("O maior numero é o terceiro "+z);
        }

    }
}
