import java.util.Scanner;
public class Exer7 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o número 1:");
        double n1 = scan.nextDouble();
        System.out.println("Insira o número 2");
        double n2 = scan.nextDouble();
        System.out.println("Insira o número 3");
        double n3 = scan.nextDouble();

        if (n1 > n2 && n1 > n3) {

            System.out.println("Maior número:" + n1);
        }
        else if (n2 >= n1 && n2 >= n3) {

            System.out.println("Maior número:" + n2);
        }
        else if (n3 >= n1 && n3 >= n3) {

            System.out.println("Maior número:" + n3);
        }

        if (n1 <= n2 && n1 <= n3) {

            System.out.println("Menor número:" + n1);
        }
        else if (n2 <= n1 && n2 <= n3) {

            System.out.println("Menor número:" + n2);
        }
        else if (n3 <= n1 && n3 <= n3) {

            System.out.println("Menor número:" + n3);
        }

    }

    }

