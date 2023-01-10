package Logica2;

import java.util.Scanner;

public class maior {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int x, y;
        System.out.println("Entre com o primeiro numero: ");
        x = leia.nextInt();
        System.out.println("Entre com o segundo numero");
        y = leia.nextInt();

        if(x>y){

            System.out.println(x+"  é maior que " +y);
        }else if (x<y){
            System.out.println(y+" é maior que "+x);
        }else{
            System.out.println("Eles são iguais");
        }
    }
}
