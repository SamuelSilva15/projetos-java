import java.util.Scanner;
public class Exerc17 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o ano");
        int ano = scan.nextInt();

        if (ano % 100 != 0 && ano % 4 ==0){
            System.out.println(ano + " é bissexto");

        }

        else if (ano % 400 == 0) {
            System.out.println(ano + " é bissexto");

        }

        else  {
            System.out.println(ano + " não é bissexto");
        }
    }
}
