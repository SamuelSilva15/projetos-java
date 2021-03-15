import java.util.Scanner;
public class Exerc15 {
    public static void main(String[] args){

            Scanner scan = new Scanner(System.in);
            System.out.println("Insira o valor de um dos lados do triângulo");
            int t1 = scan.nextInt();
            System.out.println("Insira o valor de um dos lados do triângulo");
            int t2 = scan.nextInt();
            System.out.println("Insira o valor de um dos lados do triângulo");
            int t3 = scan.nextInt();

            if (t1 + t2 > t3  && t1 + t3 > t2 && t2 + t3 > t1) {

                System.out.println("Podem formar um triângulo");
            }

            if (t1 + t2 < t3  && t1 + t3 < t2 && t2 + t3 < t1) {

                System.out.println("Não podem formar um triângulo");
            }

            else if (t1 == t2 && t2 == t3 && t1 == t3) {

                System.out.println("Podem formar um triângulo equilátero");
            }

            else if (t1 == t2 || t2 == t3 || t2 == t3) {

                System.out.println("Podem formar um triângulo isósceles");
            }

            else if (t1 != t3  &&  t2 != t3 && t3 != t1) {

                System.out.println("Podem formar um triângulo escaleno");
            }


        }
}
