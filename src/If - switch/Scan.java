import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));
        System.out.println("Insira a nota 1: ");
        double valor1 = scan.nextDouble();
        System.out.println("Insira a nota 2: ");
        double valor2 = scan.nextDouble();

        if ((valor1 + valor2) / 2 <= 9 ) {
            System.out.println("Aprovado");
        }
         else if ((valor1 + valor2) / 2 < 7) {

                System.out.println("Reprovado");
            }
         else if  ((valor1 + valor2) / 2 == 10) {

                System.out.println("Brabo");
            }


        }
    }
