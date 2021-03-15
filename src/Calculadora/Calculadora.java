package Calculadora;

public class Calculadora {

    static void somar(double valor1, double valor2) {

        double soma = valor1 + valor2;
        System.out.println(soma);
    }

    static void subtrair (double valor1, double valor2){


        double subtracao = valor1 - valor2;
        System.out.println(subtracao);
    }

    static void multiplicar (double valor1, double valor2){

        double multiplicacao = valor1 * valor2;
        System.out.println(multiplicacao);
    }

    static void dividir (double valor1, double valor2){

        double divisao = valor1 / valor2;
        System.out.println(divisao);
    }

    static void potenciar (double valor1, double valor2){

        double potencia = Math.pow(valor1, valor2);
        System.out.println(potencia);
    }


    static void fatoriar (int valor1){
        int total = 1;
        for (int i = valor1; i > 1; i--){
            total *= i;
            System.out.println(total);
        }

    }
}