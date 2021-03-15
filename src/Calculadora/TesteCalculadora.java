package Calculadora;

import java.util.Scanner;

public class TesteCalculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Qual operação deseja fazer: s - m - v - d - p - f");
        String operacao = scan.next();
        if (operacao.equalsIgnoreCase("F")) {
            System.out.println("Insira o primeiro valor: ");
            int valor1 = scan.nextInt();
            Calculadora.fatoriar(valor1);

        } else {
            System.out.println("Insira o primeiro valor: ");
            double valor1 = scan.nextDouble();
            System.out.println("Insira o segundo valor: ");
            double valor2 = scan.nextDouble();

            if (operacao.equalsIgnoreCase("S")) {

                Calculadora.somar(valor1, valor2);
            } else if (operacao.equalsIgnoreCase("M")) {

                Calculadora.subtrair(valor1, valor2);
            } else if (operacao.equalsIgnoreCase("V")) {

                Calculadora.multiplicar(valor1, valor2);
            } else if (operacao.equalsIgnoreCase("D")) {

                Calculadora.dividir(valor1, valor2);

            } else if (operacao.equalsIgnoreCase("P")) {

                Calculadora.potenciar(valor1, valor2);

            }

            else {

                System.out.println("Inválido!");
            }
        }
    }
}
