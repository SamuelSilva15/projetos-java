package Somatório;

import java.util.Scanner;

public class TesteSomatório {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        int valor = scan.nextInt();

        Somatório.somatorio(valor);

    }
}
