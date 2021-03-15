package For;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o 1º valor: ");
        double valor1 = scan.nextDouble();
        System.out.println("Insira o 2º valor: ");
        double valor2 = scan.nextDouble();
        System.out.println("Insira o 3º valor: ");
        double valor3 = scan.nextDouble();
        System.out.println("Insira o 4º valor: ");
        double valor4 = scan.nextDouble();

        double valores[] = new double[4];
        valores[0] = valor1;
        valores[1] = valor2;
        valores[2] = valor3;
        valores[3] = valor4;

        double soma = valor1 + valor2 + valor3 + valor4;
        System.out.println("Soma: " + soma);
        System.out.println("Soma: " + soma/ 4);


    }
}