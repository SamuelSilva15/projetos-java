import java.util.Scanner;
public class Exer14 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira nota 1:");
        double nota1 = scan.nextDouble();
        System.out.println("Insira nota 2:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) /2;
        if (media >= 9) {

            System.out.println("Média: A");
        }

        else if (media >= 7.5 && media < 9) {

            System.out.println("Média: B");
        }

        else if ( media >= 6.0 && media < 7.5) {

            System.out.println("Média: C");
        }

        else if (media >= 4.0 && media < 6) {

            System.out.println("Média: D");
        }

        else if (media <= 4.0 && media >= 0) {

            System.out.println("Média: E");
        }
    }
}
