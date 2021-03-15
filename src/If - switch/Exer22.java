import java.util.Scanner;
public class Exer22 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual carne deseja? ");
        System.out.println("1 - file duplo");
        System.out.println("2 - alcatra");
        System.out.println("3 - picanha");
        int carne = scan.nextInt();
        System.out.println("Quantos kg? ");
        double kg = scan.nextDouble();

        double precoKg = 0;

        if (carne == 1) {
           System.out.println(kg + "kg - file duplo");
            if(kg < 5) {

                precoKg = 4.9;
            } else {

                precoKg = 5.8;
            }
        }

        else if (carne == 2) {
            System.out.println(kg + "kg - Alcantra");
            if (kg <5 ) {

                precoKg = 5.9;
            } else {

                precoKg = 6.8;
            }
        }

        else if (carne == 3) {
            System.out.println(kg + "kg - Picanha");
            if (kg <5 ) {

                precoKg = 6.9;
            } else {

                precoKg = 7.8;
            }
        }

        double total = kg * precoKg;
        System.out.println(kg + "kg * " + precoKg + " = " + total );

        System.out.println("Compra no cartão? Digite 1 para sim");
        int cartao = scan.nextInt();

        if (cartao == 1){
            double desconto = (total/100) * 5;
            System.out.println("Desconto: " + desconto);
            System.out.println("Valor a pagar: " + (total - desconto));
        } else {
            System.out.println("Valor a pagar: " + total);
        }

    }
}
