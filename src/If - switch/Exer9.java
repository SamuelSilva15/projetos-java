import java.util.Scanner;
public class Exer9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o 1° número:");
        double n1 = scan.nextDouble();
        System.out.println("Insira o 2° número:");
        double n2 = scan.nextDouble();
        System.out.println("Insira o 3° número:");
        double n3 = scan.nextDouble();

        if (n1 <= n2 && n1 <= n3 && n2 <= n3) {

            System.out.println("Em ordem decrescente:" + n3 + " - " + n2 + " - "+ n1);
        }
        else if (n3 <= n1 && n3 <= n2 && n1 <= n2) {

            System.out.println("Em ordem decrescente:" + n1 + n2+ n3);
        }
        else if (n3 <= n1 && n3 <= n2 && n2 <= n1) {

            System.out.println("Em ordem decrescente:" + n1 + n2 + n3);
        }
    }
}