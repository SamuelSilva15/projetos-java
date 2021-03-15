import java.util.Scanner;
public class Exer11 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o salário do funça:");
        double salario = scan.nextDouble();

        if (salario <= 280) {
            System.out.println("Seu salário atual: " + salario);
            System.out.println("O percentual a ser ajustado é: " + "20%");
            System.out.println("O aumento é de: " + (salario *20/100));
            System.out.println("Seu salário com reajuste: " + (salario + salario *20/100));
        }

        else if (salario >= 280 && salario < 700) {
            System.out.println("Seu salário atual: " + salario);
            System.out.println("O percentual a ser ajustado é: " + "15%");
            System.out.println("O aumento é de: " + (salario *15/100));
            System.out.println("Seu salário com reajuste: " + (salario + salario *15/100));
        }

        else if (salario >= 700 && salario < 1500) {
            System.out.println("Seu salário atual: " + salario);
            System.out.println("O percentual a ser ajustado é: " + "10%");
            System.out.println("O aumento é de: " + (salario *10/100));
            System.out.println("Seu com reajuste: " + (salario + salario *10/100));
        }

        else if (salario >= 1500) {
            System.out.println("Seu salário atual: " + salario * (salario *5/100));
            System.out.println("O percentual a ser ajustado é: " + "5%");
            System.out.println("O aumento é de: " + (salario *5/100));
            System.out.println("Seu salário reajuste: " + (salario + salario *5/100));
        }

    }
}
