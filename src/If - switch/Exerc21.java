import java.util.Scanner;
public class Exerc21 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual fruta deseja? ");
        String fruta = scan.next();
        System.out.println("Quantos Kg? ");
        double kg = scan.nextDouble();

        double precom = (2.50*kg);
        double precoma = (1.80*kg);

        if (fruta.equals("Morango") || precom > 25.00) {
            System.out.println("Fruta: " + fruta);
            System.out.println("Quilograma: " + kg);
            System.out.println("Valor de desconto: " + precom*10/100);
            System.out.println("Valor a ser pago: " + (precom + ((-precom*10/100))));
        }

        else if (fruta.equals("Maçã") || precoma > 25.00) {
            System.out.println("Fruta: " + fruta);
            System.out.println("Quilograma: " + kg);
            System.out.println("Valor de desconto: " + precoma*10/100);
            System.out.println("Valor a ser pago: " + (precoma + ((-precoma*10/100))));
        }
    }

}
