package For;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args){

        int numeros = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o 1º valor: ");
        int valor1 = scan.nextInt();
        System.out.println("Insira o 2º valor: ");
        int valor2 = scan.nextInt();
        System.out.println("Insira o 3º valor: ");
        int valor3 = scan.nextInt();
        System.out.println("Insira o 4º valor: ");
        int valor4 = scan.nextInt();
        System.out.println("Insira o 5º valor: ");
        int valor5 = scan.nextInt();
        System.out.println("Insira o 6º valor: ");
        int valor6 = scan.nextInt();
        System.out.println("Insira o 7º valor: ");
        int valor7 = scan.nextInt();
        System.out.println("Insira o 8º valor: ");
        int valor8 = scan.nextInt();
        System.out.println("Insira o 9º valor: ");
        int valor9 = scan.nextInt();
        System.out.println("Insira o 10º valor: ");
        int valor10 = scan.nextInt();

        int valores [] = new int [10];

        valores [0] = valor1;
        valores [1] = valor2;
        valores [2] = valor3;
        valores [3] = valor4;
        valores [4] = valor5;
        valores [5] = valor6;
        valores [6] = valor7;
        valores [7] = valor8;
        valores [8] = valor9;
        valores [9] = valor10;


        for (int i = 0; i < valores.length; i++){
            if(valores[i] % 2 == 0){
                System.out.print("Par: " + " " + valores[i]);
                System.out.println();
            }
            else {

                System.out.println("Impar: " + " " + valores[i]);
            }

        }



    }
}
