import java.util.Scanner;

public class Exer20 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Alcool ou Gasolina");
        String nome = scan.next();
        System.out.println("Valor da compra: ");
        double valor = scan.nextDouble();

        if (nome.equals("Alcool") && valor <= 20 && valor > 0) {

            System.out.println("Valor do desconto: " + (valor * 1.90*3/100));
            System.out.println("Valor a ser pago: " + (valor*1.90  + ((-valor * (1.90*3/100)))));

        }

        if (nome.equals("Alcool") && valor > 20) {

            System.out.println("Valor do desconto: " + (valor * 1.90*5/100));
            System.out.println("Valor a ser pago: " + (valor*1.90  + ((-valor * (1.90*5/100)))));

        }

        if (nome.equals("Gasolina") && valor <= 20 && valor > 0) {

            System.out.println("Valor de desconto: " + (valor - 2.50*4/100));
            System.out.println("Valor a ser pago: " + (valor*2.50 + ((-valor - 2.50*4/100))));
        }

        if (nome.equals("Gasolina") && valor > 20) {

            System.out.println("Valor de desconto: " + (valor - 2.50*6/100));
            System.out.println("Valor a ser pago: " + (valor*2.50 + ((-valor - 2.50*6/100))));

        }


    }
}
