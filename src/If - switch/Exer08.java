import java.util.Scanner;
public class Exer08 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Valor do produto");
        double valor1 = scan.nextDouble();
        System.out.println("Valor do produto");
        double valor2 = scan.nextDouble();
        System.out.println("Valor do produto");
        double valor3 = scan.nextDouble();

        if (valor1 < valor2 && valor1 < valor3) {

            System.out.println("Mais em conta:" +valor1);
        }
        else if (valor2 <= valor1 && valor2 <= valor3) {

            System.out.println("Mais em conta:"+ valor2);
        }
        else if (valor3 <= valor1 && valor3 <= valor2) {

            System.out.println("Mais em conta:"+ valor3);
        }

    }
}
