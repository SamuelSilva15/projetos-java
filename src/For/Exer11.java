package For;

import java.util.Scanner;

public class Exer11 {

    public static void main (String[] args){
        int numero = 10;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tabuada deseja saber: ");
        int valor1 = scan.nextInt();


        for (int i = 0; i <= numero; i++){
            System.out.println(valor1 * i);


        }

    }
}
