import java.util.Scanner;
public class Exerc12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira seu salário: ");
        double salario = scan.nextDouble();

        if (salario <= 900.00) {

            System.out.println("Isento");
        }

        else if (salario > 900.00 &&salario <= 1500.00) {
            System.out.println("Seu salário atual: " + salario);
            System.out.println("Desconto do IR (5%): " + (salario - (salario - salario * 5/100)));
            System.out.println("Desconto do Sindicato (3%): " + (salario - (salario - (salario *3/100))));
            System.out.println("Desconto do FGTS (11%): " + (salario - (salario - salario * 5/100) - salario *3/100  +  - salario * 11/100));
            System.out.println("Salário líquido: " + ((salario - (salario * 5/100) - salario *3/100 - salario * 11/100)));

        }

        else if (salario > 1500.00 &&salario <= 2500.00) {
            System.out.println("Seu salário atual: " + salario);
            System.out.println("Desconto do IR (10%): " + (salario - (salario - salario * 10/100)));
            System.out.println("Desconto do Sindicato (3%): " + (salario - (salario - (salario *3/100))));
            System.out.println("Desconto do FGTS (11%): " + (salario - (salario - salario * 10/100) - salario *3/100  +  - salario * 11/100));
            System.out.println("Salário líquido: " + ((salario - (salario * 10/100) - salario *3/100 - salario * 11/100)));

        }

        else if (salario > 2500.00 ) {
            System.out.println("Seu salário atual: " + salario);
            System.out.println("Desconto do IR (20%): " + (salario - (salario - salario * 20/100)));
            System.out.println("Desconto do Sindicato (3%): " + (salario - (salario - (salario *3/100))));
            System.out.println("Desconto do FGTS (11%): " + (salario - (salario - salario * 20/100) - salario *3/100  +  - salario * 11/100));
            System.out.println("Salário líquido: " + ((salario - (salario * 20/100) - salario *3/100 - salario * 11/100)));

        }
    }
}