package Aula12;

import java.util.Scanner;

public class Aula12 {

    public static void main(String[] main){
        Scanner scan = new Scanner(System.in);
        Lista lista = new Lista();

        double numero = 0;
        for (int i = 0; i <= 10; i++){
            System.out.println("Insira o" + i++ + "numero");
            numero = scan.nextDouble();
        }

        if(numero % 2 == 0){
            System.out.println("Empilhando o número: " + numero);
            lista.empilha(numero);

        } else {
            lista.desempilha(numero);
            if(lista.estaVazia()){

            } else {

            }
        }
    }
}