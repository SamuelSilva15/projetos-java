package For;

import java.util.Scanner;

public class Exer07 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o 1º valor: ");
        double valor1 = scan.nextDouble();
        System.out.println("Insira o 2º valor: ");
        double valor2 = scan.nextDouble();
        System.out.println("Insira o 3º valor: ");
        double valor3 = scan.nextDouble();
        System.out.println("Insira o 4º valor: ");
        double valor4 = scan.nextDouble();

        double valores [] = new double [4];
        valores [0] = valor1;
        valores [1] = valor2;
        valores [2] = valor3;
        valores [3] = valor4;

        double maiorvalor  = 0;

        for(int i = 0; i < valores.length; i++){
            if(valores[i] > maiorvalor ){
                maiorvalor = valores[i];
            }
        }

        System.out.println("O maior valor é: " + maiorvalor);
    }
}

