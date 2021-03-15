package For;

import java.util.Scanner;

public class Exer12 {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro o valor: ");
        double valor1 = scan.nextDouble();
        System.out.println("Insira o segundo o valor: ");
        double valor2 = scan.nextDouble();

        System.out.println(Math.pow(valor1, valor2));
    }
}
